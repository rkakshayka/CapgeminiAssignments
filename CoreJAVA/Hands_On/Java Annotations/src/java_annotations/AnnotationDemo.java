package java_annotations;

import java.util.ArrayList;

@FunctionalInterface
interface Abc{
	void show();
	//void add();
}

class A
{
	public void show() {
		System.out.println("in A");
		
	}
}

class B extends A{
	@Deprecated
	public void showData() {
		
	}
	@Override
	@SuppressWarnings("unchecked")
	public void show() {
		ArrayList obj = new ArrayList();
		System.out.println("in B");
	}
}

public class AnnotationDemo {
	public static void main(String[] args) {
		
	}

}
