package com.xworkz.collectionapp;

public class DaughterDTO {
	
	private String dauName;
	private long mobileNo;
	private int age;
	private boolean commited;
	private boolean alive;
	
	public DaughterDTO() {
		
	}
	
	public DaughterDTO(String name, long mobileNo, int age, boolean commited, boolean alive) {
		this.dauName = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}
	
	@Override
	public int hashCode() {
		return 70;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj != null) {
			
			if(obj instanceof DaughterDTO) {
				
				DaughterDTO ref = (DaughterDTO)obj;
				if(ref.dauName.equals(this.dauName)) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return dauName;
	}

	public void setName(String dauName) {
		this.dauName = dauName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
