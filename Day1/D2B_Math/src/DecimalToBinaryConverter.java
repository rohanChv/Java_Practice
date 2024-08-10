public class DecimalToBinaryConverter {
    public int convertToBinary(int decimalNumber){
        int inputNumber=decimalNumber;
        int binaryNumber=0;
        int remainder=0;
        int i=0;
        while (inputNumber>0){
            remainder=inputNumber%2;
            inputNumber=inputNumber/2;
            binaryNumber+=remainder*Math.pow(10,i);
            i++;
            System.out.println("BinaryNum is "+binaryNumber);
        }
        return binaryNumber;
    }
}
