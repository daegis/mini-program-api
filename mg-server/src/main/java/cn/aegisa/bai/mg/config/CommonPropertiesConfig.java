package cn.aegisa.bai.mg.config;

import cn.aegisa.bai.mg.config.properties.WeixinProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-14 15:53
 */
@Configuration
@EnableConfigurationProperties({
        WeixinProperties.class})
public class CommonPropertiesConfig {

}
