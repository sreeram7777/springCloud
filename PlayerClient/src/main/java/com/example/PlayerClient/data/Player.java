package com.example.PlayerClient.data;


public class Player {

	
	private int id;
	
	private int matches;
	
	private int hundreds;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getHundreds() {
		return hundreds;
	}

	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(int id, int matches, int hundreds, String name) {
		super();
		this.id = id;
		this.matches = matches;
		this.hundreds = hundreds;
		this.name = name;
	}

	public Player() {
		super();
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", matches=" + matches + ", hundreds=" + hundreds + ", name=" + name + "]";
	}
	
	
}
