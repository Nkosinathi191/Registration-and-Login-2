
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
       
       details.registerUser();
    }
}
