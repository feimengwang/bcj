package cn.true123.bcj123.domin;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Email;

@Alias("User")
public class User implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2294403409345526624L;
	private Integer id;
	@NotNull
	@Size(min=6,max=12,message="{name.size.from2.to8}")
	private String name;
	@NotNull
	@Size(min=6,max=12,message="{password.size.from2.to8}")
	private String password;
	@NotNull
	private String sex;
	@NotNull
	@Size(min=9,max=16)
	private String telephone;
	@Email(message="{emial.is.not.valid}")
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
