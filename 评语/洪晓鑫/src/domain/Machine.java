package domain;

import domain.drink.Coco;
import static domain.Shelf.*;

public class Machine {
	private static final int MAX_SHELF=6;
	private static Shelf[] shelfs=new Shelf[MAX_SHELF];
	private static int countOfShelf;
	
	/**  
	* <p>Title: Machine</p>  
	* <p>Description: </p>    
	* @author Tptogiar 
	* @date 2021-2-18  
	 */  
	private Machine() {
		for (int i = 0; i < MAX_SHELF; i++) {
			shelfs[i]=new Shelf();
			countOfShelf++;
		}
	}
	private static Machine machine=new Machine();
	
	public static Machine getMachine() {
		return machine;
	}

	/**
	 * @return the shelfs
	 */
	public static Shelf[] getShelfs() {
		return shelfs;
	}

	/**
	 * @param shelfs the shelfs to set
	 */
	public static void setShelfs(Shelf[] shelfs) {
		Machine.shelfs = shelfs;
	}
	
	public Shelf[] displayShelfs() {
		Shelf[] currentShelfs=new Shelf[countOfShelf];
		return currentShelfs;
	}
	
	public void addShelf() {
		if(countOfShelf>=MAX_SHELF) {
			return;
		}
		shelfs[countOfShelf++]=new Shelf();
	}
	
	public void sellShelfDrink(int shelfId) {
		shelfs[shelfId].sellDrink();
	}
	
	public void addShelfDrink() {
		for (int i = 0; i < countOfShelf; i++) {
			if(shelfs[i].getLeft()<MAX_SHELF) {
				shelfs[i].setLeft(shelfs[i].getSeat());
			}
		}
	}
	public int getCountOfshelf() {
		return countOfShelf;
	}
	public static void main(String[] args) {
//		Machine test=Machine.getMachine();
//		for (int i = 0; i < test.shelfs.length; i++) {
//			System.out.println(test.shelfs[i].getDrinkType().getType()+","+test.shelfs[i].getLeft());
//		}
//		test.sellDrink(3);test.sellDrink(3);test.sellDrink(3);test.sellDrink(3);test.sellDrink(3);
//		test.sellDrink(3);test.sellDrink(3);test.sellDrink(3);test.sellDrink(3);test.sellDrink(3);
//		test.sellDrink(3);
//		for (int i = 0; i < test.shelfs.length; i++) {
//			System.out.println(test.shelfs[i].getDrinkType().getType()+","+test.shelfs[i].getLeft());
//		}
		
		Machine test=Machine.getMachine();
	}
}
