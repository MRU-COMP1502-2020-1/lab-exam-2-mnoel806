package lsystems;

public class A_X extends LRule{
	protected char[] valued = {' '};

	
	public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		return valued;
	}

}
