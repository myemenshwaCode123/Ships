package Lab6;

public class CruiseShip extends Ship{
	
	private int maxPassengers;
	
	public CruiseShip(String name, String yearBuilt, int maxPassengers) {
		super(name, yearBuilt);
		this.maxPassengers = maxPassengers; 
	}

	
	@Override
	public String toString() {
		return "Name: " + super.getName()
		+ "\nMax Passengers: " + maxPassengers
		+ "\n_________________________\n";
}


	/**
	 * the maxPassengers
	 */
	public int getMaxPassengers() {
		return maxPassengers; 
	}


	/**
	 * maxPassengers the maxPassengers to set
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

}
