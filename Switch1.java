
import java.util.Scanner;

// Write a Java program to display the day of the week based on a number:
// •	1 → Monday
// •	2 → Tuesday
// •	3 → Wednesday
// •	4 → Thursday
// •	5 → Friday
// •	6 → Saturday
// •	7 → Sunday

class program1
{
    public static void Display(int no)
    {

        switch(no)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int value = 0;
        System.err.println("Enter the number : ");
        value = sobj.nextInt();

        Display(value);    
    }
}