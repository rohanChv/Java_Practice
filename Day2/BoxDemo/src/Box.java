public class Box {
    double height,width,depth;
    Box(){
        height=5;
        width=5;
        depth=5;
        System.out.println("Default Box Dimensions "+height+" X "+width+" X "+depth);
    }
    Box(double height,double width,double depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
        System.out.println("Not a Default Box."+" Dimensions :"+height+" X "+width+" X "+depth);
    }
}
