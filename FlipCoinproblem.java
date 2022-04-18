package Day5Assigment;
import java.util.Scanner;

public class FlipCoinproblem 
{

		public static void main(String[] args) {
			
			int n, h_cnt = 0, t_cnt = 0;
			double heads, tails;
		Scanner scan = new Scanner(System.in);

			System.out.print("Enter The Number You Want To Flip: ");
			n = scan.nextInt();

			
			for (int i = 0; i < n; i++) {
				double random = Math.random();
				if (random < 0.5)
					t_cnt++;
				else
					h_cnt++;
			}

			heads = h_cnt / (double) n * 100;
			tails = t_cnt / (double) n * 100;
			System.out.println("Parcentage of Head: " + heads );
			System.out.println("Percentage of Tails: " + tails );

		}

	}

