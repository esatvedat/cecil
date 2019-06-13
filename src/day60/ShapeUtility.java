package day60;

import day58_PolymorphismIntro.Dog;
import day58_PolymorphismIntro.Drawable;
import day58_PolymorphismIntro.Shape;
import day58_PolymorphismIntro.Square;
import day58_PolymorphismIntro.Triangle;

public class ShapeUtility {
	public static void main(String[] args) {
		
		Shape s1 = new Triangle("Red", 12, 10);
		describeTheShape(s1);
		describeTheShape(new Triangle("Red", 12, 10));
		
		describeTheShape(new Square("blue", 15));
		
		describeTheShape(new Triangle("purple", 2, 5));
		
		describeTheShape(new Dog());
		
		Shape myShape = getAnyShape();
		myShape.draw();
		
		
		ShapeUtility util = new ShapeUtility();
		//util.getAnyDrawable(); -> if Drawable is static, if not use without static
		
		Drawable myDrawable = getAnyDrawable();
		myDrawable.drawLine(2);
		
	}
	public static Drawable getAnyDrawable() {
		Drawable d1 = new Triangle("red", 12, 100);
		return d1;
			
	}
	public static Shape getAnyShape() {
		Shape s1 = new Square("blue", 15);
		return s1;
		//return new Square("blue", 15);
	}
	
	//we dont want to create object while calling this 
	//utility method so we just made it static
	public static void describeTheShape(Shape anyShape) {
		System.out.println("calling describeTheShape(Shape anyShape)");
		anyShape.draw();
	}
	//create another method that accept Triangle object only
	
	public static void describeTheShape(Triangle anyTriangle) {
		System.out.println("calling describeTheShape(Triange anyTriangle)");
		anyTriangle.draw();
	}
	
	public static void describeTheShape(Object anyObject) {
		System.out.println("calling describeTheShape(Object anyObject)");
		//anyObject.draw();--> you cant draw any object
		//anyObject.makeNoise(); --> cant compile
		
	}
	
	
	
	

}
