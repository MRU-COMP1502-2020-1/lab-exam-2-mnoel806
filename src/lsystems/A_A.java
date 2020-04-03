package lsystems;

public class A_A extends LRule{
	protected char[] valued = {'A'};

	
	public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		return valued;
	}
}
