package Loop;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)		
		{
			if(i!=5 && i !=10 && i!=15 && i!=20 && i!=25 ) 
				System.out.println(i);
				continue;
		}
	}
}


