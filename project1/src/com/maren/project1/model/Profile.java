package com.maren.project1.model;//java package(supriya140)

//class profile(supriya140)
public class Profile
 {//private access specifier(supriya140)
	private String userid;

	private String name;

	private String email;

	private long mobile;
      	
	
	//default constructor(supriya140)
public Profile() {

	}
//copy constructor(supriya140)
	public Profile(String userid, String name, String email, long mobile) {
//super keyword  is the reference variable that is used to refer parent class obj(supriya140)
		super();
	//this keyword works as the reference for the current obj(supriya140)
	this.userid = userid;

	this.name = name;
	
	this.email = email;

		this.mobile = mobile;
	
}
	//returns thevariable of variable userid(supriya140)
	public String getUserid()
 {
		return userid;

	}
	//sets the value of userid(supriya140)
	public void setUserid(String userid) {

		this.userid = userid;
	
	}
	//returns thevariable of variable userid(supriya140)
	public String getName() {
	
	return name;
	
	}
	//sets the value of userid(supriya140)
	public void setName(String name) {

		this.name = name;
	
}
	//returns thevariable of variable userid(supriya140)
	public String getEmail() {

	return email;

	}
	//sets the value of userid(supriya140)
	public void setEmail(String email) {

		this.email = email;
	}
	//returns thevariable of variable userid(supriya140)
	public long getMobile() {
		return mobile;
	}
	//sets the value of userid(supriya140)
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
	
}

