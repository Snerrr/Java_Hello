// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


package hw_1;

import java.util.Scanner;

public class j1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();
    System.out.println(vse_chisla_summa(number));
    System.out.println(vse_chisla_proizvedenie(number));
  }
  static int vse_chisla_summa(int number){
    int summa = 0;
    for (int i = 1; i < number + 1; i++) {
      summa = summa + i;
  }
  return summa;
  }
  static int vse_chisla_proizvedenie(int number){
    int proizvedenie = 1;
    for (int i = 1; i < number + 1; i++) {
      proizvedenie = proizvedenie * i;
  }
  return proizvedenie;
  }
}