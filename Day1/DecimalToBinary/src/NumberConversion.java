public class NumberConversion {
    public static void main(String[] args) {
        int[] outputBinaryArray=new int[10];
    DecimalToBinary numberOne=new DecimalToBinary();
    outputBinaryArray=numberOne.getBinaryArray(17);

    for (int j=0;j<outputBinaryArray.length-1;j++){
        System.out.print(outputBinaryArray[j]);
    }
    }
}
