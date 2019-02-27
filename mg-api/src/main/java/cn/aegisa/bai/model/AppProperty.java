package cn.aegisa.bai.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
public class AppProperty implements Serializable{
	
	//列信息
	private Integer id;
	
	private String propKey;
	
	private String propValue;
	
	private LocalDateTime createTime;
	
}

