package com.inheritance_multilevel;

public class Grandparents {
	
	   private String gname;
	   private int gage;
	   private boolean alive;
	  
	   
	   public Grandparents(String gname, int gage, boolean alive) {
		this.gname = gname;
		this.gage = gage;
		this.alive = alive;
	   }


	   public String getGname() {
		   return gname;
	   }


	   public void setGname(String gname) {
		   this.gname = gname;
	   }


	   public int getGage() {
		   return gage;
	   }


	   public void setGage(int gage) {
		   this.gage = gage;
	   }


	   public boolean isAlive() {
		   return alive;
	   }


	   public void setAlive(boolean alive) {
		   this.alive = alive;
	   }
	   
	   @Override
		public String toString() {
			return "\nGrandparent [Grandparent age=" +gage + ", Grandparent name=" + gname + ", Grandparent alive =" +alive+"]";
	   
	   
	   }
	   
	   
	   
	   
	   
	

}
