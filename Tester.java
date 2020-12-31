public class Tester {
	public static void main (String[]args){
        
        //Real Number
        System.out.println("RealNumber:");
        RealNumber a1 = new RealNumber(0);
        RealNumber b1 = new RealNumber(0);
        System.out.println(a1.equals(b1)); //testing equals: true
        System.out.println(a1.equals(b1));
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
        RationalNumber c2 = new RationalNumber(4,-8);
        System.out.println(b2.equals(c2)); //testing equals: false
        System.out.println(c2.toString()); //testing tostring & reduce

        System.out.println(a2.multiply(c2)); //testing multiply: 3/16
        System.out.println(a2.divide(c2)); //testing divide: 3/4
        System.out.println(a2.add(c2)); //testing add: -7/8
        System.out.println(a2.subtract(c2)); //testing subtract: 1/8

        RationalNumber d2 = new RationalNumber(4,0); //testing denom 0
        System.out.println(d2.getValue());
        System.out.println(d2.toString());

        RationalNumber e2 = new RationalNumber(0,4); //testing nume 0
        System.out.println(e2.getValue());
        System.out.println(e2.toString());
    }
}