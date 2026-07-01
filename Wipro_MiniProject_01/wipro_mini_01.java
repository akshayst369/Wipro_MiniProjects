import java.util.*;
public class wipro_mini_01 {
    public static void main(String[] args) {

        //Array Initialization

        int empNo[] = {1001,1002,1003,1004,1005,1006,1007};
        String empName[] = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
        char designation[] = {'e','c','k','r','m','e','c'};
        String department[] = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
        int basic[] = {20000,30000,10000,12000,50000,23000,29000};
        int hra[] =  {8000,12000,8000,6000,20000,9000,12000};
        int it[] = {3000,9000,1000,2000,20000,4400,10000};


        Scanner sa = new Scanner(System.in);
        int empNoInput = sa.nextInt();

        int salary = 0;
        char tempdes = 'a';
        boolean found = false;
        String designationName="";


        //if found logic
        for(int i=0;i<empNo.length;i++) {

            if(empNoInput == empNo[i]) {
                found = true;

                tempdes = designation[i];
                    
                    switch(tempdes) {
                        case 'e':
                            salary = (basic[i]+hra[i]+20000)-it[i];
                            designationName = "Engineer";
                            break;
                        case 'c':
                            salary = (basic[i]+hra[i]+32000)-it[i];
                            designationName = "Consultant";
                            break;
                        case 'k':
                            salary = (basic[i]+hra[i]+12000)-it[i];
                            designationName = "Clerk";
                            break;
                        case 'r':
                            salary = (basic[i]+hra[i]+15000)-it[i];
                            designationName = "Receptionist";
                            break;
                        case 'm':
                            salary = (basic[i]+hra[i]+40000)-it[i];
                            designationName = "Manager";
                            break;

                        default:
                            System.out.println("Invalid Designation");
                
                    }

                System.out.printf("%-8s %-12s %-15s %-15s %-8s%n", "Emp No.","Emp Name","Department","Designation","Salary");
                System.out.printf("%-8d %-12s %-15s %-15s %-8d%n",empNo[i],empName[i],department[i],designationName,salary);
            }   
            
        }

    //if not found    
    if (found==false) {
       System.out.println("There is no employee with "+ empNoInput);
    } 
    sa.close();
    }
            
}
