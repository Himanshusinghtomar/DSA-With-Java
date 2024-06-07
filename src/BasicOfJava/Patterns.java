package BasicOfJava;

public class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();

//        p.squarePatter();
//        p.triangle();
//        p.oneToFivePattern();
//        p.oneOneToFiveFivePattern();
//        p.reverseTriangle();
        p.acuteAngleTriangle();
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
    public void acuteAngleTriangle()
    {
        for(int i =0;i<5;i++)
        {
            for(int j =i;j<5;j++)
            {
                for(int k =j;k<5;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
//                if((5-i-1) == (2*i+1) )
//                    continue;
//                else
//                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
