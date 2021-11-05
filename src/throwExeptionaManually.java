import java.util.Scanner;

public class throwExeptionaManually {

	public static void main(String[] args) {
		

	

	Scanner input = new Scanner(System.in);
			boolean flag = false;
			do {
				System.out.println("enter your age:");
				try {
					int age = input.nextInt();
					if (15 >= age || age >= 50)
						throw new Exception();
					System.out.println("valid age");
					flag = true;
				} catch (Exception e) {
					input.nextLine();    // this code to prevent infinite loop if user enter string (not age out of range )
					// i mean without this code if user enter (int)out of range so it throws exception normally
	
					System.out.println("invalid age");
				}
	
			} while (!flag);
	
		}

}
