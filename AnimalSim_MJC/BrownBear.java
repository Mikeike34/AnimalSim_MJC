
public class BrownBear extends Animal implements Walkable,Swimmable{
	
	private String subSpecies;
	
	BrownBear(){
		
		simID = 0;
		Location l = new Location(0,0);
		full = false;
		rested = true;
		subSpecies = "Alaskan";
		
	}//end empty-argument constructor
	
	BrownBear(int simID, Location l, String subSpecies){
		
		this.simID = simID;
		this.location = l;
		try {
		this.subSpecies = subSpecies;
		if(subSpecies != "Alaskan" || subSpecies != "Asiatic" || subSpecies != "European" || subSpecies != "Grizzly" || subSpecies != "Kodiak" || subSpecies != "Siberian") {
			throw new InvalidSubspeciesException("Invalid subspecies of a brown bear.");
		}//end if
		}//end try
		catch(InvalidSubspeciesException e) {
		}//end catch
		full = false; 
		rested= true;
		
	}//end preferred constructor
	
	

	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}//end setSubSpecies

	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString

	@Override
	public void swim(int direction) {
		
		
		
	}//end swim

	@Override
	public void walk(int direction) {
		
		
	}//end walk
	
	

}//end class
