package diffPackage;

import com.date12Jul17.qstns.ParentUtil;

public class ChildUtil extends ParentUtil {
	public static void main(String [] args) 
    {
        new ChildUtil().callStuff();
    }
    void callStuff() 
    {
        System.out.print("this " + this.doStuff() ); /* Line 18 */
        ParentUtil p = new ParentUtil();
        //System.out.print(" parent " + p.doStuff() ); /* Line 20 */
    }

}
