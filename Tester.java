public class Tester {
	public static void main (String[]args){
        
        //Real Number
        System.out.println("RealNumber:");
        RealNumber a1 = new RealNumber(0);
        RealNumber b1 = new RealNumber(0);
        System.out.println(a1.equals(b1)); //testing equals: true
        RealNumber c1 = new RealNumber(499.996);
        RealNumber d1 = new RealNumber(500);
        System.out.println(c1.equals(d1)); //testing equals: true
        RealNumber e1 = new RealNumber(100);
        System.out.println(d1.equals(e1)); //testing equals: false

        System.out.println(d1.add(e1)); //testing add
        System.out.println(d1.multiply(e1)); //testing multiply
        System.out.println(d1.divide(e1)); //testing divide
        System.out.println(d1.subtract(e1)); //tesing subtract

        //Rational Number
        System.out.println("RationalNumber:");
        RationalNumber a2 = new RationalNumber(-3,8);
        System.out.println(a2.getValue()); //testing getvalue
        System.out.println(a2.getNumerator()); //testing getnumerator
        System.out.println(a2.getDenominator()); //testing getdenominator
        System.out.println(a2.reciprocal().getValue()); //testing reciprocal

        RationalNumber b2 = new RationalNumber(-3,8);
        System.out.println(a2.equals(b2)); //testing equals: true
        RationalNumber c2 = new RationalNumber(4, 8);
        System.out.println(b2.equals(c2)); //testing equals: false

        System.out.println(a2.toString()); //testing tostring
    }
}