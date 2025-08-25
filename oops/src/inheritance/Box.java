package inheritance;

public class Box {

    double l;
    double h;
    double w;

    Box(){
        l=-1;
        h=-1;
        w=-1;
    }

    Box(double l, double h, double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }

    Box(double l){
        this.h=l;
        this.l=l;
        this.w=l;
    }

    public void information(){
        System.out.println("This is running box");
    }
}
