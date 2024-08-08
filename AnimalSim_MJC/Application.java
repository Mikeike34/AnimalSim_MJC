
public class Application {

	public static void main(String[] args) throws InvalidSimIDException,InvalidWingspanException {
		
		System.out.println("****************************************\n\n             Location Tests             \n\n****************************************");
		Location lTest = new Location(2,4);
		System.out.println(lTest.toString());
		lTest.Update(10, 8);
		System.out.println(lTest.toString());
		lTest.setxCoord(12);
		System.out.println(lTest.toString());
		lTest.setyCoord(2);
		System.out.println(lTest.toString());
		System.out.println("Y Coordinate is: "+lTest.getyCoord());
		System.out.println("X Coordinate is: "+lTest.getxCoord());
		lTest.Update(-1, -4);
		System.out.println(lTest.toString());
		
		System.out.println("****************************************\n\n             Animal Tests             \n\n****************************************");
		Animal aTest = new Animal(2,lTest);
		System.out.println(aTest.toString());
		aTest.setSimID(3);
		aTest.setFull(true);
		aTest.setRested(false);
		System.out.println(aTest.toString());
		aTest.sleep(); //generates a random number and sets rested based on randomly generate number between 0 and 1
		System.out.println(aTest.toString());
		aTest.eat(); //generates a random number and sets full based on randomly generate number between 0 and 1
		System.out.println(aTest.toString());
		System.out.println(aTest.isFull());
		System.out.println(aTest.isRested());
		aTest.setSimID(-1);
		System.out.println(aTest.toString());
		
		System.out.println("****************************************\n\n             Goldfinch Tests             \n\n****************************************");
		Goldfinch gTest = new Goldfinch();
		System.out.println(gTest.toString());
		gTest.setWingSpan(6.3);
		gTest.walk(2);
		gTest.walk(3);
		System.out.println(gTest.toString());
		gTest.fly(lTest);
		System.out.println(gTest.toString());
		gTest.setWingSpan(12.0);
		System.out.println(gTest.toString());
		
		System.out.println("****************************************\n\n             BrownBear Tests             \n\n****************************************");
		BrownBear bTest = new BrownBear();
		System.out.println(bTest.toString());
		System.out.println(bTest.getSubSpecies());
		bTest.setSubSpecies("Grizzly");
		System.out.println(bTest.getSubSpecies());
		bTest.setSubSpecies("Polar");
		System.out.println(bTest.getSubSpecies());
		System.out.println(bTest.toString());
		bTest.swim(1);
		bTest.swim(2);
		System.out.println(bTest.toString());
		bTest.walk(1);
		bTest.walk(2);
		System.out.println(bTest.toString());
		
		

	}//end main

}//end class
