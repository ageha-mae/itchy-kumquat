class StaticTest
{
  public static void main(String s[])
  {
    System.out.println("First class");
    FactTest.x = 6;
    int res = FactTest.calc();
    System.out.println("Factorial = "+res);
  }
}

class FactTest
{
  static int x;
  static int calc()
  {
    int f = 1;
    for(int i=1;i<=x;i++)
    {
      f=f*i;
    }
    return f;
  }
}
