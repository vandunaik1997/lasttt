package programs;
interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
public class TestClass20 implements First, Second{
	 public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 

	public static void main(String[] args) {
		  { 
		        TestClass20 ob = new TestClass20(); 
		        ob.show(); 


		}
	}

}
