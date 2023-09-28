public class ReverseStringYoutube{
public static void main(String[] args) {
String str = "123";
String rstr = " ";
char ch;
for(int i = 0;i<str.length();i++){
ch = str.charAt(i);
rstr = ch + rstr;//rstr = c ,ch=o,rstr=o+c=oc. ch=d,rstr=d+oc=doc
}
System.out.println("Reverse string =" +rstr);
}
}
//rstr=c,ch=o+c=oc,rstr=oc,ch=d,ch=d+oc=doc
