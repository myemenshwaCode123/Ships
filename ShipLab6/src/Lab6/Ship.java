package Lab6;

public class Ship {
	private String name, yearBuilt;
	
	@Override
	public String toString() {
		return "Name: " + name
				+ "\nYear built: " + yearBuilt
				+ "\n_________________________\n";   
	}

	/**
	 * return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * return the yearBuilt
	 */
	public String getYearBuilt() {
		return yearBuilt;
	}

	/**
	 * yearBuilt the yearBuilt to set
	 */
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public Ship(String name, String yearBuilt) {
		super();
		this.name = name;
		this.yearBuilt = yearBuilt;
	}

}
