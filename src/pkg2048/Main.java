
package pkg2048;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
       Game2048 g = new Game2048();
       g.addRandom();
       g.addRandom();
       g.addRandom();
       g.PrintArray();
       System.out.println("Press 1 to up, 2 to dowm, 3 left,4 right,0 end");
       int c = -1;
       while ( c != 0) {
           Scanner s = new Scanner(System.in);
           c = s.nextInt();
           if ( c==1)
           {
               g.Up();
                g.PrintArray();
           }
           if ( c==2)
           {
               g.Down();
                g.PrintArray();
           }
           if ( c==3)
           {
               g.Left();
                g.PrintArray();
           }
           if ( c==4)
           {
               g.Right();
                g.PrintArray();
           }
       }
     
      
    }
    
}
