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
public class KnowAGuy {

    public static final Scanner scanner = new Scanner( System.in );
    public static String sel;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print( "\tWelcome to KnowAGuy. \n Kindly select an option to proceed: "
            + "\n 1. Login"
            + "\n 2. Register"
            + "\n *. Quit: \n" );
        sel = scanner.nextLine();
        welcomeOptions();
    }
    

    public static String welcomeOptions( ) {
        switch (sel) {
             case "1":                
                login.main(new String[] {""});
                break;
            case "2":
                accountCreation.main(new String[] {""});
                break;
            case "*":
                System.exit(0);
                break;
            default:
                System.err.println("Kindly input relevant choice i.e [1],[2]");
                String[] params = new String[] {""};
                KnowAGuy.main(params);
        }

    return sel;
    }
}
