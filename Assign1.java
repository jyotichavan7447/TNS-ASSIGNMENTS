package constructor_assignments_no1;

public class Assign1 {
	
	int rollno;
	String nme;
	char grd;
	float per;
	
	
	
	public Assign1(int rollno,String nme,char grd,float per)
	{
		System.out.println("Student Details");
		System.out.println("Roll No : " + rollno);
	    System.out.println("Name    : " + nme);
	    System.out.println("Grade   : " + grd);
	    System.out.println("Percent : " + per);
	
		
	}
	public void display() {
		
	}
	
	
	   public static void main(String[] args) {
		
		
		Assign1 a = new Assign1 (3208 ,"jtc",'A',84f);
		a.display();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
