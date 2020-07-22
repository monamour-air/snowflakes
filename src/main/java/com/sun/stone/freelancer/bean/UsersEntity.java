package com.sun.stone.freelancer.bean;

import com.sun.stone.freelancer.common.enums.RolePriv;

public class UsersEntity {

	private int id;

	private String username;

	private String password;

	private boolean enabled;

	private RolePriv rolePriv;

	public UsersEntity() {
		super();
	}

	public UsersEntity(int id, String username, String password, boolean enabled, RolePriv rolePriv) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.rolePriv = rolePriv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public RolePriv getRolePriv() {
		return rolePriv;
	}

	public void setRolePriv(RolePriv rolePriv) {
		this.rolePriv = rolePriv;
	}

	@Override
	public String toString() {
		return "UsersEntity [id=" + id + ", username=" + username + ", password=" + password + ", enabled=" + enabled
				+ ", rolePriv=" + rolePriv + "]";
	}

}
