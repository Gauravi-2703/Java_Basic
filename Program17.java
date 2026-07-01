/* Write a Java program to print numbers from 1 to 100, skipping:
	Numbers divisible by 3
	Numbers divisible by 7*/

    class Program17
    {
        public static void main(String[] args) {
            for(int i=1;i<=100;i++)
            {
                if((i%3==0)||(i%7==0))
                {
                    continue;
                }
                System.out.println(i);
            }
        }
    }