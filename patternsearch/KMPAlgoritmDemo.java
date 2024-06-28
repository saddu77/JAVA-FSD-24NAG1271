package patternsearch;

public class KMPAlgoritmDemo {

	private final int R;
	private int[][] dfa;
	private char[] pattern;
	
	public KMPAlgoritmDemo(String pattern) {
		this.R = 256;
		this.pattern = pattern.toCharArray();
		int m = pattern.length();
		dfa = new int[R][m];
		
		//build dfa from pattern - deterministic finite automata
		dfa[pattern.charAt(0)][0] = 1;
		for(int X = 0,j = 1;  j < m;  j++) {
			//copy mismatch cases
			for(int c = 0; c < R; c++) {
				dfa[c][j] = dfa[c][X];
			}
			//set match case
			dfa[pattern.charAt(j)][j] = j + 1;
			//update restart state
			X = dfa[pattern.charAt(j)][X];
			
		}
	}
	public void search(String txt) {
		int n = txt.length();
		int m = pattern.length;
		int i ,j;
		for(i =0,j=0; i < n && j < m; i++) {
			j = dfa[txt.charAt(i)][j];
		}
		
		if(j == m) {
			System.out.println("Pattern found at index: " + (i - m));
		}else {
			System.out.println("Pattern Not found");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		KMPAlgoritmDemo kmp = new KMPAlgoritmDemo(pat);
		kmp.search(txt);
	}

}
