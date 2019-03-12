package cn.aegisa.bai.mg.service.impl;

import cn.aegisa.bai.mg.config.properties.WeixinProperties;
import cn.aegisa.bai.mg.service.UserService;
import cn.aegisa.bai.mg.vo.user.LoginResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-26 14:35
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private WeixinProperties weixinProperties;

    @Override
    public LoginResult doLogin(String code) {
        String url = weixinProperties.getLoginUrl();
        String fullUrl = url.replace("APPID", weixinProperties.getAppId())
                .replace("SECRET", weixinProperties.getAppSecret())
                .replace("JSCODE", code);
        RestTemplate restTemplate = new RestTemplate();
        String wxResponse = restTemplate.getForObject(fullUrl, String.class);
        JSONObject jsonObject = JSON.parseObject(wxResponse);
        String openid = jsonObject.getString("openid");
        LoginResult result = new LoginResult();
        if (StringUtils.isEmpty(openid)) {
            result.setSuccess(false);
            log.info("微信登录失败：{}", wxResponse);
            return result;
        }
        result.setSuccess(true);
        result.setToken("aaa");
        result.setUserId(1);
        return result;

    }
}
