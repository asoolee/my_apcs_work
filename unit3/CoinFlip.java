public class CoinFlip{
	public static String coinFlip(String coin){
		
		double flip = (int)Math.random()*10;
		
		if(flip < 5)
			coin = "Heads";
		 else if (flip > 5)
			coin = "Tails";
		
		return coin;
		}
		
	public static void main(String[] args){
		
		for(int i = 0; i < 20; i++){
			System.out.println(coin);
			}
		
		}
}
