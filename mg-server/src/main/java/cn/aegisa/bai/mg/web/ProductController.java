package cn.aegisa.bai.mg.web;

import cn.aegisa.bai.mg.service.ProductService;
import cn.aegisa.bai.mg.vo.common.ApiResponse;
import cn.aegisa.bai.model.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    private ProductService productService;

    @RequestMapping("/category/list")
    @ResponseBody
    public ApiResponse getCategoryList() {
        List<Category> categories = productService.getCategoryList();
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
