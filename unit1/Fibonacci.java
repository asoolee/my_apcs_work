public class Fibonacci {
	public static void main(String[] args){
		int a = 0;
		int b = 1;
	for (int i = 1; i < 30; i++){
		int c = a+b;
		a = b;
		b = c;
		System.out.println(c);
		}
	}
}
