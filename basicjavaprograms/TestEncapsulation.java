class sample{
private int num1;
private int num2;
private int result;
void setValue(int i,int j)
{
num1 = i;
num2 = j;
}
public int getValue()
{
result = num1+num2;
return result;
}
}
public class Encapsulation{
public static void main(String[] args){
Sample obj = new Sample();
obj.setValue(6,7);
int res = obj.getValue();
System.out.println("Result = "+res);
}
}

