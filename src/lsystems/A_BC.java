package lsystems;

public class A_BC extends LRule{
	protected char[] valued = {'B','C'};

	
	public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		return valued;
	}

}
