public class AA
{
public static void main(String args[])
{
String s="Kiran Zinjade";
String rev="";
for(int i=(s.length()-1);i>=0;i--)
{
String rev=rev+s.charAt(i);
}
System.out.println("Here is rev String:"+rev);

}
}