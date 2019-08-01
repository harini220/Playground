import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int Sum = 0;
        for(int count= 1; count <= n; count = count+1)
        {
          Sum = Sum + count;
        }
          System.out .println(Sum);
	}
}
