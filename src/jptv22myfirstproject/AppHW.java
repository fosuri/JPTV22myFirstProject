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
public class AppHW {
    private final Scanner scanner;
    private boolean repeat = true;
    public AppHW() {
        this.scanner = new Scanner(System.in);
    }
    public void run(){
        do{

            System.out.println("Выберите задачу из списка:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Калькулятор");
            System.out.print("Номер задачи: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
 
                case 1:
                    System.out.println("Выбран калькулятор");
                    runCalc();
                    break; 

                default:
                    System.out.println("Выберите номер задачи из списка");
                    
            }
        }while(repeat);
    }   
    private void runCalc(){
        do{
            double num1, num2, result;
            char operator;

            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Введите оператор (+, -, *, /): ");
            operator = scanner.nextLine().charAt(0);

            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
           
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    repeat = false;
                    break;
                case '-':
                    result = num1 - num2;
                    repeat = false;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Ошибка: деление на ноль");
                        return;
                    }
                    break;
                default:
                    System.out.println("Ошибка: некорректный оператор");
                    return;
            } 
            System.out.println("Результат: " + result);
            run();
            
        }while(repeat);
    }
}


