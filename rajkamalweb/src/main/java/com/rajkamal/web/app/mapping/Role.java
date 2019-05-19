package com.rajkamal.web.app.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	@Column(name="role")
	@NotNull(message="NOT_NULL")
	private String role;
	
	/*
	 * @OneToMany(mappedBy = "role" ,fetch = FetchType.LAZY) private
	 * Set<UserRoleMapping> userRoleMappings = new HashSet<UserRoleMapping>();
	 */

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	/*
	 * public Set<UserRoleMapping> getUserRoleMappings() { return userRoleMappings;
	 * }
	 * 
	 * public void setUserRoleMappings(Set<UserRoleMapping> userRoleMappings) {
	 * this.userRoleMappings = userRoleMappings; }
	 */
	
}
