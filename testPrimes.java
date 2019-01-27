import java.util.Scanner; 
public class testPrimes 
{
	
	public static void main(String[] args)
	{
		//to refer to method outside file: fileName.className
		System.out.println("Enter your first name.    ");
		Scanner name = new Scanner(System.in);
		String userName = name.nextLine();//take whatever the user enters UNTIL THEY PRESS ENTER, grab as a string
		System.out.println("How old are you?");
		Scanner age = new Scanner(System.in);
		int ageNum = age.nextInt();
		System.out.println("Nice to meet you, " + userName + "! Next year you will be " + ageNum + " years old.");
		
		System.out.println("Enter an integer to determine whether or not it's a prime number.");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println(i + " " + Primes.primeTest(i));
		
		System.out.println("Enter another integer.");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int[] array = Primes.firstNPrimes(n);
		Primes.printArr(array);
		
		System.out.println("What is the beginning of your prime range?");
		Scanner firstNum = new Scanner(System.in);
		int first = firstNum.nextInt();
		System.out.println("What is the end of your prime range?.");
		Scanner lastNum = new Scanner(System.in);
		int last = lastNum.nextInt();
		int[] rangeArray = Primes.primesWithinRange(first, last);
		Primes.printArr(rangeArray);
		
		//(int) (Math.random()*10) + 1; 10 = options(?), 1 = lowest value -> random number from 1 to 10
	}
}
