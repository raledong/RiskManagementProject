package com.education.test.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.education.test.convertor.GenderConverter;
import com.education.test.convertor.RoleConverter;
import com.education.test.enumType.Gender;
import com.education.test.enumType.Role;

//用户
@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	
	@Column(name="user_password", nullable=false)
	private String password;
	
	@Column(name="user_name", nullable=false)
	private String name;
	
	@Convert(converter = GenderConverter.class)
	@Column(name="user_gender")
	private Gender gender;
	
	@Convert(converter = RoleConverter.class)
	@Column(name="user_role")
	private Role role;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
