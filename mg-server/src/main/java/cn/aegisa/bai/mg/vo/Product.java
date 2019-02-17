package cn.aegisa.bai.mg.vo;

import lombok.Data;

/**
 * @author xianyingda@guazi.com
 * @serial
 * @since 2019-02-16 21:27
 */
@Data
public class Product {
    private Integer id;
    private String name;
    private String imgUrl;
    private Integer price;
}
