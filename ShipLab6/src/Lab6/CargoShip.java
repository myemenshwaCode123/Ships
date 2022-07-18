package Lab6;

public class CargoShip extends Ship{
	
	private int cargoCapacity;

	public CargoShip(String name, String yearBuilt, int cargoCapacity) {
		super(name, yearBuilt);
		this.cargoCapacity = cargoCapacity;
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * return the cargoCapacity
	 */
	public int getCargoCapacity() {
		return cargoCapacity;
	}


	/**
	 * cargoCapacity the cargoCapacity to set
	 */
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity; 
	}


	@Override
	public String toString() {
		return "Name: " + super.getName()
		       +"\nCargo Capacity: " + cargoCapacity
		       +"\n_________________________\n";
}

}
