//simple calculator
import java.io.*;
import java.lang.*;
import java.util.*;
public class Basiccalculator
{
public static void main(String args[])
{
double num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers:");
num1=sc.nextDouble();
num2=sc.nextDouble();
System.out.println("enter the operator(+,-,*,/):");
char op=sc.next().charAt(0);
double o=0;
switch(op)
{
case '+':
o=num1+num2;
break;
case '-':
o=num1-num2;
break;
case '*':
o=num1*num2;
break;
case '/':
o=num1/num2;
break;
default:
System.out.println("you enter wrong input:");
}
System.out.println("the final result:");
System.out.println();
//result
System.out.println(num1 + " "+op+ " "+num2 + " = "+o);
}
}




 