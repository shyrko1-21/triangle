import java.util.Scanner;

public class Triangle {

    public boolean isDataValid(String a, String b, String c) {
        try{
            int sideA = Integer.parseInt(a);
            int sideB = Integer.parseInt(b);
            int sideC = Integer.parseInt(c);
            return sideA * sideB * sideC > 0;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean isTriangle(int a, int b, int c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    public boolean isIsoscelesTriangle(int a, int b, int c) {
        return a == b || a == c || b ==c;
    }

    public boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && a == c;
    }




}
