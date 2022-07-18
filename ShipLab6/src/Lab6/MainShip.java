package Lab6;

public class MainShip {
	/**
	 * 
	 * Author: Michael Yemenshwa 
	 * Description: Using a main to demonstrate the ship classes in a array, which can take various ship objects, as well as calling 
	 * the toString methods from the other ship classes.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ship[] ships = new Ship[3];
		
		ships[0] = new Ship("Container Ship", "1928");
		ships[1] = new CruiseShip("CruiseShip", "1922", 40);
		ships[2] = new CargoShip("CargoShip", "2002",98);  
		
		for (Ship ship: ships) {
			System.out.println(ship.toString());   
		}

	}

}
