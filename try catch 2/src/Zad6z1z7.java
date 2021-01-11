
public class Zad6z1z7 {
	public static void main(String[] args) throws Exception {
		try{
	    	   String napis =null;
	           System.out.println(napis.length());
	       }
	       catch (NullPointerException e){
	    	   e.printStackTrace(System.out);
	    	   throw new Exception(e);
	       }
}
}