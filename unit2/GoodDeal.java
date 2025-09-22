
public class GoodDeal {
	
	public static boolean goodDeal(double originalPrice, double salePrice) {
		if(salePrice < 0.75*originalPrice){
			return true;
		} else {
			return false;
		}
	}
	
	public static void testGoodDeal(double originalPrice, double salePrice, boolean expected){
		
		boolean result = goodDeal(originalPrice, salePrice);
		
	System.out.println("originalPrice:" + originalPrice + 
					   " salePrice:" + salePrice + 
					   " expected:" + expected + 
					   " result:" + result);
		
		if(result == expected)
			System.out.println("Yay!");
		else 
			System.out.println("No!");
		}
		
	public static void main(String[] args){
		
		testGoodDeal(100, 50, true);
		testGoodDeal(100, 80, false);
		testGoodDeal(100, 74, true);
		testGoodDeal(100,100, true);
		testGoodDeal(500, 375, false);
		testGoodDeal(500, 300, true);
		
		}
}

