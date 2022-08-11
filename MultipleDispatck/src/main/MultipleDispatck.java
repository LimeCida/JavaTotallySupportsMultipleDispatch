package main;

public class MultipleDispatck {
	public static void main(String[] args) {
		Asteroid a = new Asteroid();
		SpaceCruiser s = new SpaceCruiser();
		a.collideWith(a); //ASTEROID ON ASTEROID COLLISION!!!
		a.collideWith(s); //ASTEROID ON CRUISER COLLISION!!!
		
		s.collideWith(a); //CRUISER ON ASTEROID COLLISION!!!
		s.collideWith(s); //CRUISER ON CRUISER COLLISION!!!
	}
}

interface Collidable {}

class Asteroid implements Collidable {
	public void collideWith(Collidable unknown) {
		//If multiple dispatch is supported, this method should not be called
		System.out.println("ASTEROID CRASHED INTO SOMETHING!!!");
	}
	public void collideWith(Asteroid asteroid) {
		System.out.println("ASTEROID ON ASTEROID COLLISION!!!");
	}
	public void collideWith(SpaceCruiser cruiser) {
		System.out.println("ASTEROID ON CRUISER COLLISION!!!");
	}
}

class SpaceCruiser implements Collidable {
	public void collideWith(Collidable unknown) {
		//If multiple dispatch is supported, this method should not be called
		System.out.println("CRUISER CRASHED INTO SOMETHING!!!");
	}
	public void collideWith(Asteroid asteroid) {
		System.out.println("CRUISER ON ASTEROID COLLISION!!!");
	}
	public void collideWith(SpaceCruiser cruiser) {
		System.out.println("CRUISER ON CRUISER COLLISION!!!");
	}
}
