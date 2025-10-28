public class MagicEightBall
{
	public MagicEightBall(String questionIn)
	{
		question = questionIn;
	}
	
	public void getQuestion()
	{
		System.out.println(question);
	}
	
	public String response()
	{
		String respond = "";
		int r = (int)(Math.random()*3);
		if(r == 0)
		{
			respond = "Yes!";
		}
		else if(r == 1)
		{
			respond = "Nuh uh!";
		}
		else if(r == 2)
		{
			respond = "Perchance";
		}
		
		return respond;
	}
	
	private String question;
}
