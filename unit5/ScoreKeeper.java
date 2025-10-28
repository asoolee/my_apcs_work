public class ScoreKeeper
{
	public ScoreKeeper()
	{
		score = 0;
	}
	
	// required return type?
	
	public void scoreNormal()
	{
		score += 100;
	}
	
	public void bonusScore()
	{
		score += 1000;
	}
	
	public int getScore()
	{
		return score;
	}
	
	private int score;
}
