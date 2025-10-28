public class MagicEightBallTest
{
	public static void main(String[] args)
	{
		MagicEightBall one = new MagicEightBall("Is Sarah's CAD going to work?");
		one.getQuestion();
		System.out.println(one.response());
		
		MagicEightBall two = new MagicEightBall("Does CafeM have good food?");
		two.getQuestion();
		System.out.println(two.response());
	}
}
