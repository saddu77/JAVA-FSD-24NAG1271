package bitwisealgorithm;

public class SwapBitsDemo {

	static int swapBits(int x, int i, int j) {
		if(( (x >> i) & 1) != ((x >> j) & 1)) {
			int mask = ( 1 << i) | (1 << j);
			x ^= mask;
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 29; // 11101
		int i = 1; //position of first bit to swap
		int j = 3;//position of second bit to swap
		
		System.out.println("Original Number: " + x 
				+ " (binary: " + Integer.toBinaryString(x) + ")");
		
		x = swapBits(x, i, j);
		
		System.out.println("Number after swapping bits: " + x 
				+ "(binary: " + Integer.toBinaryString(x) + ")");
		 
	}

}
