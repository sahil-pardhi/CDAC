public class Pattern9
{
    public  static  void main(String args[])
    {

        for (int i = 1; i <= 5 ; i++)
        {
            int count= 5;
            for (int j = 1; j <= i ; j++)
            {
                System.out.print(count);
                if(j < i)
                {
                    System.out.print("*");
                }

                count--;
            }

            System.out.println();
        }
    }

}