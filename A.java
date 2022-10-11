
public class A
{
public static void main(String args[])
{
HashMap<String,String> hm=new HashMap<String,String>();
hm.put("aa","ABC");
hm.put("bb","PQR");
hm.put("cc","XYZ");
hm.put("dd","LMN");

Set<String> keys=hm.keySet();
Iterator itr=keys.iterator();
while(itr.hasNext())
{
String key=itr.next();
String value=hm.get(key);
}
}
}