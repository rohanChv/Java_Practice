public class SubClass extends SuperClass{

    int k;
    SubClass(int k){
        this.k=k;
    }
    void sum(){
        System.out.println("Default Sum is "+(super.i+super.j+k));
    }
}
