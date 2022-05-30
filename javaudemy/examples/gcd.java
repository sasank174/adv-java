package javaudemy.examples;

public class gcd {
    public static void main(String[] args) {
        gcd1(12,30);
	}

	public static void gcd1(int x, int y) {
		for (int i = 1; i < x; i++) {
			if (x%i==0 && y%i==0) {
				System.out.println(i);
			}
		}
	}
}
