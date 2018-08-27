 class STATIC 
{
     static int i;
    
    int j;
     
    
static 
{
         i = 10;
       
 System.out.println("static block called");
    
}
 }
  
public class Block 
{
     public static void main(String args[]) 
{
        
System.out.println(STATIC.i); 
    
}
 } 
 