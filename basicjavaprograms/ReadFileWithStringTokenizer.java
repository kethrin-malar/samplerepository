import java.util.StringTokenizer;    
public class StringTokenizer2  
{    
 public static void main(String args[])  
 {    
   StringTokenizer st = new StringTokenizer("Transaction id  From Account number  Transaction amount  From bank  To Account number  To bank  Transaction type",",");    
     while (st.hasMoreElements())   
     {    
         System.out.println(st.nextToken());    
     }    
 }    
}  