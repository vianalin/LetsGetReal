public class Tester {
	public static void main (String[]args){
        
        //RealNumber
        RealNumber a = new RealNumber(0);
        RealNumber b = new RealNumber(0);
        System.out.println(a.equals(b)); //testing equals: true
        RealNumber c = new RealNumber(499.996);
        RealNumber d = new RealNumber(500);
        System.out.println(c.equals(d)); //testing equals: true
        RealNumber e = new RealNumber(100);
        System.out.println(d.equals(e)); //testing equals: false

        System.out.println(d.add(e)); //testing add
        System.out.println(d.multiply(e)); //testing multiply
        System.out.println(d.divide(e)); //testing divide
        System.out.println(d.subtract(e)); //tesing subtract
    }
}