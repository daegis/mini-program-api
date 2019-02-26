package cn.aegisa.bai.mg.vo.product;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * @author xianyingda@guazi.com
 * @serial
 * @since 2019-02-16 21:27
 */
@Data
public class Category {

    @JSONField(name = "category_id")
    private Integer id;
    private String name;
    @JSONField(name = "parent_id")
    private Integer parentId;
    private String imgUrl;
    private List<Category> child;
}
