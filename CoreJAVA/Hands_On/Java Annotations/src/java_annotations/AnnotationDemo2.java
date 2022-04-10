package java_annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
@interface SmartPhone{
	//Marker Annotation- no value
}**/

/**
@interface SmartPhone{
	//Single Value Annotation- 1value
	 String os();
}**/


//Meta Annotations
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface SmartPhone{
	//Multi value Annotation - more than 1 value
	 String os() default "apple";
	 int version() default 2;
}
@SmartPhone(os="Android",version=6)
class nokiaASeries{
	String model;
	int size;
	public nokiaASeries(String model, int size) {
		this.model=model;
		this.size=size;		
	}
}

public class AnnotationDemo2 {
	public static void main(String[] args) {
		nokiaASeries obj = new nokiaASeries("Fire", 5);
		
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		//typecasting
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.version());
		
	}
}
