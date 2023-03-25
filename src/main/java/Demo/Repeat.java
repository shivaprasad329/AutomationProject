package Demo;

public class Repeat {
	
	public static void main(String[] args) {
		
		int a[]= {1 , 5 , 7 , 1 , 6 , 5 , 7 , 1 , 3};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j])
				{
					System.out.println(a[j]);
					
				}
				
			}
		}

	}

}
