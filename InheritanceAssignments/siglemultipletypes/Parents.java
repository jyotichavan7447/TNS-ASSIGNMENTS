package com.inheritance_multilevel;

public class Parents extends Grandparents{
	
	
	private String pname;
	private int page;
	
	
	
		
	public Parents(String pname, int page,String gname, int gage, boolean alive) {
		super( gname,  gage, alive);
		this.pname = pname;
		this.page = page;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return super.toString()+"\nParents [Parent name=" + pname + ", parent age=" + page +  "]";
	}
	
	
	
	
	
		
	
	
	
	
	
	
	

}
