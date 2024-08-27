public class Pattern2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int z = (i <= 5) ? i : 11 - i;

            for (int j = 1; j <= z; j++)
            {
                System.out.print(z);
                if (j < z)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}