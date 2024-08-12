public class BinaryOperation {
    public String addBinaryStrings(String firstInput,String secondInput){
        Integer inputOneAsInteger= Integer.parseInt(firstInput,2);
        Integer inputTwoAsInteger=Integer.parseInt(secondInput,2);
        System.out.println("Decimal Values are "+Integer.parseInt(firstInput,2)+","+Integer.parseInt(secondInput,8));
        int sum= inputTwoAsInteger+inputOneAsInteger;
        return Integer.toBinaryString(sum);
        /*
        Important parseInt will convert all the String to Integer. radix is BAse . String can be converted to DEcimal,Octal Number
         */
    }
}
