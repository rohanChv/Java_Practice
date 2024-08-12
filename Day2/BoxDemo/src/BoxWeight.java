public class BoxWeight extends Box{
    double weight;
    String name;
    BoxWeight(){
        weight=20;
        name="Default Box";
    }
    void returnDetails(){
        System.out.println(name+" has weight "+weight+" KG "+"has volume "+(height*depth*width)+" m3");
    }
    BoxWeight(double h,double w,double d,double weight,String name){
        super(h,w,d);
        this.weight=weight;
        this.name=name;
    }
}
