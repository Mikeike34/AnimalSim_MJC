
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

	public int getxCoord() {
		return xCoord;
	}//end getxCoord

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}//end setxCoord

	public int getyCoord() {
		return yCoord;
	}//end getyCoord

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}//end setyCoord

	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	
	
	
	

}//end class
