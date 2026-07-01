	/*declare two numbers and one operator as a character. e.g. '+'
using switch... case check which operator is declared and accordingly perform the action.*/

import java.util.Scanner;

class Program3
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENter 1st value:");
        int no1=obj.nextInt();
        System.out.println("Enter 2nd value: ");
        int no2=obj.nextInt();
        System.out.println("Enter any of the operator among: +\t -\t *\t / \t "); 
        char ch=obj.next().charAt(0);   
        switch (ch)
         {
                case '+':
                    System.out.println("Your ans is: "+ (no1+no2));
                    break;
                case '-':
                    System.out.println("your ans is: "+(no1-no2));
                    break;
                case '*' :
                    System.out.println("Your ans is: "+(no1*no2));
                    break;
                case '/' :
                    System.out.println("Your ans is: "+(no1/no2));
                    break;
                default:
                    System.out.println("You are inserting wrong operator! ");
                    break;
        }
    }
}