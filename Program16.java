// Write a Java program to accept marks of students and skip invalid marks (less than 0 or greater than 100).

import java.util.Scanner;

class Program16
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks=obj.nextInt();
        if((marks>100)||(marks<0))
        {
            System.out.println("INVALID MARKS!");
        }
        else
        {
            System.out.println("valid marks "+ marks);
        }
    }
}