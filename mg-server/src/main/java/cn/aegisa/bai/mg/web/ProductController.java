package cn.aegisa.bai.mg.web;

import cn.aegisa.bai.mg.vo.common.ApiResponse;
import cn.aegisa.bai.mg.vo.product.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping("/category/list")
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
        d1.setImgUrl("https://cdn.aegisa.cn/27b84489ac804173a36d6e80fc4737e9a.jpg");

        Category d2 = new Category();
        d2.setId(102);
        d2.setName("月季");
        d2.setParentId(1);
        d2.setImgUrl("https://cdn.aegisa.cn/c7d68c6853414ab99665db4b3e5a9546i.jpg");

        children.add(d1);
        children.add(d2);

        c1.setChild(children);

        return ApiResponse.success(categories);
    }

    @RequestMapping("/list")
    @ResponseBody
    public ApiResponse getProductList(HttpServletRequest request) {
        String categoryId = request.getParameter("category_id");
        log.info("查询商品列表的categoryId：{}", categoryId);

        return ApiResponse.success(null);
    }

}
