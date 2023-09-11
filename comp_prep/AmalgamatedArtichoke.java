import java.util.Scanner;
import java.lang.Math;

public class AmalgamatedArtichoke {
    public static void main(String[] args) {
      
        Scanner stdin = new Scanner(System.in);
        
        int p = stdin.nextInt();
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();
        int d = stdin.nextInt();
        int n = stdin.nextInt();
        
        double[] vals = new double[n];
        for (int i = 1; i <= n; i++) {
           vals[i-1] = p*(Math.sin(a*i+b) + Math.cos(c*i+d) + 2);
        }
        
        double max = vals[0];
        double res = 0;
        for (int i = 1; i < vals.length; i++) {
           double curr = vals[i];
           if (curr > max) {
              max = curr;
           }
           
           double decline = max - curr;
           if (decline > res) {
              res = decline;
           }
        }
        
        System.out.println(res);
  
  
    }
}
