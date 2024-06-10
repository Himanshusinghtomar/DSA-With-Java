package BasicOfJava;

public class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();

//        p.squarePatter();
//        p.triangle();
//        p.oneToFivePattern();
//        p.oneOneToFiveFivePattern();
//        p.reverseTriangle();
//        p.erect_pyramid(5);
//        p.inverted_pyramid(5);
//        p.halfDiamondStarPattern(5);
          p.binaryPattern(5);
    }

//  square patter
    public void squarePatter()
    {
        for(int i = 0; i<5;i++)
        {
            for(int j = 0 ;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    right angle triangle
    public  void triangle()
    {
        for(int i = 0;i<5;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    pattern 1 to 5 triangle
    public void oneToFivePattern()
    {
        for(int i =1;i<=5;i++)
        {
            for(int j =1;j <= i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
//    pattern 11 to 55555 triangle
    public void oneOneToFiveFivePattern()
    {
        for(int i = 1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
//    reverse triangle
    public void reverseTriangle()
    {
        for(int i = 0;i<5;i++)
        {
            for(int j = i;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    acute angle triangle
    public void erect_pyramid(int N)
    {
        // This is the outer loop which will loop for the rows.
        for(int i = 0;i<N;i++)
        {
            // For printing the spaces before stars in each row
            for(int j =0;j<N-i-1;j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int k =0;k<2*i+1;k++)
            {
                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for(int k =0;k<N-i-1;k++)
            {
                System.out.print(" ");
            }

            /*
            * In the first row (i=0) there are 4 spaces, 1 star, then again 4 spaces.
            * In the second row (i=1) there are 3 spaces, 3 stars,
            *  then again 3 spaces so we can say
            * that there are N-i-1 spaces, 2*i+1 stars, and then again N-i-1 spaces for each row where i is the row index.
            *  We thus simply run 3 inner loops first for printing the spaces, then the stars, and then the spaces again.
            *
            * */


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public void inverted_pyramid(int N)
    {
        // this is outer loop for row
        for(int i =0;i<N;i++)
        {
            for(int j =0;j<i;j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int k =0;k< 2*N - (2*i+1);k++)
            {
                System.out.print("*");

            }

            // For printing the spaces after the stars in each row
            for(int j =0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public  void halfDiamondStarPattern(int N)
    {
        for(int i =0; i<N;i++)
        {
            for(int j = 0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i =0; i<N;i++)
            {
                for(int j = i;j<N;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

//    Binary
    public void binaryPattern(int N)
    {
        int start = 1;
        for(int i =0;i<N;i++)
        {
            // if the row index is even then 1 is printed first
            // in that row.
            if(i%2 ==0) start = 1;

                // if odd, then the first 0 will be printed in that row.
            else start = 0;

            // We alternatively print 1's and 0's in each row by using
            // the inner for loop.
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}
