package cn.aegisa.bai.mg.config;

import cn.aegisa.bai.mg.interceptor.UserTokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2019/2/22 22:58
 */
@Configuration
public class ApiWevMbcConfig implements WebMvcConfigurer {

    @Autowired
    private UserTokenInterceptor userTokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userTokenInterceptor).addPathPatterns("/**").order(Ordered.HIGHEST_PRECEDENCE);
    }
}
