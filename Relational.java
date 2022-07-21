package Operators11;

public class Relational {
    public static void main(String[] args) {
        int x = 20;
        double y = 45;
        double z, z1,z2,z3;
        System.out.println("x is = " + x + "y is =" + y );
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x -= y);
        // now x's value = -25
        System.out.println(x *= y);
        System.out.println( y /= x);
        System.out.println(x %= y);
        //System.out.println(y ^= x);
        System.out.println( x > y && y < x);
        System.out.println( x < y || y < x);
        System.out.println(!(x < y && y > x ));




    }

}
