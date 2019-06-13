import java.util.Scanner;
 
class Employee
{

    String name, gS;
	static String category;
	float netS;
    Scanner get = new Scanner(System.in);
    Employee()
    {
        System.out.println("Enter ID of the Employee:");
        name = get.nextLine();
        System.out.println("Enter FIELD of the Employee:");
        category = get.nextLine();


    }
    void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Address: "+category);
    }
    public static void main(String args[])
    {
      
    	System.out.println("------------"+"\n"+"Enter Full Time Employee Details"+"\n"+"----------------"+"\n");
        fullTimeEmployees ob1 = new fullTimeEmployees();
        
        System.out.println("------------"+"\n"+"Enter Part Time Employee Details"+"\n"+"------------------"+"\n");
        partTimeEmployees ob = new partTimeEmployees();
        ob1.display();
        ob.calculatepay();
        ob.display();
		       
        }
         
    }


