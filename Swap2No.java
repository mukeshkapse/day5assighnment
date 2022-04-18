package Day5Assigment;
import java.util.Scanner;
public class Swap2No {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			        int first, second ;
			        
			        Scanner scan=new Scanner(System.in);
			        System.out.println("enter two numbers");
			        
			        first=scan.nextInt();
			        second=scan.nextInt();

			        System.out.println("before swap");
			        System.out.println("First number = " + first);
			        System.out.println("Second number = " + second);

			        first = first - second;
			        second = first + second;
			        first = second - first;
			        
			        System.out.println("after swap");
			        System.out.println("First number = " + first);
			        System.out.println("Second number = " + second);
		}


}
