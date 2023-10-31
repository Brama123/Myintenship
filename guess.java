import java.util.Random;
import java.util.Scanner;
public class Numberguessinggame
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Random random=new Random();
int lowerbound=1;
int upperbound=100;
int numbertoguess=random.nextInt(upperbound-lowerbound+1)+lowerbound;
int numberoftries=0;
System.out.println("welcome to number guessing game:");
int playerguess;
boolean hasguessedcorrectly=false;
while(!hasguessedcorrectly)
{
System.out.println("enter your guess: ");
playerguess=sc.nextInt();
numberoftries++;
if(playerguess<lowerbound||playerguess>upperbound)
{
System.out.println("your guess is out of specified range:");
}
else if(playerguess<numbertoguess)
{
System.out.println("too low!try again:");
}
else if(playerguess>numbertoguess)
{
System.out.println("too high!try again:");
}
else
{
System.out.println("congratulations!you guessed the number" +numbertoguess+ "in"+numberoftries+"attempts:");
break;
}
}
sc.close();
}
}






 