
public class Pokemon {
	

	String species;		//I initialize all my data fields
	int attack;			//They are not static because they change with each object 
	int defense;
	int speed;
	
	public void grow(int boost){	//Increases the attack (although it is never used)
		attack = attack + boost;
	}
	public void harden(int boost){		//Increases the defense (although it is never used)
		defense = defense + boost;
	}
	public void haste(int boost){		//Increases the speed (although it is never used)
		speed = speed + boost;
	}
	
	public String getSpecies(){		//This getter returns the species
		return this.species;
	}
	public void setSpecies(String spc){		//I have no idea what the setters here are for, I just followed the instructions
		species = spc;
	}
	
	public int getAttack(){			//gets the attack variable
		return this.attack;
	}
	public void setAttack(int atk){		//sets the attack
		attack = atk;
	}
	
	public int getDefense(){		//gets the defense variable
		return this.defense;
	}
	public void setDefense(int def){		//sets the defense
		defense = def;
	}
	
	public int getSpeed(){			//gets the speed variable
		return this.speed;
	}
	public void setSpeed(int spd){		//sets the speed
		speed = spd;
	}
	
	public Pokemon(String species){				//This is my constructor, it has a species, attack, defense and speed
		this.species = species;							//It is really usefull when I am printing out the stats of some pokemon
		this.attack = (species.length() * 4) + 2;
		this.defense = (species.length() * 2) + 7;
		this.speed = (species.length() * 3) + 5;
	}
	

}


