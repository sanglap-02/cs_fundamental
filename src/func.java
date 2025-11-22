public class func {

    // function defination

    // <specifier> <static/non static> <return type> <name> (<arguments>) {
    //      function kaya karega
    //  }

//    public static void sum (int a, int b) {
//        //function kaya karega
//
//        int result = a+b;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(result);
//
//
//    }

    public static int sum(int a, int b){
        int result =a+b;

        return result;
    }


    public static int sumOfDigit (int a){
        int sum=0;
        while (a!=0){
            int lastDigit = a % 10;
            sum = sum+lastDigit;
            a=a/10;
        }
        return sum;
    }


    // entry point of the code
    public static void main(String[] args) {

//        int i= 10;
//        int j=20;

        //function calling
//        sum(10,20);
//        int res = sum(i,j);
//        System.out.println(res);


        // write a function which will take an integer as input and return the sum of its digit

        // --> 456 4+5+6=15, 5678 5+6+7+8=

        int a = 456;

        int result = sumOfDigit(a);
        System.out.println(result);



    }
}
