import java.util.Scanner;

public class TestComplex
{
public static void main(String args[])
{
// System.out.println("Введите операцию с комплексными числами в виде x + yi");
// Scanner sc = new Scanner(System.in);
/* double x = Double.valueOf(sc.next());
String ch = sc.next();
String yi = sc.next();
Double y = Double.valueOf(yi.substring(0,yi.indexOf('i')));*/
// Complex c = new Comple(x, y);
System.out.println("Если хотите сложить комплексные числа, нажмите 1");
System.out.println("Если хотите вычесть одно число из другого, нажмите 2");
System.out.println("Если хотите найти модуль комплексного числа, нажмите 3");
System.out.println("Если хотите найти аргумент комплексного числа, нажмите 4");
double x1, y1, x2, y2;
String ch1, ch2, z, y1i, y2i;
Scanner sc = new Scanner(System.in);
int i = sc.nextInt();
Complex c1;
Complex c2;
switch (i)
{
case 1:
System.out.println("Введите операцию с комплексными числами в виде x1 +/- y1i + x2 +/- y2i");
x1 = Double.valueOf(sc.next());
ch1 = sc.next();
y1i = sc.next();
if (y1i.equals("i"))
y1 = 1;
else
y1 = Double.valueOf(y1i.substring(0,y1i.indexOf('i')));
z = sc.next();
x2 = Double.valueOf(sc.next());
ch2 = sc.next();
y2i = sc.next();
if (y2i.equals("i"))
y2 = 1;
else
y2 = Double.valueOf(y2i.substring(0,y2i.indexOf('i')));
if (ch1.equals("-"))
y1 *= -1;
if (ch2.equals("-"))
y2 *= -1;
c1 = new Complex(x1, y1);
c2 = new Complex(x2, y2);
System.out.println("\n" + "Ответ: z1 + z2 = " + Complex.add(c1, c2));
break;
case 2:
System.out.println("Введите операцию с комплексными числами в виде x1 +/- y1i - x2 +/- y2i");
x1 = Double.valueOf(sc.next());
ch1 = sc.next();
y1i = sc.next();
if (y1i.equals("i"))
y1 = 1;
else
y1 = Double.valueOf(y1i.substring(0,y1i.indexOf('i')));
z = sc.next();
x2 = Double.valueOf(sc.next());
ch2 = sc.next();
y2i = sc.next();
if (y2i.equals("i"))
y2 = 1;
else
y2 = Double.valueOf(y2i.substring(0,y2i.indexOf('i')));
if (ch1.equals("-")) y1 *= -1;
if (ch2.equals("-"))
y2 *= -1;
c1 = new Complex(x1, y1);
c2 = new Complex(x2, y2);
System.out.println("\n" + "Ответ: z1 - z2 = " + Complex.sub(c1, c2));
break;
case 3:
System.out.println("Введите комплексное число в виде x +/- yi");
x1 = Double.valueOf(sc.next());
ch1 = sc.next();
y1i = sc.next();
if (y1i.equals("i"))
y1 = 1;
else
y1 = Double.valueOf(y1i.substring(0,y1i.indexOf('i')));
if (ch1.equals("-")) y1 *= -1;
c1 = new Complex(x1, y1);
System.out.println("\n" + "Ответ: mod(z) = " + c1.mod());
break;
case 4:
System.out.println("Введите комплексное число в виде x +/- yi");
x1 = Double.valueOf(sc.next());
ch1 = sc.next();
y1i = sc.next();
if (y1i.equals("i"))
y1 = 1;
else
y1 = Double.valueOf(y1i.substring(0,y1i.indexOf('i')));
if (ch1.equals("-")) y1 *= -1;
c1 = new Complex(x1, y1);
System.out.println("\n" + "Ответ: arg(z) = " + c1.arg());
break;
default:
break;
}
sc.close();
}
}