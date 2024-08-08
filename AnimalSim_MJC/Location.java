
public class Location {
	
	private int xCoord;
	private int yCoord;
	
	Location(){
		xCoord = 0;
		yCoord = 0;
	}//end empty-argument constructor
	
	Location(int x, int y){
		try {
			this.xCoord = x;
			this.yCoord = y;
		
			if(x < 0 || y < 0) {
				throw new InvalidCoordinateException("Coordinates cannot be less than zero.");
			}//end if
		}//end try
		catch(InvalidCoordinateException e){
		}//end catch
	}//end preferred constructor
	
	
	public void Update(int x, int y){
		try {
			this.xCoord = x;
			this.yCoord = y;
			
			if(x < 0 || y < 0) {
				throw new InvalidCoordinateException("Coordinates cannot be less than zero.");
			}//end if
		}//end try
		catch(InvalidCoordinateException e) {
		}//end catch
	}//end update
	
	
	public int[] getCoordinates() {
		int[] coordinates = new int[] {xCoord,yCoord};
		return coordinates;
	}//end getCoordinates

}//end class
