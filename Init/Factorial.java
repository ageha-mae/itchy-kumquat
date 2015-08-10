class Factorial
{
  public static void main(String s[])
  {
    int x, n, y;
    x=3;
    n=x;
    y=1;
    while(n!=0)
    {
      y=n*y;
      n=n-1;
    }
    System.out.println("Factorial = "+y);
  }
}
