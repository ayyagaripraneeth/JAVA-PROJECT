class Shape{
public int calculateArea(int a){
return a*a;
}
public int calculateArea(int a, int b){
return 2*(a+b);
}
}
class Circle extends Shape{
public double claculateArea(double radius){
return Math.PI*radius*radius;
}
}
class Main{
public static void main(String args[]){
Shape s = new Shape();
Circle c = new Circle();
System.out.println("The Area of a square with side 5 is:"+s.calculateArea(5));
System.out.println("The Area of a rectangle with 5,4 length and breadth is:"+s.calculateArea(5,4));
System.out.println("The Area of a circle with radius 7 is:"+c.calculateArea(7));
}
}


