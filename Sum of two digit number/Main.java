import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner scan= new Scanner(System.in);
      int n= scan.nextInt();
      int answer= n/10+n%10;
      System.out.println(answer);
	}
}