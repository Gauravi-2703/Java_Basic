// 1)	display a table of a particular number   

import java.util.Scanner;

class Table{

    public static void CreateTable(int no)
    {

        for(int i=1;i<=10;i++)
        {
            System.out.println(no+" * "+i+" = "+no*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int value=sc.nextInt();
         CreateTable(value);



    }
}