package cn.aegisa.bai.mg.service.impl;

import cn.aegisa.bai.mg.service.AppService;
import cn.aegisa.bai.mg.vo.base.*;
import cn.aegisa.bai.model.AppProperty;
import cn.aegisa.bai.model.BannerImg;
import cn.aegisa.spring.boot.mybatis.component.service.ICommonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-27 19:20
 */
@Service
@Slf4j
public class AppServiceImpl implements AppService {

    @Autowired
    private ICommonService commonService;

    @Override
    public IndexInfo getAppIndexInfo() {
        IndexInfo indexInfo = new IndexInfo();
        Banner banner = new Banner();
        banner.setId("banner");
        BannerStyle style = new BannerStyle();
        style.setBtnColor("#ffffff");
        style.setBtnShape("round");
        banner.setStyle(style);
        List<BannerImg> list = commonService.getList(BannerImg.class);
        list.sort(Comparator.comparingInt(BannerImg::getSort));
        Map<String, BannerImg> imgMap = new LinkedHashMap<>();
        for (BannerImg img : list) {
            imgMap.put(img.getImgName(), img);
        }
        banner.setData(imgMap);
        indexInfo.getItems().put("banner", banner);
        return indexInfo;
    }

    @Override
    public AppBase getAppBaseInfo() {
        List<AppProperty> appNames = commonService.getList(AppProperty.class, "propKey", "app_name");
        AppProperty appName = appNames.listIterator().next();
        List<AppProperty> titles = commonService.getList(AppProperty.class, "propKey", "top_background_color");
        AppProperty title = titles.listIterator().next();
        Color color = new Color();
        color.setText("#ffffff");
        color.setValue(20);
        NaviBar naviBar = new NaviBar();
        naviBar.setTopTextColor(color);
        naviBar.setTitle(appName.getPropValue());
        naviBar.setTopBackgroundColor(title.getPropValue());
        return new AppBase(naviBar);
    }
}
