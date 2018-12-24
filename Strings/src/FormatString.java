import java.util.Locale;

public class FormatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		String s1 = String.format("%a", 1.0); //return hex output
		String s2 = String.format("%b", true); // return boolean output
		String s3 = String.format("%c", 'c'); //return unicode character
		String s4 = String.format("%d", 101); //return integer
	    String s5 = String.format(Locale.US, "%d", 101); 
	    String s6 = String.format("%e", 1.2); //return float
        String s7 = String.format("%f", 1.2); //return float
	    String s8 = String.format("%g", 1.0); // retrun flaot 
        String s9 = String.format("%h", 65); //retrun hex form hashcode method
        String s10 = String.format("%n", "none"); //return none
        String s11 = String.format("%o", 160); //return octal
        String s12 = String.format("%s", "hello"); // return string
        String s13 = String.format("%x",101);
        String s14 = String.format("%010d",10); // filled with 0's for 10 times
        String s15 = String.format("%10d", 10); // right adjusting
        String s16 = String.format("%-10d", 10);
        String s17 = String.format("% d", 10);
        System.out.println("s1:"+s1+"\n"+"s2:"+ s2+"\n"+"s3:"+s3+"\n"+"s4"+s4+"\n"+"s5:"+s5+"\n"+"s6:"+s6+"\n"+"s7:"+s7+"\n"+"s8:"+s8+"\n"+"s9:"+s9+"\n"+"s10:"+s10+"\n"+"s11:"+s11+"\n"+"s12:"+s12+"\n"+"s13"+s13+"\n"+s14+"\n"+s15+"\n"+s16+"\n"+s17);
		}
		catch(Exception e)
		{
			System.out.println("Exception at"+e);
		}	
		
                
	}

}
