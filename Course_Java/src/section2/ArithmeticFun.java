package section2;

public class ArithmeticFun {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        //binary
        int result=a+b;
        int difference =a-b;
        int product = a*b;
        int quotient = a/b;
        int remainder =a%b;

        System.out.println("result : "+result);
        System.out.println("diff is : "+difference);
        System.out.println("product is : "+product);
        System.out.println("quotient is : "+quotient);
        System.out.println("remainder is : "+remainder);

        result+=28;
        System.out.println("result now is : "+result);
        //unary
        result++;
        System.out.println("result now is : "+result);

        result--;
        System.out.println("result now is : "+result);

        product*=2;
        System.out.println("product now is : "+product);
    }
}
