package com.example.user.relationshipuser.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_contacts")
public class UserContact {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Long phoneNo;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName="user_id")
	private User user;

	public Integer getId() {
		return id;
	}

	public UserContact setId(Integer id) {
		this.id = id;
		return this; // to follow builder pattern
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public UserContact setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
		return this;
	}

	public User getUser() {
		return user;
	}

	public UserContact setUser(User user) {
		this.user = user;
		return this;
	}
	public UserContact() {
		
	}
	
}
