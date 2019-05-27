package com.ray.study.springcloud01discovery01eurekaclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * description
 *
 * @author shira 2019/05/27 10:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Long id;

	private String name;

	private Integer age;

	private Date creationDate;

	private Date lastUpdateDate;

}
