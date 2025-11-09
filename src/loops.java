import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

//        for ( int i=1;i<11;i++) {
//            System.out.println(i);
//        }
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for( int i=1;i<11 ;i++){
//            System.out.println(n+" X "+i+" = "+(n*i)); // 2 X 1 = 2
//        }

//        int n=sc.nextInt();

        // I want to run a loop n time
//        for (int i=1 ; i<=n ; i++){ // this will run a loop n times
//            System.out.print("*");
//        }

//        for(int i=0; i<=n ;i++){
//            System.out.println("*");
//        }


        //10--> 1
        // i=1 --> 10 (10-i+1) (10-1+1)
        // i=2 --> (10-2+1) = 9
         for(int i=1 ; i<11 ;i++){
            System.out.println(10-i+1);
        }

        for (int i=10 ; i>=1 ; i--){
            System.out.println(i);
        }


    }
}
