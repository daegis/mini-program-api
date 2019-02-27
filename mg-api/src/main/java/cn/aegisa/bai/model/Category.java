package cn.aegisa.bai.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


/**
 * Category Entity.
 */
@Data
public class Category implements Serializable {

    @JSONField(name = "category_id")
    private Integer id;

    private String name;

    @JSONField(name = "parent_id")
    private Integer parentId;

    private String imgUrl;

    @JSONField(serialize = false)
    private LocalDateTime createTime;

    private List<Category> child;

}

