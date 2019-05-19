package com.rajkamal.web.app.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	@Column(name="name")
	@NotNull(message="NOT_NULL")
	private String name;
	
	@Column(name="email")
	@NotNull(message="NOT_NULL")
	private String email;
	
	@Column(name="contact_no")
	private Integer contactNo;
	
	@Column(name="password")
	@NotNull(message="NOT_NULL")
	private String password;
	
	@Type(type= "org.hibernate.type.NumericBooleanType")
	@NotNull(message="NOT_NULL")
	@Column(name="enabled")
	private boolean enabled;
	
	
	/*
	 * @OneToMany(mappedBy = "user" ,fetch = FetchType.LAZY) private
	 * Set<UserRoleMapping> userRoleMappings = new HashSet<UserRoleMapping>();
	 * 
	 * public Set<UserRoleMapping> getUserRoleMappings() { return userRoleMappings;
	 * }
	 * 
	 * public void setUserRoleMappings(Set<UserRoleMapping> userRoleMappings) {
	 * this.userRoleMappings = userRoleMappings; }
	 */
	 


	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
