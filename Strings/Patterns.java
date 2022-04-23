public class Patterns {
    public static void main(String[] args) {

        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern17(4);
        System.out.println();
        pattern31(4);
        System.out.println();

    }
    static void pattern1(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int num) {
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int num){
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int num){
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" " );
            }
            System.out.println();
        }
    }
    static void pattern5(int num){


        for(int row=0;row<num*2;row++){
            int totalCols=row>num? 2*num-row:row;
            for (int col = 0; col <totalCols; col++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
    static void pattern28(int num){
        for(int row=0;row<2*num;row++){
            int totalCols=row>num?2*num-row:row;
            int totalSpaces=num-totalCols;
            for(int i=0;i<totalSpaces;i++){
                System.out.print(" ");
            }
            for(int cols=0; cols<totalCols;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static  void pattern30(int num) {
        for (int row = 1; row <= num; row++) {
            int totalSpaces = num - row;
            for (int i = 0; i < totalSpaces; i++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
        static void pattern17(int num){
            for(int row=1;row<2*num;row++ ){
                int totalCols=row>num?2*num-row:row;  //totalCols is highest no in row
                int totalSpaces=num-totalCols;
                for(int i=0; i<totalSpaces;i++){
                    System.out.print("  ");
                }
                for(int col=totalCols;col>=1;col--){
                    System.out.print(col+" ");
                }
                for(int col=2;col<=totalCols;col++){
                    System.out.print(col+" ");
                }
                System.out.println();
            }
    }
    static void pattern31(int num){
        int n=2*num;
        for(int row=0;row<=n; row++){
            for(int col=0;col<=n;col++){
               int atEveryIndexes=num-Math.min(Math.min(row,col),Math.min(n-row,n-col));
               System.out.print(atEveryIndexes+" ");
            }
            System.out.println();
        }
    }
    }

