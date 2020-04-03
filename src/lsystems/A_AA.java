package lsystems;

public class A_AA extends LRule{
	protected char[] valued = {'A','A'};

	
	public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		return valued;
	}
}
