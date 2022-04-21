package in.SpringMaven.ConstructorInjection;

public class Triangle {
	//Creating member variable 
	private String type;
	private int height;
	
	//Using constructor injection
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	//Source getters
	public String getType() {
		return type;
	}	
		
	public int getHeight() {
		return height;
	}

	
    
	//SetterInjection
	/*
	 * public void setType(String type) { 
	 *    this.type = type; 
	 *  }
	 */
	public void draw(){
		System.out.println(getType()+"Triangle Drawn of Height : "+getHeight());
	   }
}

