package fundinfo;


import java.util.Date;

public class TUser {
//javaBean 实体类--存放数据
private long id;

private String fdcd;
private String fdnm;
private String status;
private String oppr;
private String hipr;
private String lopr;
private String clpr;
private String prchg;
private String chgpct;
private String username;
private String password;

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

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

public String getFdcd() {
	return fdcd;
}
public void setFdcd(String fdcd) {
	this.fdcd = fdcd;
}
public String getFdnm() {
	return fdnm;
}
public void setFdnm(String fdnm) {
	this.fdnm = fdnm;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getOppr() {
	return oppr;
}
public void setOppr(String oppr) {
	this.oppr = oppr;
}
public String getHipr() {
	return hipr;
}
public void setHipr(String hipr) {
	this.hipr = hipr;
}
public String getLopr() {
	return lopr;
}
public void setLopr(String lopr) {
	this.lopr = lopr;
}
public String getClpr() {
	return clpr;
}
public void setClpr(String clpr) {
	this.clpr = clpr;
}
public String getPrchg() {
	return prchg;
}
public void setPrchg(String prchg) {
	this.prchg = prchg;
}
public String getChgpct() {
	return chgpct;
}
public void setChgpct(String chgpct) {
	this.chgpct = chgpct;
}

public TUser(String username,String password) {
    this.username=username;
    this.password=password;
}
public TUser() {
	
}

}
