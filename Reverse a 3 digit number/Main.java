import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    int first = num/100;
    int second = (num/10)%10;
    int third = num%10;
    int sum = third*100+second*10+first;
    System.out.println(sum);
  }
}