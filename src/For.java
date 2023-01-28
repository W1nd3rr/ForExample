
import java.util.Scanner;


public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        for ( i = 2 ; i <= 200; i+=2)
        {
            if (i % 3 == 0)
                continue;
            System.out.println(i);
        }

        
    }
    
}
