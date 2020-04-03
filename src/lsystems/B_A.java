package lsystems;

public class B_A extends LRule{
	protected char[] valued = {'A'};

	
	public char getMatch() {
		return 'B';
	}
	
	public char[] getBody() {
		return valued;
	}

}
