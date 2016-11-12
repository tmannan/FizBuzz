
public class FizzBuzz {

	public static void main(String[] args) {
		int count;
		// TODO Auto-generated method stub
		for (count = 1;count < 100.0;count++)
		{
			if ((count%3 == 0) && (count%5 == 0))
				System.out.println("FizzBuzz: " + count);
			else if (count%3 == 0)
				System.out.println("Fizz: " + count);
			else if (count%5 == 0)
				System.out.println("Buzz: " + count);
			else
				System.out.println("count: " + count);
				
		}

	}

}
