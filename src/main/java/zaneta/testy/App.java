package zaneta.testy;

/**
 * Hello world!
 *
 */
public class App 
{ static int x;
	 boolean y = false;
	public static boolean isFirst(int n) {
		for(int i=2; i<n; i++) {
			
			x = n%i;
			
			if(x == 0 ) {
				return false;
			}
		}
				return true;
	}
	
    public static void main( String[] args )
    {
    	for(int i=1; i<=100; i++) {
    		if(isFirst(i) == true)
    			System.out.println(i);
    	}	
    }
}
