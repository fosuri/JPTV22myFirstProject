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
public class App {
    private final Scanner scanner;
    private boolean repeat = true;
    public App() {
        this.scanner = new Scanner(System.in);
    }
    public void run(){
        do{

            System.out.println("Выберите задачу из списка:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Демонстрация работы со строками");
            System.out.println("2. Демонстрация работы с массивами");
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;

                case 1:
                    System.out.println("Выбрана задача демонстрации работы со строками");
                    break; 

                case 2:
                    System.out.println("Выбрана задача демонстрации работы с массивами");
                    break; 

                default:
                    System.out.println("Выберите номер задачи из списка");
                    
            }
        }while(repeat);
    }
    
}