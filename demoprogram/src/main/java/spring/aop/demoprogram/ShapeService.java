package spring.aop.demoprogram;

public class ShapeService {
	
	private Triangle triangle;
	private Circle circle;
	String message;
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ShapeService [triangle=" + triangle + ", circle=" + circle
				+ "]";
	}
	
	

}
