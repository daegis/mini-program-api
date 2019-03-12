package cn.aegisa.bai.mg.service.impl;

import cn.aegisa.bai.mg.service.ProductService;
import cn.aegisa.bai.model.Category;
import cn.aegisa.spring.boot.mybatis.component.service.ICommonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-27 18:51
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ICommonService commonService;

    @Override
    public List<Category> getCategoryList() {
        List<Category> list = commonService.getList(Category.class);
        log.info("检索到{}条category数据", list.size());
        List<Category> leftCategory = list.stream().filter(o -> o.getParentId().equals(0)).collect(Collectors.toList());
        for (Category category : leftCategory) {
            List<Category> thisChildren = list.stream().filter(o -> o.getParentId().equals(category.getId())).collect(Collectors.toList());
            category.setChild(thisChildren);
        }
        return leftCategory;
    }
}
