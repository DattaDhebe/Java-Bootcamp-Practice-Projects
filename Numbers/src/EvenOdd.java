import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		
		Integer n=sc.nextInt();
		if(n%2==0){
			System.out.println("number is even..!");
		}
		else{
			System.out.println("Number is odd...!");
		}
		sc.close();
	}

}
