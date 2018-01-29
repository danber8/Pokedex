public class Pokedex {
	public int size;		//This is amount of pokemon in the region, it comes from Project4
	public String species;	//Name of the pokemon

	Pokemon[] array;		//Array of objects
	String[] array2;		//This is used in the listPokemon method

	int numberOfPokemon = 0;		//This is a counter
	public Pokedex(int size){		//creates a Pokedex object
		this.size = size;			//references size from Project4
		array = new Pokemon[size];	//Gives the array a paramater
	}

	public String[] listPokemon(){						//returns an array of strings
		String[] array2 = new String[numberOfPokemon];	//creates the array of strings
		if(numberOfPokemon == 0){						//If there aren't any pokemon in the pokedex, the null will make it so that Empty will be printed in Project4
			return null;
		}
		else{
			for(int i = 0; i < numberOfPokemon; i++){	//Otherwise, use a for loop to list every species of pokemon
				array2[i] = array[i].getSpecies();
			}
			return array2;
		}
	}

	public void sortPokemon(){
		for (int i = 0; i < numberOfPokemon; i++){		//Puts the objects in alphabetical order
			int indexOfArray = i;
			for (int j = i + 1; j < numberOfPokemon; j++){		//The information on this came from the wikipedia article and other sources online
				if (array[j] != null && array[j].getSpecies().compareToIgnoreCase(array[indexOfArray].getSpecies()) < 0){
					indexOfArray = j;
				}
				
			}
			Pokemon temp = array[indexOfArray]; 	//This swaps the index's of the array of objects
			array[indexOfArray] = array[i];
			array[i] = temp;
		}
	}

	public int[] checkStats(String species){
		int[] array3 = new int[3];									//I create a new array with a length of 3
		for(int i = 0; i < numberOfPokemon; i++){
			if(array[i].getSpecies().equalsIgnoreCase(species)){	//If the user inputed a pokemon that is in the deck, I get its stats
				array3[0] = array[i].getAttack(); 
				array3[1] = array[i].getDefense();
				array3[2] = array[i].getSpeed();
				return array3;
			}
		}
		return null;												//Otherwise I print out missing by way of Project4
	}
	public boolean addPokemon(String species){
		for(int i = 0; i < numberOfPokemon; i++){		//This loops through my array of objects

			if(array[i].getSpecies().equalsIgnoreCase(species)){	//Case insensitive. If there are duplicates it returns false
				System.out.println("duplicate");
				return false;
			}
		}
		if(numberOfPokemon > size - 1){		//Makes sure the user doesn't add more pokemon than is in the region
			System.out.println("Max");
			return false;
		}
		array[numberOfPokemon++] = new Pokemon(species);	//If the pokemon entered passes the first 2 tests, it is added to pokedex
		return true;
	}
}