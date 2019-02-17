package cn.aegisa.bai.mg.vo;

import lombok.Data;

import java.util.List;

/**
 * @author xianyingda@guazi.com
 * @serial
 * @since 2019-02-16 21:27
 */
@Data
public class Category {
    private Integer id;
    private String name;
    private List<Product> productList;
}
