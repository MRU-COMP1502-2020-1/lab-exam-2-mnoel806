package lsystems;

public class C_B extends LRule{
	protected char[] valued = {'B'};

	
	public char getMatch() {
		return 'C';
	}
	
	public char[] getBody() {
		return valued;
	}

}
