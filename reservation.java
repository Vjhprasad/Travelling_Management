import java.util.Scanner;
import java.sql.*;
public class reservation  {
    
    public static void main(String[] args) throws SQLException
    {
        booking bb = new booking(); 
        Boolean flag2 = true;
        do 
        {
            System.out.println("press 1 to Login as Admin");
            System.out.println("press 2 to Login as User");
            System.out.println("press 3 to choose EXIT");

            Scanner sc2 = new Scanner(System.in);
            int j = sc2.nextInt();
            
            switch(j)
            {
            case 1: bb.admin();
                flag2 = false;
                break;
            case 2: bb.user();
                flag2 = false;
                System.exit(0);
                break;
            case 3: 
                System.exit(0);
            default : System.out.println("wrong choice u have entered");
                System.out.println("Please Enter the Correct One");
                break;
            }

        }while(flag2);


        Boolean flag = true;
        do{
            String s = "y";
            //String usern,passw;

            //Scanner sc1 = new Scanner(System.in);

            //System.out.println("Please Enter The LOGIN DETAILS:");

            //System.out.println("enter username: ");
            //usern = sc1.nextLine();
            //System.out.println("Enter your password: ");
            //passw = sc1.nextLine();

            //if(usern.equals("vijay") && passw.equals("prasad"))
            //{
               // System.out.println("your authentication is succefull");

            while (s.equals("y")) {
                System.out.println("*********** MAIN MENU *************");
                System.out.println("press 1 to choose Bus");
                System.out.println("press 2 to choose Train");
                System.out.println("press 3 to choose Flight");
                System.out.println("press 4 to choose *** update a previous records *** ");
                System.out.println("press 5 to choose *** Delete your DATA ***");
                System.out.println("press 6 to choose EXIT");

                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();

                

                switch (i) 
                {
                case 1: bb.Bus();
                    break;
                case 2: bb.Train();
                    break;
                case 3: bb.Flight();
                    break;
                case 4: bb.update();
                    break;
                case 5: bb.delete();
                    break;
                case 6: System.exit(0);
                default : System.out.println("Wrong Choice");
                    break;
                }
                System.out.println("want to continue press y/n");
                s = sc.next();

            }

            flag = false;
            //}
            //else
            //{
              //  System.out.println("INVALID. Please Enter Correct Details: ");

            //}
        }
        while(flag);

    }

}
