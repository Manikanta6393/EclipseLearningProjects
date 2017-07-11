package empty;

class ThrowExample{
public static void main(String args[]) throws Exception
{
try   {
  demoex(); 
 }finally{}
/*catch(NullPointerException ne)  {
  System.out.println("Exception re-caught in main() method: ");
 }*/
}

static void demoex(){       
try  {
  throw new NullPointerException("Null pointer Exception Manikanta"); 
 }finally{}
/*catch (NullPointerException ne)   {
   System.out.println("Caught inside the demoex() method ");
   throw ne; //re-throwing an exception
 }*/
}

}

