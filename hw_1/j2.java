// Вывести все простые числа от 1 до 1000

package hw_1;

public class j2 {
  public static void main(String[] args) {
    prostoe();
  }
  static void prostoe(){
    for (int i = 2; i < 1000; i++) {
      int kol = 0;
      for (int j = 1; j < i+1; j++) {
        if (i % j == 0){
          kol += 1;
        }
      }
      if (kol == 2){
        System.out.println(i);
      }
    }
  }
}
