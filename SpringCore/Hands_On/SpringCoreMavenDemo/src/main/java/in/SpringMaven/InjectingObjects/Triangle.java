package in.SpringMaven.InjectingObjects;

public class Triangle {
	private PointObject pointA;
	private PointObject pointB;
	private PointObject pointC;
	
	
	public PointObject getPointA() {
		return pointA;
	}

	public void setPointA(PointObject pointA) {
		this.pointA = pointA;
	}

	public PointObject getPointB() {
		return pointB;
	}

	public void setPointB(PointObject pointB) {
		this.pointB = pointB;
	}

	public PointObject getPointC() {
		return pointC;
	}

	public void setPointC(PointObject pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("Point A = (" + getPointA().getX()+", "+getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX()+", "+getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX()+", "+getPointC().getY() + ")");
	}
}

