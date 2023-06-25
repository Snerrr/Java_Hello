// Реализовать простой калькулятор

package hw_1;

import java.util.Scanner;

public class j3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    float number_1 = scanner.nextFloat();
    System.out.print("Введите число: ");
    float number_2 = scanner.nextFloat();
    System.out.println("Введите арифметическую операцию: ");
    String operacion = scanner.next();
    switch(operacion){
      case "+" : 
      System.out.println(number_1 + number_2);
      break;
      case "-" :
      System.out.println(number_1 - number_2);
      break;
      case "*" : 
      System.out.println(number_1 * number_2);
      break;
      case "/" :
      if (number_2 != 0){
      System.out.println(number_1 / number_2);
      break;
      }
      System.out.println("На 0 делить нельзя");
      break;
    }
  }
}
