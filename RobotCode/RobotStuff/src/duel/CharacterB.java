package duel;

public class CharacterA implements Dueler {
	
	private String name; 
	
	public CharacterA(String name) {
		this.name=name;
	}
	
	
	public String getName() {
		return "Samuel Khong ";
	}

	public void setStartingHP(int hp) {}
	
	public int getHP() {
		return 100;
	}

	public void taunt() {
		
	}
	}
