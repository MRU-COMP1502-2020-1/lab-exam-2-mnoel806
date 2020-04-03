package lsystems;

public class A_Q extends LRule{ 
	protected char[] valued = {'Q'};

	
	public char getMatch() {
		return 'A';
	}
	
	public char[] getBody() {
		return valued;
	}

}
