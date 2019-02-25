package cn.aegisa.bai.mg.vo.base;

import lombok.Data;

import java.util.Map;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2019/2/23 19:16
 */
@Data
public class Banner {
    private String id;
    private String type = "banner";
    private BannerStyle style;
    private Map<String, BannerImg> data;
}
