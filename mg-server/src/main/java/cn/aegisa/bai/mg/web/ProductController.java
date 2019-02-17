package cn.aegisa.bai.mg.web;

import cn.aegisa.bai.mg.vo.Category;
import cn.aegisa.bai.mg.vo.Product;
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
    public List<Category> getCategoryList() {
        List<Category> categories = new ArrayList<>();
        Category c1 = new Category();
        categories.add(c1);
        List<Product> p1 = new ArrayList<>();
        c1.setId(1);
        c1.setName("掌柜推荐");
        c1.setProductList(p1);
        for (int i = 0; i < 20; i++) {
            Product product = new Product();
            product.setId(i + 123);
            product.setName("喝爽是个小小怪");
            product.setPrice(0);
            product.setImgUrl("https://cdn.aegisa.cn/cefc5ec80c6d49308698cf24c2deb7ad9.JPG-small");
            p1.add(product);
        }
        Category c2 = new Category();
        categories.add(c2);
        List<Product> p2 = new ArrayList<>();
        c2.setId(2);
        c2.setName("惊涛骇浪");
        c2.setProductList(p2);
        for (int i = 0; i < 20; i++) {
            Product product = new Product();
            product.setId(i + 333);
            product.setName("我就是要吃炸酱面");
            product.setPrice(0);
            product.setImgUrl("https://cdn.aegisa.cn/444c32ac691a41289a238112af0f52600.jpeg-small");
            p2.add(product);
        }
        return categories;
    }

}
