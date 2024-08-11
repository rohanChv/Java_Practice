public class D2cMAth {
    public int getBinary(int inputNumber){
        int input=inputNumber;
        int remainder=0;
        int binary=0;
        int i=0;
        while(input>0){
            remainder=input%2;
            input=input/2;
            binary=binary+(remainder*(int)Math.pow(10,i));
            i++;
        }
        return binary;
    }
}
