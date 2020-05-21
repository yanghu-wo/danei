package cn.zzl.javabean;

public class user {
	private String uname;
	private String upwd;
	private String phone;	//唯一主键
	private String email;
	private int role;
	
	
	public user(String uname, String upwd, String phone, String email, int role) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.phone = phone;
		this.email = email;
		this.role = role;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "user [uname=" + uname + ", upwd=" + upwd + ", phone=" + phone + ", email=" + email + ", role=" + role
				+ "]";
	}
	
}
