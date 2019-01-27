
//UTIL FILE
public class Primes 
{
	public static boolean primeTest(int num)
	{
		//return statements exit method; numbers less than two dont go thru any other conditionals                                                                                                                                                                                                                                          
		if (num < 2) //anything less than two is NOT prime
			return false;
		if (num == 2)
			return true;
		if(num%2==0) //if num is a multiple of 2
			return false;
		int maxTest = (int)(Math.sqrt(num)); //the maximum test number num is divided by is the int version of the square root of num! ex. the integer square root of 53 is 7, which is the last number it is tested with
		for (int divideBy = 3; divideBy <= maxTest; divideBy += 2)
		//if num can be divided by any odd number which is more than/equal to 3 AND less than/equal to maxTest number with NO remainder, it's NOT prime
		{
			if (num % divideBy == 0)
				return false;
		}
		return true;
	}
	//divideBy = divideBy + 2 IS THE SAME AS divideBy += 2

	//precondition: n > 0 (don't have to test for negative amounts)
	public static int[] firstNPrimes(int n)
	{
		//trying to find the first __ primes (ex. first 5 primes if n = 5)
		int primeCount = 1;
		int testNum = 3;
		int[] primeArray = new int[n]; //new array called primeArray with length of n-1
		primeArray[0] = 2; //2 is ALREADY added to the array
		while (primeCount < n)
		{
			if (primeTest(testNum))
				primeArray[primeCount] = testNum; //add the prime to the array
				primeCount++; //so that the next position of the array will be given a prime number
			testNum += 2;	
		}
		return primeArray;
	}
	
	public static void printArr(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if(i != arr.length - 1)
			{
				System.out.print(", ");
			}
		}
		System.out.println();	
	}
	
	public static int[] primesWithinRange(int first, int last)
	{
		//find all prime numbers between two numbers
		//check how many primes are in the range, THEN find them -> two loops
		//precondition: last >= first 
		if (first > last)
		{
			return null; //can return null because method can only return objects (including nulls)
		}
		
		int numPrimes = countOfPrimes(first, last);
		int primeCount = 0;
		int[] rangePrimes = new int[numPrimes];
	
		for (int testVal = first; testVal <= last; testVal++)
		{
			if (primeCount < rangePrimes.length)
			{
				if (primeTest(testVal))
				{
					rangePrimes[primeCount] = testVal;
					primeCount++;
					//CAN'T INDENT MORE THAN ONE COMMAND UNDER CONDITIONAL; DECLARE THAT IT BELONGS UNDER CONDITIONAL WITH BRACKETS
				}
			}
		}	
		return rangePrimes;
	}
	
	public static int countOfPrimes(int first, int last)
	{
		int count = 0;
	  	for (int testVal = first; testVal <= last; testVal++)
	  	{
	  		if (primeTest(testVal))
	  				count++;
	 	}
	 	return count;
	 }
	  
	
}