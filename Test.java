class Test
{
  public static void main(String args[])
  {
  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  float f = Float.parseFloat(args[2]);
  String s = args[3];
  int c = a + b;
  float d = c + f;
  System.out.println("Sum is " +c);
  System.out.println("Float add is " +d);
  System.out.println("String is " +s);
  }
  }