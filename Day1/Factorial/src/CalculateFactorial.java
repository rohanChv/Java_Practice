public class CalculateFactorial {
    public static void main(String[] args) {
        Factorial factorialOne=new Factorial();
        System.out.println("By Normal For Loop: "+factorialOne.getFactorial(9));
        System.out.println("By Recursion :"+factorialOne.getFactorialByRecursion(9));
    }
}
