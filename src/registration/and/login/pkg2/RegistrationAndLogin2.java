
package registration.and.login.pkg2;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationAndLogin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        Login details = new Login();
        
        System.out.print("Please Enter Your Name :");
       String name = login.nextLine();
       details.setName(name);
       
       System.out.print("Please Enter Your Surname :");
       String surname = login.nextLine();
       details.setSurname(surname);
       
     System.out.print("Please Enter Your Password :");
       String password = login.nextLine();
       details.setPassword(password);
       
       //This checks the complexity of the password, and will loop until the password meets the requirements.
      while (!details.passwordComplexity())
       { 
       System.out.println("Password is incorrectly formatted");
       System.out.print("Please Enter Your Password :");
       password = login.nextLine();
       details.setPassword(password);
       
    }
      System.out.print("Please Enter Your Cellphone Number :");
      String cellphoneNumber = login.nextLine();
      details.setCellphonenumber(cellphoneNumber);
      
      //This checks if the cellphone number entered is a valid South African number.
      while(!details.checkCellphoneNumber()){
       System.out.println("Cellphone number is not valid.");
       System.out.print("Please Enter Your Cellphone Number :");
       cellphoneNumber = login.nextLine();
       details.setCellphonenumber(cellphoneNumber);
      }
     
      System.out.print("Please Enter Your Username :");
      String username = login.nextLine();
      details.setUsername(username);
      
       //This checks if the username meets the requirements and will loop until it meets them
      while(!details.checkUsername()){
          System.out.println("Username is not valid.");
          System.out.print("Please Enter Your Username :");
          username = login.nextLine();
          details.setUsername(username);
      }
          
          //User logs in after registering
        System.out.print("**********Login**********");
        
        System.out.print("\nEnter your username: ");
        String enteredUsername = login.nextLine();
        
        System.out.print("Enter your password: ");
        String enteredPassword = login.nextLine();
        
        //This checks if the details entered during login matches the ones entered during registration
        if (details.loginUser(enteredUsername, enteredPassword)){
            System.out.println("Welcome " + name  +  surname  + " it is great to see you again.");
        }else{
        System.out.println("Username or Password is incorrect, please try again.");
   }
        }
      
    }

