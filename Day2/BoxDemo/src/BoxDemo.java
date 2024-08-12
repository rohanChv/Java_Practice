public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight boxOne=new BoxWeight();
        boxOne.returnDetails();
        BoxWeight boxTwo=new BoxWeight(4,4,4,40,"boxTwo");
        boxTwo.returnDetails();
    }
}
