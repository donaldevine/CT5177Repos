package testproject;

public class PassByValue {
public static void main(String[] args) {
int x=10, y=20;
System.out.println("main method before method call x = "+ x +" y = " + y);
myMethod(x,y); // method call
System.out.println("main method after method call x = " + x + " y = " + y);
} // end main method
public static void myMethod(int x, double y ) {
System.out.println("myMethod before assignment x = " + x + " y = " + y);
x = 25;
y = 35.4;
System.out.println("myMethod after assignment x = " + x + " y = " + y);
} // end myMethod
} // end class