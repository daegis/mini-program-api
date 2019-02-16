package cn.aegisa.bai.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * UploadImg Entity.
 */
@Data
public class UploadImg implements Serializable{
	
	//列信息
	private Integer id;
	
	private String imgName;
	
	private String cdnUrl;
	
	private LocalDateTime uploadTime;
	
	private String description;


}

