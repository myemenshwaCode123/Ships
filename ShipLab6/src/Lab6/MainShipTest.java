package Lab6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainShipTest {

	@Test
	void ship() {
		Ship testing = new Ship("babylon","1999");
        assertTrue(testing.toString().equals("Name: babylon"
        		+ "\nYear built: 1999" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship2() {
		CargoShip testing = new CargoShip("Slamber","2019", 40);
        assertTrue(testing.toString().equals("Name: Slamber"
        		+ "\nCargo Capacity: 40" 
        		+ "\n_________________________\n")); 
	}
	@Test
    void ship3() {
		CruiseShip testing = new CruiseShip("Queen","2000", 88);
        assertTrue(testing.toString().equals("Name: Queen"
        		+ "\nMax Passengers: 88" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship4() {
		CargoShip testing = new CargoShip("Ace","1977", 327);
        assertTrue(testing.toString().equals("Name: Ace"
        		+ "\nCargo Capacity: 327" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship5() {
		Ship testing = new Ship("Kendrick","1992");
        assertTrue(testing.toString().equals("Name: Kendrick"
        		+ "\nYear built: 1992" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship6() {
		Ship testing = new Ship("FireWall","2002");
        assertTrue(testing.toString().equals("Name: FireWall"
        		+ "\nYear built: 2002" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship7() {
		CargoShip testing = new CargoShip("ColeWrld","2011",99);
        assertTrue(testing.toString().equals("Name: ColeWrld"
        		+ "\nCargo Capacity: 99" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship8() {
		Ship testing = new Ship("Zeno","2008");
        assertTrue(testing.toString().equals("Name: Zeno"
        		+ "\nYear built: 2008" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship9() {
		CargoShip testing = new CargoShip("King","2001",78);
        assertTrue(testing.toString().equals("Name: King"
        		+ "\nCargo Capacity: 78" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship10() {
		Ship testing = new Ship("Tank","2003");
        assertTrue(testing.toString().equals("Name: Tank"
        		+ "\nYear built: 2003" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship11() {
		CruiseShip testing = new CruiseShip("Force","1989", 89);
        assertTrue(testing.toString().equals("Name: Force"
        		+ "\nMax Passengers: 89" 
        		+ "\n_________________________\n"));
	}
	@Test
	void ship12() {
		Ship testing = new Ship("SSGKobe","2012");
        assertTrue(testing.toString().equals("Name: SSGKobe"
        		+ "\nYear built: 2012" 
        		+ "\n_________________________\n"));
	}

}
