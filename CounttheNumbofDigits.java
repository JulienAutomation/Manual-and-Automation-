package Loop;

public class CounttheNumbofDigits {

	public static void main(String[] args) {
		int numb = 4567;
		int count =0;
		while(numb>0)
		{
			numb = numb/10;
			count = count +1;
		}
		System.out.println("TotalCount = " +count);

	}

}
