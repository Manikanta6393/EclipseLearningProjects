package com.date12Jul17.qstns;

public class Test {
	
	public void foo() 
    {
        assert false; /* Line 5 */
        assert false; /* Line 6 */
    } 
    public void bar()
    {
        while(true)
        {
            assert false; /* Line 12 */
            
        } 
        //boolean b=false;  //Unreachable code
    }

}
