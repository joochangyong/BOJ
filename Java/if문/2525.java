import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hour = sc.nextInt();
    int min = sc.nextInt();
    int neadTime = sc.nextInt();
    min += neadTime;
    while(min > 59) {
      hour++;
      min-=60;
    }
    if(hour > 23)
      hour -= 24;
    System.out.print(hour + " " + min);
  }
}