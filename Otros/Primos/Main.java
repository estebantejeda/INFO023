import java.util.*;

public class Main{
    public static void main(String[] args) {

        int x = 1;
        while(true){
            int cont = 0;
            int a = x;
            while(a != 0){
                if (x%a == 0) cont++;
                a--;
            }
            if (cont == 2) System.out.println(x);
            x++;
        }
        
    }
}
