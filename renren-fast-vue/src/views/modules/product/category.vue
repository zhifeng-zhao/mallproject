<template>
  <div>
    <el-switch v-model="draggable" active-text="开启拖拽" inactive-text="关闭拖拽">
    </el-switch>
    <el-button v-if="draggable" @click="batchSave">批量保存</el-button>
    <el-tree
      :data="menus"
      :props="defaultProps"
      :expand-on-click-node="false"
      show-checkbox
      node-key="catId"
      :default-expanded-keys="expandedKey"
      :draggable = "draggable"
      :allow-drop="allowDrop"
      @node-drop="handleDrop"
    >
      <span class="custom-tree-node" slot-scope="{ node, data }">
        <span>{{ node.label }}</span>
        <span>
          <el-button
            v-if="node.level <= 2"
            type="text"
            size="mini"
            @click="() => append(data)"
          >
            Append
          </el-button>
          <el-button type="text" size="mini" @click="edit(data)">
            Edit
          </el-button>
          <el-button
            v-if="node.childNodes.length == 0"
            type="text"
            size="mini"
            @click="() => remove(node, data)"
          >
            Delete
          </el-button>
        </span>
      </span>
    </el-tree>
    <el-dialog
      :title="title"
      :visible.sync="dialogVisible"
      width="30%"
      :close-on-click-modal="false"
    >
      <el-form :model="category">
        <el-form-item label="分类名称">
          <el-input v-model="category.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="图标">
          <el-input v-model="category.icon" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="计量单位">
          <el-input
            v-model="category.productUnit"
            autocomplete="off"
          ></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="submit">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      draggable: false,
      pCid: [],
      menus: [],
      updateNodes: [],
      category: {
        name: "",
        parentCid: 0,
        catLevel: 0,
        showStatus: 1,
        sort: 0,
        catId: null,
        icon: "",
        productUnit: "",
      },
      maxLevel: 0,
      dialogVisible: false,
      dialogType: "",
      title: "",
      expandedKey: [],
      defaultProps: {
        children: "children",
        label: "name",
      },
    };
  },
  methods: {
    getMenus() {
      this.dataListLoading = true;
      this.$http({
        url: this.$http.adornUrl("/product/category/list/tree"),
        method: "get",
      }).then(({ data }) => {
        console.log("成功获取数据", data);
        this.menus = data.data;
      });
    },
    append(data) {
      this.dialogType = "add";
      this.title = "添加";
      this.dialogVisible = true;
      this.category.parentCid = data.catId;
      this.category.catLevel = data.catLevel * 1 + 1;
      this.category.catId = null;
      this.category.name = "";
      this.category.icon = "";
      this.category.productUnit = "";
      this.category.sort = 0;
      this.category.showStatus = 1;
    },
    edit(data) {
      console.log("修改的数据", data);
      this.dialogType = "edit";
      this.title = "修改";
      this.dialogVisible = true;
      //发送请求获取当前最新数据、
      this.http({
        url: this.$http.adornUrl(`/product/category/info/${data.catId}`),
        method: "get",
        params: this.$http.adornParams({}),
      }).then(({ data }) => {
        this.category.name = data.data.name;
        this.category.catId = data.data.catId;
        this.category.icon = data.data.icon;
        this.category.productUnit = data.data.productUnit;
        this.category.parentCid = data.data.parentCid;
      });
    },
    submit() {
      if (this.dialogType == "add") {
        this.addCategory();
      }
      if (this.dialogType == "edit") {
        this.editCategory();
      }
    },
    handleDrop(draggingNode, dropNode, dropType, ev) {
      console.log("tree drop: ", draggingNode, dropNode, dropType);
      //最新父节点id
      let pCid = 0;
      let silbings = null;
      if (dropType == "before" || dropType == "after") {
        pCid =
          dropNode.data.parent.catId == undefined
            ? 0
            : dropNode.data.parent.catId;
        silbings = dropNode.parent.childNodes;
      } else {
        pCid = dropNode.data.catId;
        silbings = dropNode.childNodes;
      }
      this.pCid.push(pCid);
      //最新顺序
      for (let i = 0; i < silbings.length; i++) {
        if (silbings[i].data.catId == draggingNode.data.catId) {
          //遍历当前拖拽节点
          let catLevel = draggingNode.level;
          if (silbings[i].level != draggingNode.level) {
            //层级发送变化
            catLevel = silbings[i].level;
            this.updateChildNodesLevel(silbings[i]);
          }
          this.updateNodes.push({
            catId: silbings[i].data.catId,
            sort: i,
            parentCid: pCid,
          });
        } else {
          this.updateNodes.push({
            catId: silbings[i].data.catId,
            sort: i,
            catLevel: catLevel,
          });
        }
      }
    },
    batchSave(){
      //发送请求
      this.http({
        url: this.$http.adornUrl("/product/category/update/sort"),
        method: "post",
        data: this.$http.adornData(this.updateNodes, false),
      }).then(({ data }) => {
        this.$message({
          message: "菜单顺序修改成功",
          type: "success",
        });
        this.getMenus();
        this.expandedKey = this.pCid;
        this.updateNodes = [];
        this.maxLevel = 0;
      });
    },
    updateChildNodesLevel(node) {
      if (node.childNodes.length > 0) {
        for (let i = 0; i < node.childNodes.length; i++) {
          var cNode = node.childNodes[i].data;
          this.updateNodes.push({
            catId: cNode.catId,
            catLevel: node.childNodes[i].level,
          });
          this.updateChildNodesLevel(node.childNodes[i]);
        }
      }
    },
    allowDrop(draggingNode, dropNode, type) {
      this.countNodeLevel(draggingNode);
      let deep = Math.abs(this.maxLevel - draggingNode.level) + 1;
      if ((type = "inner")) {
        return deep + dropNode.level <= 3;
      } else {
        return deep + dropNode.parent.level <= 3;
      }
    },
    countNodeLevel(node) {
      //找出所有子节点，求最大深度
      if (node.childNodes != null && node.childNodes.length > 0) {
        for (let i = 0; i < node.childNodes.length; i++) {
          if (node.childNodes[i].level > this.maxLevel) {
            this.maxLevel = node.childNodes[i].level;
          }
          this.countNodeLevel(node.childNodes[i]);
        }
      }
    },
    //修改3级分类
    editCategory() {
      var { catId, name, icon, productUnit } = this.category;
      this.http({
        url: this.$http.adornUrl("/product/category/update"),
        method: "post",
        data: this.$http.adornData({ catId, name, icon, productUnit }, false),
      }).then(({ data }) => {
        this.$message({
          message: "菜单修改成功",
          type: "success",
        });
        this.dialogVisible = false;
        this.getMenus();
        this.expandedKey = [this.category.parentCid];
      });
    },
    //添加3级分类
    addCategory() {
      this.http({
        url: this.$http.adornUrl("/product/category/save"),
        method: "post",
        data: this.$http.adornData(this.category, false),
      }).then(({ data }) => {
        this.$message({
          message: "菜单保存成功",
          type: "success",
        });
        this.dialogVisible = false;
        this.getMenus();
        this.expandedKey = [this.category.parentCid];
      });
    },
    remove(node, data) {
      var ids = [data.catId];
      this.$confirm(`是否删除${data.name}菜单?`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      })
        .then(() => {
          this.$http({
            url: this.$http.adornUrl("/product/category/delete"),
            method: "post",
            data: this.$http.adornData(ids, false),
          }).then(({ data }) => {
            this.$message({
              message: "菜单删除成功",
              type: "success",
            });
            this.getMenus();
            this.expandedKey = [node.parent.data.catId];
          });
        })
        .catch(() => {});
    },
  },
  created() {
    this.getMenus();
  },
};
</script>

<style>
</style>