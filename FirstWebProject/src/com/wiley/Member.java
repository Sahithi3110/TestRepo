package com.wiley;

public class Member {
private String uname;private String pword;

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPword() {
	return pword;
}

public void setPword(String pword) {
	this.pword = pword;
}

public Member(String uname, String pword) {
	super();
	this.uname = uname;
	this.pword = pword;
}

public Member() {
	super();
}

}
