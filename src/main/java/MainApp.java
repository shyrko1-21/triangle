import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side a:");
        String a = in.next();
        System.out.println("Enter side b:");
        String b = in.next();
        System.out.println("Enter side c:");
        String c = in.next();
        Triangle triangle = new Triangle();

        if (!triangle.isDataValid(a,b,c)) {
            System.out.println("Data is not valid");
        } else {
            int sideA = Integer.parseInt(a);
            int sideB = Integer.parseInt(b);
            int sideC = Integer.parseInt(c);
            if (!triangle.isTriangle(sideA,sideB,sideC)) {
                System.out.println("The numbers can't be triangle's sides");
            } else {
                if (triangle.isEquilateralTriangle(sideA,sideB,sideC)) {
                    System.out.println("Equilateral triangle");
                } else if (triangle.isIsoscelesTriangle(sideA,sideB,sideC)) {
                    System.out.println("Isosceles triangle");
                } else {
                    System.out.println("Ordinal triangle");
                }
            }
        }
    }
}
