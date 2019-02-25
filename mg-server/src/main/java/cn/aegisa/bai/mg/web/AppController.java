package cn.aegisa.bai.mg.web;

import cn.aegisa.bai.mg.vo.base.*;
import cn.aegisa.bai.mg.vo.common.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2019/2/22 22:53
 */
@RestController
@Slf4j
@RequestMapping("/app")
public class AppController {

    @RequestMapping("/base")
    public ApiResponse getBaseInfo() {
        Color color = new Color();
        color.setText("#ffffff");
        color.setValue(20);
        NaviBar naviBar = new NaviBar();
        naviBar.setTopTextColor(color);
        naviBar.setTitle("卖花花");
        naviBar.setTopBackgroundColor("#965456");
        AppBase appBase = new AppBase(naviBar);
        return ApiResponse.success(appBase);
    }

    @RequestMapping("/index")
    public ApiResponse getIndexInfo() {
        IndexInfo indexInfo = new IndexInfo();
        Banner banner = new Banner();
        banner.setId("banner");
        BannerStyle style = new BannerStyle();
        style.setBtnColor("#ffffff");
        style.setBtnShape("round");
        banner.setStyle(style);
        BannerImg img1 = new BannerImg();
        img1.setImgName("img1");
        img1.setImgUrl("https://cdn.aegisa.cn/cefc5ec80c6d49308698cf24c2deb7ad9.JPG-small");
        BannerImg img2 = new BannerImg();
        img2.setImgName("img2");
        img2.setImgUrl("https://cdn.aegisa.cn/b1926c1a5ef34d00ad19d6c2f26887c72.jpeg-small");
        Map<String, BannerImg> imgMap = new HashMap<>();
        imgMap.put("img1", img1);
        imgMap.put("img2", img2);
        banner.setData(imgMap);
        indexInfo.getItems().put("banner", banner);
        return ApiResponse.success(indexInfo);
    }

}
