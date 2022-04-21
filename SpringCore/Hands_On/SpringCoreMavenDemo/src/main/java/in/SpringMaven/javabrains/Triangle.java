package in.SpringMaven.javabrains;

public class Triangle {
	//Creating member variable 
	private String type;
	
	//Source getters and setters.
	public String getType() {
		return type;
	}
    
	//SetterInjection
	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println(getType()+"Triangle is Drawn....");
	   }
}

