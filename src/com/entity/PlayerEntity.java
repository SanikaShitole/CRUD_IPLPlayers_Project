package com.entity;

public class PlayerEntity {
	private int jn;
	   private String name;
	   private String tname;
	   private String role;
	   private int runs;
	   private int wickets;
	

	public PlayerEntity() {
		super();
	}
	
   public PlayerEntity(int jn, String name, String tname, String role, int runs, int wickets) {
		super();
		this.jn = jn;
		this.name = name;
		this.tname = tname;
		this.role = role;
		this.runs = runs;
		this.wickets = wickets;
	}
public int getJn() {
	return jn;
}

public void setJn(int jn) {
	this.jn = jn;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public int getRuns() {
	return runs;
}

public void setRuns(int runs) {
	this.runs = runs;
}

public int getWickets() {
	return wickets;
}

public void setWickets(int wickets) {
	this.wickets = wickets;
}
@Override
public String toString() {
	return "Entity [jn=" + jn + ", name=" + name + ", tname=" + tname + ", role=" + role + ", runs=" + runs
			+ ", wickets=" + wickets + "]";
}

 
}
