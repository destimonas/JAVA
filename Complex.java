class Complex
{
int real;
int imaginary;
Complex(int r)
{
	real=r;
	imaginary=r;
}
void display()
{
	System.out.println(real+"+"+imaginary+"i");
}
public static Complex add(Complex n1,Complex n2)
{
	Complex r1=new Complex(0);
	r1.real=n1.real+n2.real;
	r1.imaginary=n1.imaginary+n2.imaginary;
	return r1;
	
}
 public static void main(String arg[])
 {
        Complex c1 = new Complex(5);
        Complex c2 = new Complex(8);
        System.out.print("first Complex number:");
		c1.display();
        System.out.print("\nSecond Complex number:");
		c2.display();
        Complex r1 = add(c1,c2);
        System.out.print("\nAddition is:");
		r1.display();
       
    }
}
