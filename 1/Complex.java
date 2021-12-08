public class Complex
{
double x, y;
double pi = 3.14;
public Complex(){}
public Complex(double x, double y)
{
this.x = x;
this.y = y;
}
public double mod()
{
return (Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)));
}
public static String add(Complex c1, Complex c2)
{
String n;
if (c1.y + c2.y < 0)
n = "-";
else
n = "+";
return (c1.x+c2.x + n + Math.abs(c1.y + c2.y) + "i");
}
public static String sub(Complex c1, Complex c2)
{
String n;
if (c1.y - c2.y < 0)
n = "-";
else
n = "+";
return (c1.x-c2.x + n + Math.abs(c1.y - c2.y) + "i");
}
public double arg()
{
return (Math.atan(y/x));
}
}