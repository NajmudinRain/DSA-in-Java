package DSA;
import java.util.Scanner;

public class Diamonds {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height;
        int heightLower = 0;
        byte initiate = -1;

        do {
            int n;
            int rowUpper = 0;
            int rowLower = 0;
            System.out.print("Give a positive number: ");
            height = scan.nextInt();
            if (height > 0) {
                heightLower = height-1;
                    do {
                        n = 0;
                        while (n < height - rowUpper - 1) {
                            System.out.print(" ");
                            n++;
                        } 
                        n = 0;
                        while (n < 2 * rowUpper + 1) {
                            System.out.print("*");
                            n++;
                        }
                        System.out.println();
                        rowUpper++;
                    } while (rowUpper < height);
                    do {
                        n = 0;
                        while (n < rowLower + 1) {
                            System.out.print(" ");
                            n++;
                        }
                        n = 0;
                        while (n < 2*heightLower - 2*rowLower - 1) {
                            System.out.print("*");
                            n++;
                        }
                        System.out.println();
                        rowLower++;
                    } while (rowLower < heightLower);
                    

            } else {
                initiate = 0;
            }

        } while (initiate != 0);

        scan.close();
    }
}
