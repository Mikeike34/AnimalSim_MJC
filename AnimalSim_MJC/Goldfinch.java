
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
			if(ws < 5.0 || ws > 11.0) {
				throw new InvalidWingspanException("This is an invalid wingspan.");
			}//end if
			this.wingSpan = ws;
		}//end try
		catch(InvalidWingspanException e){
			System.out.println(e.getMessage());
		}//end catch
		
		full = false;
		rested = true;
	}//end preferrred constructor

	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		try {
			if(wingSpan < 5.0 || wingSpan > 11.0) {
				throw new InvalidWingspanException("This is an invalid wingspan.");
			}//end if
			this.wingSpan = wingSpan;
		}//end try
		catch(InvalidWingspanException e){
			System.out.println(e.getMessage());
		}//end catch
	}//end setWingSpan

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString

	@Override
	public void walk(int direction) {
		if(direction == 1) /*North*/ {
			location.setyCoord(location.getyCoord()+1);
		}
		else if(direction == 2)/*East*/{
			location.setxCoord(location.getxCoord()+1);
		}
		else if(direction == 3)/*South*/{
			location.setyCoord(location.getyCoord()-1);
		}
		else if(direction == 4)/*West*/{
			location.setxCoord(location.getxCoord()-1);
		}
		
	}//end walk

	@Override
	public void fly(Location l) {
		location.Update(l.getxCoord(), l.getyCoord());
	}//end fly
	

}//end class
