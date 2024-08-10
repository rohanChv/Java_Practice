public class DecimalToBinary {
    int[] binaryArray=new int[10];
    public int[] getBinaryArray(int inputDecimalNumber){
        int decimalNumber=inputDecimalNumber;
        int i=0;
        System.out.println("Input number is"+inputDecimalNumber);
        while (decimalNumber>0){

            binaryArray[i]=decimalNumber%2;
            System.out.println("Inserted "+decimalNumber%2+" at "+i);
            System.out.println(binaryArray[i]);
            decimalNumber=decimalNumber/2;
            i++;
        }
        return binaryArray;
    }
}
