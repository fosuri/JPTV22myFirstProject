/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22myfirstproject;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV22MyFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
        System.out.println("Enter your nam: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter your last name");
        String lastname = scanner.nextLine();
        String age = scanner.nextLine();
        System.out.println("Hello" + " " + firstname + " " + lastname+"!");
        System.out.println(age);
        scanner.close();  
        // TODO code application logic here
        }
    }
    
}
