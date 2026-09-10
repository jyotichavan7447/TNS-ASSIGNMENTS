package constructor_assignments_no2;
import java.util.Scanner;

public class Commission {
	
	String name   ;
	String Add;
	long phnol;
	double amount;
	double commission;
	
	public void acceptSalesAmount(Scanner sc)
	{
		System.out.println("enter name:");
		name = sc.nextLine();
		
		System.out.println("enter address:");
		Add= sc.nextLine();
		
		System.out.println("enter phone No:");
		phnol=sc.nextLong();
		
		System.out.println("enter Sales Amount::");
		amount=sc.nextDouble();
		
		
	}
	
	public  void calculateCommission() {
        
 
        if (amount >= 100000) {
            commission = amount * 0.10;   // 10%
        } 
        else if (amount >= 50000) 
        {
            commission = amount * 0.05;   // 5%
        } 
        else if (amount >= 30000) 
        {
            commission = amount * 0.03;   // 3%
        } 
        else 
        {
            commission = 0;                    // no commission
        }
        
        
        System.out.println("\nEmployee Details");
        System.out.println("----------------------");
        
        System.out.println("Name : " + name);
        System.out.println("Address : " + Add);
        System.out.println("Phone : " + phnol);
        System.out.println("Sales Amount : " + amount);
        System.out.println("Commission : " + commission);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Commission cs = new Commission ();
		cs.acceptSalesAmount(sc);
		
		cs.calculateCommission();
		
		//sc.close();
		
		
		

	}

}
