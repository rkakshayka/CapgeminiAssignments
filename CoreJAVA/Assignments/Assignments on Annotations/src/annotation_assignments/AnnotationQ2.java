package annotation_assignments;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int AuthorID();
	String Author();
	String Supervisor();
	String Date();
	String Time();
	int Version();
	String Description() default "Devloper class";
}

@Info(AuthorID=6,Author="Akshay",Supervisor="Kaushik",Date="8 feb",Version=3, Time = "6pm")

public class AnnotationQ2 {
	public static void main(String[] args) {
		
	}

}
