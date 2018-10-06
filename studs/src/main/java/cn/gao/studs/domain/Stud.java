package cn.gao.studs.domain;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Stud {
	private String id;
	private String name;
	private Integer age;
	private String sex;
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", addr=" + addr + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	private String addr;
}
