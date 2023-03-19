class ComplexNumber
{
int real;
int imaginary;
ComplexNumber(int r, int i)
{
	real=r;
	imaginary=i;
}
void display()
{
	System.out.println(real+"+"+imaginary+"i");
}
public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
{
	ComplexNumber r1=new ComplexNumber(0,0);
	r1.real=n1.real+n2.real;
	r1.imaginary=n1.imaginary+n2.imaginary;
	return r1;
	
}
 public static void main(String arg[])
 {
        ComplexNumber c1 = new ComplexNumber(10, 5);
        ComplexNumber c2 = new ComplexNumber(11, 5);
        System.out.print("first Complex number:");
		c1.display();
        System.out.print("\nSecond Complex number:");
		c2.display();
        ComplexNumber r1 = add(c1,c2);
        System.out.print("\nAddition is:");
		r1.display();
       
    }
}


