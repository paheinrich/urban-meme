public class Tutorial {

    public static void main(String []args ){
        System.out.println(mathPower(2,3));
    }
    public static int mathPower(int base, int exponent) {

        int n = 1;
        for(int i=1; i<=exponent; i++) {
        	n *= base;
        }

    return n;}
    }
