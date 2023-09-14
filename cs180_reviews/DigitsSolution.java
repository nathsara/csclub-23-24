import java.util.Scanner;
public class DigitsSolution {

	public static void main(String[] args) {
		/**
		    * Complete the following code. When given a two digit number, determine if 
		    * the sum of the digits is larger than 10. If it is, output "yes", if not
		    * output "no";
		    
		    TEST CASES:
		    Input: 47
		    Output: yes
		    
		    Input: 82
		    Output: no
		    
		    Input: 20
		    Output: no
		*/
		
		Scanner stdin = new Scanner(System.in);
		int num1 = stdin.nextInt();
		    
		int ones = num1 % 10;
		int tens = num1 / 10;
		    
		if (ones + tens > 10) {
			System.out.print("yes");
		} else {
		    System.out.print("no");
		}
		    
		stdin.close();

	}

}