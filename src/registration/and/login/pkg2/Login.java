
package registration.and.login.pkg2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
     private String name;
    private String surname;
    private String username;
    private String password;
    private String cellphonenumber;
    
    Scanner user = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCellphonenumber() {
        return cellphonenumber;
    }

    public void setCellphonenumber(String cellphonenumber) {
        this.cellphonenumber = cellphonenumber;
    }
    public boolean passwordComplexity(){
                 String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$";
// Compile the pattern and match the password
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        
        // Return true if the password matches the pattern, false otherwise
        return matcher.matches();
    }
    public boolean checkCellphoneNumber(){
      // Only matches SA phone numbers with +27 and exactly 9 digits after
    String regex = "^\\+27\\d{9}$";
    return cellphonenumber != null && cellphonenumber.matches(regex);
    }
   public boolean checkUsername(){
       if(username.contains("_") && username.length() <= 5){
           return true;
       } else {
           return false;
       }
       
   }
   public void registerUser(){
       System.out.print("Please Enter Your Password :");
       String password = user.nextLine();
       setPassword(password);
       
      while (passwordComplexity())
       { 
       System.out.println("Password is incorrectly formatted");
       System.out.print("Please Enter Your Password :");
       password = user.nextLine();
       setPassword(password);
       
    }
      System.out.print("Please Enter Your Cellphone Number :");
      String cellphoneNumber = user.nextLine();
      setCellphonenumber(cellphoneNumber);
      
      while(checkCellphoneNumber()){
       System.out.println("Cellphone number is not valid.");
       System.out.print("Please Enter Your Cellphone Number :");
       cellphoneNumber = user.nextLine();
       setCellphonenumber(cellphoneNumber);
      }
     
      System.out.print("Please Enter Your Username :");
      String username = user.nextLine();
      setUsername(username);
      
      while(checkUsername()){
          System.out.println("Username is not valid.");
          System.out.print("Please Enter Your Username :");
          username = user.nextLine();
          setUsername(username);
      }
   }
}
