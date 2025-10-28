public class ScoreKeeperTest
{
	public static void main(String[] args)
	{
		ScoreKeeper score = new ScoreKeeper();
		
		score.scoreNormal();
		score.bonusScore();
		
		System.out.println("The score is: " + score.getScore());
		score.scoreNormal();
		System.out.println("The score is: " + score.getScore());
	}
}
