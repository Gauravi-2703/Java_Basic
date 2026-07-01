/*Write a Java program to print numbers from 1 to N, skipping numbers that end with digit 5.

[ means if we devide by 10 remainder shouldn't be  5 ]*/

class Program18
{
    public static void main(String[] args) {
        int digit=0;
        for(int i=1;i<=100;i++)
        {
            digit=i%10;
            if(digit==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}