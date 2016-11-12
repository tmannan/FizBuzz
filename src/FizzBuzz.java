
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int count = 1;count <= 100;count++)
		{
			if ((count%3 == 0) && (count%5 == 0))
				print("FizzBuzz: " + count);
			else if (count%3 == 0)
				print("Fizz: " + count);
			else if (count%5 == 0)
				print("Buzz: " + count);
			else
				print(Integer.toString(count));
			
		}
	}



private static void print(String toPrint)
{
	System.out.println(toPrint);
}

}