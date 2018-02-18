package com.example.user.relationshipuser.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_new")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Integer id;
	
	
	private String name;
	private BigDecimal salary;
	private String teamName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName="user_id") /* Since its one to many, we will have the referenced col name as a FK*/
	private List<UserLogs> userLogs;
	
	public List<UserLogs> getUserLogs() { 
		return userLogs;
	}
	public User setUserLogs(List<UserLogs> userLogs) {
		this.userLogs = userLogs;
		return this;
	}
	//Empty constructor for hibernate
	public User() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public User setName(String name) {
		this.name = name;
		return this;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public User setSalary(BigDecimal salary) {
		this.salary = salary;
		return this;
	}
	public String getTeamName() {
		return teamName;
	}
	public User setTeamName(String teamName) {
		this.teamName = teamName;
		return this;
	}
	
	
}
