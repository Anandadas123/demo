package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int aid;
	private String aname;
	private String atech;
	
	public Alien() {}
	public Alien(int aid, String aname, String atech) {
		this.aid = aid;
		this.aname = aname;
		this.atech = atech;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	
	public void show() {
		System.out.println("in show....");
	}

}
