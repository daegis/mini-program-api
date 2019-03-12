package cn.aegisa.bai.mg.vo.product;

import lombok.Data;

/**
 * @author daegis@yeah.net
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
