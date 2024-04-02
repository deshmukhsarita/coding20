public class missingnumber
{
	public static void main(String[] args)
	{
		int len;
		int[] num = new int[]{1,2,3,5,6,7};
		len = 7;
		int res = len * ((len + 1) / 2);
		int num_sum = 0;		
		for (int i: num)
		{
			num_sum += i;
		}
	        System.out.println("Missing Array Number is "+(res - num_sum));
	}
 }
 