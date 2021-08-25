import java.util.Scanner;
class IfElseCondition
{
	public static void main(String[] s)
{ 			
Scanner sc=new Scanner(System.in);
System.out.println(" Enter a two Number ");
int num=sc.nextInt();
int num2=sc.nextInt();
System.out.println("For add Press 1");
System.out.println("For subtract Press 2");
System.out.println("For multiply Press 3");
System.out.println("For division Press 4");
int chose=sc.nextInt();
if (chose==1)
System.out.println(num+num2);
else if(chose==2)
System.out.println(num-num2);
else if(chose==3)
System.out.println(num*num2);
else if(chose==4)
System.out.println(num/num2);
else
System.out.println("wrong");
}
}
