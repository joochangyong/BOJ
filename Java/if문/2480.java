import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    int price = 0;
    int max;
    // 모두 같을 때
    if(num1 == num2 && num2 == num3 && num1 == num3)
      price = 10000+num1*1000;
    // 두개만 같을 때
    if(num1 == num2 && num2 != num3)
      price = 1000+num1*100;
    if(num2 == num3 && num1 != num2)
      price = 1000+num2*100;
    if(num1 == num3 && num1 != num2)
      price = 1000+num1*100;
    // 모두 다를 때
    if(num1 != num2 && num2 != num3 && num1 != num3) {
      if(num1 >= num2 && num1 >= num3) {
        max = num1;
      }else if (num2 >= num1 && num2 >= num3) {
        max = num2;
      }else {
        max = num3;
      }
      price = max*100;
    }
    System.out.print(price);
  }
}