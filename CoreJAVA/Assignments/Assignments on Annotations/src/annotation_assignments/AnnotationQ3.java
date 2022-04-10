package annotation_assignments;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    int Sequence() default 0;
}

class MyClass{
    int pin;
    public MyClass(int pin){
        this.pin=pin;
    }
    @Execute(Sequence=2)
    public void myMethod1(){
    }
    @Execute(Sequence=1)
    public void myMethod2(){
    }
    @Execute(Sequence=3) 
    public void myMethod3(){ 
    } 

}

public class AnnotationQ3 {
    public static void main(String[] args) {
        MyClass s= new MyClass(16);
        
        Class t=s.getClass();
        Annotation a=t.getAnnotation(Execute.class);
        
        Execute ex=(Execute)a;
        System.out.println(ex.Sequence());
    }
}
