import java.util.*;
public class Animal {
	
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	
	Animal(){
		simID = 0;
		Location l = new Location(0,0);
		location = l;
		full = false;
		rested = true;
	}//end empty-argument constructor
	
	
	Animal(int simID, Location l) throws InvalidSimIDException{
	try {
		if(simID < 0) {
			throw new InvalidSimIDException("SimId cannot be less than 0.");
		}//end if
		this.simID=simID;
	}//end try
	catch(InvalidSimIDException e){
		System.out.println(e.getMessage());
	}//end catch
	this.location = l;
	full = false;
	rested = true;
	}//end preferred constructor
	
	
	public boolean eat() {
		double rn = Math.random();
		System.out.println(rn);
		
		if(rn <= .5) {
			full = false;
		}//end if
		else {
			full = true;
		}//end else
		return full;
	}//end eat
	
	
	public boolean sleep() {
		double rn = Math.random();
		System.out.println(rn);
		
		if(rn <= .5) {
			rested = false;
		}//end if
		else {
			rested = true;
		}//end else
		return rested;
	}//end sleep


	public int getSimID() {
		return simID;
	}//end getSimID


	public void setSimID(int simID) throws InvalidSimIDException {
		try {
		if(simID < 0) {
			throw new InvalidSimIDException("SimId cannot be less than 0.");
		}//end if
		this.simID=simID;
		}//end try
		catch(InvalidSimIDException e){
			System.out.println(e.getMessage());
		}//end catch
	}//end setSimID


	public Location getLocation() {
		return location;
	}// getLocation


	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation


	public boolean isFull() {
		return full;
	}//end isFull


	public void setFull(boolean full) {
		this.full = full;
	}//end setFull


	public boolean isRested() {
		return rested;
	}//end isRested


	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested


	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested + "]";
	}//end toString
	
	
	
	

}//end class
