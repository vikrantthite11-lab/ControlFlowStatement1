
public class Sum {
	
	public static void main(String[] args) {
		
		int num = 123456;
		int sum =0;
		while(num !=0) {
			sum +=num %10;
			num /=10;
		}
	System.out.println("Sum og digital:" + sum);
	}

	}

   
    

