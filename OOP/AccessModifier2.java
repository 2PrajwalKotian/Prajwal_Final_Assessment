package oopsprograming;
class C
{
protected int x=40;
void method2()
{
System.out.println("world");
C obj1=new C();
System.out.println(obj1.x);
}

}
public class AccessModifier2 extends C
{
public static void main(String args[])
{
	AccessModifier2 obj=new AccessModifier2();
	System.out.println(obj.x);
    obj.method2();
}
}
