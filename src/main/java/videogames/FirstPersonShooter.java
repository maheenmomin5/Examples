package videogames;

public interface FirstPersonShooter extends ThreeD {
	
	int numberofWeapons = 0;
	
	int numberofWeapons();
	
	default void numberOfWeapons() {
		System.out.println("Player has " + numberOfWeapons());
	}

}
