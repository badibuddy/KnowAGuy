/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knowaguy;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bweru
 */
public class accountCreation {
    
    static boolean isValidNum = false;
    public static void main(String[] args) {
        System.out.print( "\t Kindly select a login role: "
            + "\n 1. Vendor"
            + "\n 2. Client"
            + "\n *. Quit: \n" );
        KnowAGuy.sel = KnowAGuy.scanner.nextLine();
         switch (KnowAGuy.sel) {
             case "1":
                registerVendor();
                break;
            case "2":
                registerClient();
                break;
            case "*":
                System.exit(0);
                break;
            default:
                System.err.println("Kindly input relevant choice i.e [1],[2]");
                String[] params = new String[] {""};
                accountCreation.main(params);
        }
    }

static String registerVendor(){
        getGeneralDetails();
        String area = getLocationDetails();
        return area;
    }

static String registerClient(){
        getGeneralDetails();
        String area = getLocationDetails();
        return area;
    }

static void getGeneralDetails(){
                           
    System.out.print( "Please enter your first name: " );
    String fname = KnowAGuy.scanner.nextLine();
    System.out.print( "Please enter your last name: " );
    String lname = KnowAGuy.scanner.nextLine();
    do 
    {
        System.out.print("Please enter your mobile number[07++]): ");
        String num = KnowAGuy.scanner.nextLine();
        validateNumber(num);
        
    }
    while (isValidNum == false);
}

static void validateNumber(String phoneNum){
    String numRegex = "^07\\d{8}$";
        if (phoneNum.matches(numRegex)){
            isValidNum = true;
        }
        else {
            System.err.println("Kindly input number in correct format ie 07********");
            isValidNum = false;
        }
}

static String getLocationDetails(){
    System.out.print("Please enter your city:" 
                        + "\n 1. Nairobi"
                        + "\n 2. Mombasa: \n" );
    int loc = KnowAGuy.scanner.nextInt();
    String estate = "";
    
    if (loc == 1){    
        System.out.print("Please enter preferred region :" 
                    + "\n 1. Mombasa Rd"
                    + "\n 2. Langata"
                    + "\n 3. Thika Rd"
                    + "\n 4. Eastleigh"
                    + "\n 5. Ngong Rd: \n" );
        estate = KnowAGuy.scanner.nextLine();
    }
    else if (loc == 1){
        System.out.print("Please enter preferred region :" 
                    + "\n 1. Bamburi"
                    + "\n 2. Nyali"
                    + "\n 3. Tudor"
                    + "\n 4. Mtwapa"
                    + "\n 5. Kizingo: \n" );
        estate = KnowAGuy.scanner.nextLine();

    }
    else{
        System.err.println("Kindly input relevant choice i.e [1] to [5]");
        accountCreation.getLocationDetails();
    }            
    
    return loc + " , " + estate;
}
}
