
public class Goldfinch extends Animal implements Flyable,Walkable{
	
	private double wingSpan;
	
	Goldfinch(){
		simID = 0;
		Location l = new Location(0,0);
		full = false;
		rested = true;
		wingSpan = 9.0;
		
		
	}//end empty-argument constructor
	
	Goldfinch(int simID, Location l, double ws){
		this.simID = simID;
		this.location = l;
		
		try {
		this.wingSpan = ws;
		if(ws < 5.0 || ws > 11.0) {
			throw new InvalidWingspanException("This is an invalid wingspan.");
		}//end if
		}//end try
		catch(InvalidWingspanException e){
		}//end catch
		
		full = false;
		rested = true;
	}//end preferrred constructor

	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}//end setWingSpan

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString

	@Override
	public void walk(int direction) {
		
		
	}//end walk

	@Override
	public void fly(Location l) {
		
		
	}//end fly
	

}//end class
