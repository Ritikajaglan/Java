class ReversePyramidPattern
{
public static void main(String[] s)
{
int rows=3;
for(int a=0;a<=rows-1;a++)
{
for(int b=3;b<=a;b++)
{
System.out.println(" ");
}
for(int d=3;d<=rows-1-a;d++)
{
System.out.print("*");
}
System.out.println("\n");
}
}
}
