package videogames;

public class HalfLife implements FirstPersonShooter, SciFi, Multiplayer {
	
	int kills = 0;
	public void killWasMadeInGame() {
		this.kills++;
	}
	
	public void showNumberOfWeapons() {
		System.out.println("now overload " + numberofWeapons());
	}
	@Override 
	public int numberOfPlayers() {
		return 20;
	}
	
	@Override 
	public int killCounter() {
		return 5;
	}
	
	@Override 
	public boolean hasAliens() {
		return true;
	}
	
	@Override 
	public int getMapDepth() {
		return 100;
	}
	
	@Override 
	public int mapHeight() {
		return 100;
	}
	
	@Override
	public boolean isInSpace() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDystopian() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int numberofWeapons() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override 
	public int mapWidth() {
		return 100;
	}
	
	
}
	
