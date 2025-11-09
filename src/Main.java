import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // variables and datatypes

        // datatupe <name> = <value>
        int age =23;
        // data types : premitive and non premitive data types
        // premitive : int , char , boolean , string , float , double , bit etc.
        // non premitive : arrays , stack , queues

//        char c='c';
//        String str="sanglap";
//        boolean b= false;
//        float f=1.2f;
//        double d=12.3;

        // operators : mathematical and logical operator

//        math : + - * / %

//        int num1 =11;
//        int num2=5;

//        System.out.println("the sum of num1 and num2 is "+(num1 + num2));
//        System.out.println("the substraction of num1 and num2 is "+(num1 - num2));
//        System.out.println("the multiply of num1 and num2 is "+(num1 * num2));
//        System.out.println("the devide of num1 and num2 is "+(num1 / num2));
//        System.out.println("the devide of num1 and num2 is "+(num1 % num2));

        // logical operators

        // or and not : && ,|| , ~

        // conditional statements

        // take an input from user of his age ,

//        Scanner sc=new Scanner(System.in);


//        System.out.println("Enter your age : ");
//        int age_new = sc.nextInt();

//        System.out.println("Enter your name : ");
//        String name=sc.next();


//        System.out.println("The user's age is : "+age_new);
//        System.out.println("The user's name is : "+name);

        // conditional statement

//        if( age_new > 18 ) {
//            System.out.println("you are eligible");
//        }
//        else {
//            System.out.println("you are not eligible");
//        }

       // nested conditional statements
//        if(age_new >18){
//
//            if(age_new < 60){
//                System.out.println("eligible");
//            }
//            else{
//                System.out.println("not eligible");
//            }
//
//        }
//        else{
//            System.out.println("not eligible");
//        }


        // logical operator

//        if ( (age_new > 18) && (age_new <60) ){
//            System.out.println("eligible");
//        }
//        else{
//            System.out.println("not eligible");
//        }

        // loops : for , while , do while


//        int i=1;
//        ++i -> first increment it then use it ->pre increment
//        i++ -> first use it then increment it

//        System.out.println(i++);
//
//        System.out.println(i);



//        for(int i=1 ; i<=10 ; i++){
//            System.out.println(i);
//        }
//        System.out.println(i); --> scope

//        int i=1;
//
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }


        // 1. take user's accaunt balance as input , if the balance is > 10,000 you are eligble for the card , else you are not eligible

        // 2. take a fruit name as input from user , if the fruit name is apple or banana then print eat , else print dont eat

        // 3. take a integer input from user and print it's table



//        int num =sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(num+"*"+i+"="+(num*i));
//        }


//        int inc=1;
//
//        while(inc<=10){
//            System.out.println(num+"*"+inc+"="+(num*inc));
//            inc++;
//        }


        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();

//        if(a==b){
//            System.out.println("equal");
//        }
//        else{
//            if(a>b){
//                System.out.println(a);
//            }
//            else{
//                System.out.println(b);
//            }
//        }

//        if(a > b){
//            System.out.println(a);
//        }
//        else if(b>a){
//            System.out.println(b);
//        }
//        else{
//            System.out.println("Equal");
//        }

        System.out.println("Enter your marks");
        int marks=sc.nextInt();

        if(marks >= 90){
            System.out.println("your grade is A");
        }
        else if(marks >=80){
            System.out.println("Your grade is B");
        }
        else if(marks >=60){
            System.out.println("your grade is C");
        }
        else if(marks>=40){
            System.out.println("your grade is D");
        }
        else{
            System.out.println("You have failed");
        }






    }

}
