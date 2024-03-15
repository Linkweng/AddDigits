import java.util.Scanner;


public class AddDigits {

	public static void main(String[] args) {
				
		int sum = 0;
		int temp = 0;
		int CurrentNum = 0;
		int lastDigit = 0;

		Scanner scanner = new Scanner(System.in );
		
		System.out.print("Enter a number: ");
		
		CurrentNum = scanner.nextInt();
		
		for(int j = CurrentNum; j > 0; j/=10) {
			temp++;
		}
		
		int[] arr = new int[temp];
		
		for (int i = temp - 1; i >= 0  ; i--) {
			arr[i] = CurrentNum %10;
			CurrentNum/=10;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("arr[" + i + "] = " + arr[i] );
			sum += arr[i];
		}
		
		System.out.println("the total of the digits " + sum);
	}

}
