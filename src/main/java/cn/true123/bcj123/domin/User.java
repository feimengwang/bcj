package cn.true123.bcj123.domin;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2294403409345526624L;
	private Integer id;
	private String name;
	private String password;
	private String sex;
	private String telephone;
	private String email;

	public User() {
		super();
	}

	public User(Integer id, String name, String password, String sex, String telephone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.telephone = telephone;
		this.email = email;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", sex=" + sex + ", telephone=" + telephone
				+ ", email=" + email + "]";
	}

}
