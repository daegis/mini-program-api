package cn.aegisa.bai.model;

import lombok.Data;

import java.io.Serializable;


@Data
public class BannerImg implements Serializable{
	
	//列信息
	private Integer id;
	
	private String imgUrl;
	
	private String imgName;
	
	private String linkUrl;
	
	private Integer sort;
	
}

