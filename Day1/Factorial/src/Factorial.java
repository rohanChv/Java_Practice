public class Factorial {
    int factorialByRec=1;
    public int getFactorial(int inputNumber){
        int input=inputNumber;
        int factorial=1;
        for(int i=1;i<=inputNumber;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public int getFactorialByRecursion(int inputNumber){
        int input=inputNumber;

        if(input==1)
            return 1;
        else
            factorialByRec=input*getFactorialByRecursion(--input);
        return factorialByRec;

    }
}
