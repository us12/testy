package zaneta.testy;

public class AppImpl implements AppInter{
	int x;
	int alfa;
	boolean y = false;
	public boolean isFirst(int n) {
		for(int i=2; i<n; i++) {
			x = n%i;
			if(x == 0 ) {
				return false;
			}
		}
		return true;
	}
}
