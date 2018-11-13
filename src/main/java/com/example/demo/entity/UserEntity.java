package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "com.cmig.zrgk.user")
@Data
public class UserEntity implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	 
	    //id主键
		@Id
		@GeneratedValue
		private long id;
		//nullabe:是否可以为空。unique:是否唯一
		@Column(nullable = false,unique = false)
		private String uname;
		@Column(nullable = false,unique = true)
		private String password;
		@Transient
		private String age;

}
