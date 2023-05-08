package movie;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	private String id,pwd,name;
	private int phNum;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhNum() {
		return phNum;
	}
	public void setPhNum(int phNum) {
		this.phNum = phNum;
	}
	
}
