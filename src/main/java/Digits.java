import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		int n = num;
		digitList.add(n % 10);
		while(n > 0) {
			digitList.set(0, n % 10);
			n = n / 10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 1; i < digitList.size(); i++) {
			if(digitList.get(i) < digitList.get(i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
