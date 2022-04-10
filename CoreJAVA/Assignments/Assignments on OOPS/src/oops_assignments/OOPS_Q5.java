package oops_assignments;

public class OOPS_Q5 {
	public static void main(String[] args) {
        shape l=new line();
        shape r=new rectangle();
        shape c=new cube();
        shape s=new square();
        draw_All(l);
        draw_All(r);
        draw_All(c);
        draw_All(s);
    }
    //Method to call methods from four different classes
    public static void draw_All(shape All_shapes){
    	All_shapes.draw();
    }
}

abstract class shape {
    abstract void draw();
}

class line extends shape {
    public void draw(){
        System.out.println("This is a Line ");
    }
}
class rectangle extends shape {
    public void draw(){
        System.out.println("This is a Rectangle");
    }
}
class cube extends shape{
    public void draw(){
        System.out.println("This is a Cube");
    }
}
class square extends shape{
    public void draw(){
        System.out.println("This is a Square");
    }
}
