package Demo;

public class Repeat2 {
	
	public static void main(String[] args) {
		
		
	String str="demo";
	
	char[] charvalues = str.toCharArray();
	
	for (int i = 0; i < charvalues.length; i++) 
	{
		for (int j = i+1; j < charvalues.length; j++) {
			
			if (charvalues[i]==charvalues[j])
			{
				System.out.println("string has unique chars");
			}
			else {
				System.out.println("String has no unique chars");
			}
			break;
		}
	}
	
	
	}

}
