/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knowaguy;
import java.util.Scanner;


/**
 *
 * @author bweru
 */
public class login {
    public static void main(String[] args) {
        String role = "";
        System.out.print( "Please enter your user name: " );
        String uname = KnowAGuy.scanner.nextLine();
        System.out.print( "Please enter your password: " );
        String passwd = KnowAGuy.scanner.nextLine();
        if(uname.equalsIgnoreCase("uname")){
            role = "vendor";
        }
        else {
            role = "client";        
        }
    System.out.print(role);
    }
}
