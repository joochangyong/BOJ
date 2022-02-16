import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num2 = num;
    int count = 0;
    while(true) {
      num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
      count++;
      if(num2 == num)
        break;
    }
    System.out.println(count);
  }
}