package cn.aegisa.bai.mg.web;

import cn.aegisa.bai.mg.vo.common.ApiResponse;
import cn.aegisa.bai.mg.vo.product.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xianyingda@guazi.com
 * @serial
 * @since 2019-02-16 21:20
 */
@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/list")
    @ResponseBody
    public ApiResponse getCategoryList() {
        List<Category> categories = new ArrayList<>();
        Category c1 = new Category();
        c1.setId(1);
        c1.setName("鲜花");
        c1.setParentId(0);
        categories.add(c1);

        Category c2 = new Category();
        c2.setId(2);
        c2.setName("宝宝");
        c2.setParentId(0);
        categories.add(c2);

        List<Category> children = new ArrayList<>();
        Category d1 = new Category();
        d1.setId(101);
        d1.setName("菊花");
        d1.setParentId(1);

        Category d2 = new Category();
        d2.setId(102);
        d2.setName("月季");
        d2.setParentId(1);

        children.add(d1);
        children.add(d2);

        c1.setChild(children);

        return ApiResponse.success(categories);
    }

}
