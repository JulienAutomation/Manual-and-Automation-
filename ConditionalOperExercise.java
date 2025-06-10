package ProjectSample;

public class ConditionalOperExercise {

	public static void main(String[] args) {
		
		int Maths = 20;
		int Science = 22;
		int English = 25;
		int avg = (Maths+Science+English)/3;
		
		System.out.println("Average " + avg);
		
		if (avg>=90) {
			System.out.println("A+ ");
			System.out.println("Excellent performance");
		}
		else if (avg>=75) 
		{
			System.out.println("A");
			System.out.println("Excellent performance");
			}
		else if (avg>=60) {
			System.out.println("B");
			System.out.println("Keep improving");
			}
		else if (avg>=40) {
				System.out.println("C");
				System.out.println("Keep improving");
			}
		else if(avg<=40){
			System.out.println("Fail");
		
		}
		if (Maths<35 || Science<35 || English<35) {;
			System.out.println("Failed due to low score in at least one subject");
		}
		}

	}


