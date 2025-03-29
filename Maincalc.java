class Calculator{
public int add(int a, int b){
return a+b;
}
public double add(double a, double b){
return a+b;
}
public int add(int a, int b, int c){
return a+b+c;
}
}

class Maincalc{
public static void main(String[] args){

Calculator c = new Calculator();
System.out.println("The sum of two integers 5,4 is:"+c.add(5,4));
System.out.println("The summ of two doubles 3.6,2.8 is:"+c.add(3.6,2.8));
System.out.println("The sum of three integers 3,4,5 is:"+c.add(3,4,5));
}
}