package cn.aegisa.bai.mg.interceptor;

import cn.aegisa.bai.mg.vo.common.ApiResponse;
import cn.aegisa.bai.mg.vo.user.UserInfo;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2019/2/22 22:56
 */
@Component
@Slf4j
public class UserTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        boolean required = handlerMethod.hasMethodAnnotation(LoginRequired.class);
        String token = request.getParameter("token");
        if (required) {
            log.info("前台传入token：{}", token);
            if (StringUtils.isEmpty(token)) {
                fail(response);
                return false;
            }
            if ("aaa".equals(token)) {
                UserInfo userInfo = new UserInfo();
                userInfo.setId(1);
                userInfo.setName("Lily");
                UserContext.setUser(userInfo);
                return true;
            }
        }
        return true;
    }

    private void fail(HttpServletResponse response) {
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        try {
            response.getWriter().write(JSON.toJSONString(ApiResponse.fail("用户未登录")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        UserContext.finish();
    }
}
