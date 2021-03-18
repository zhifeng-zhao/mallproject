package com.zzf.mallproject.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzf.mallproject.product.entity.BrandEntity;
import com.zzf.mallproject.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
class MallprojectProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("Apple");
//		brandService.save(brandEntity);
//		System.out.println("保存成功！");
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",9L));
		list.forEach((item) -> {
			System.out.println(item);
		});
	}

}
