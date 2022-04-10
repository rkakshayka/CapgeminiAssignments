package generics_assignments;

import java.lang.String;

public class GenericQ4 {
	  public static void main(String[] args) {
	      pair<String, String> object1 = new pair<String, String>("1","Hello");
	      System.out.println("Key: "+object1.getKey()+"|"+"Value: "+object1.getValue());
	      /**
	      pair<String, String> object2 = new pair<String, String>("2","Hi");
	      pair<String, String> object3 = new pair<String, String>("3","Bye");
	      
	      System.out.println(object2.getObj1()+"|"+object2.getObj2());
	      System.out.println(object3.getObj1()+"|"+object3.getObj2());
	      **/
	  }
	}
class pair<K,V>{
	private K obj1;
	private V obj2;

	public pair(K obj1,V obj2){
		this.obj1=obj1;
	    this.obj2=obj2;
	  }
	
	//generated using source but changed method name
	public K getKey() {
	    return obj1;
	  }
	
	public V getValue() {
	    return obj2;
	  }

	}
	
	  
	