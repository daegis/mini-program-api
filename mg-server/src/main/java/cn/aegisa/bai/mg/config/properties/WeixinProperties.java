package cn.aegisa.bai.mg.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-18 11:25
 */
@Data
@ConfigurationProperties(prefix = "wx.bai")
public class WeixinProperties {
    private String appId;
    private String appSecret;
    private String loginUrl;
}
