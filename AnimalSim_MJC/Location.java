
public class Location {
	
	private int xCoord;
	private int yCoord;
	
	Location(){
		xCoord = 0;
		yCoord = 0;
	}//end empty-argument constructor
	
	Location(int x, int y){
		try {
			if(x < 0 || y < 0) {
				throw new InvalidCoordinateException("Coordinates cannot be less than zero. Setting Coordinates to 0,0");
			}//end if
			this.xCoord = x;
			this.yCoord = y;
		}//end try
		catch(InvalidCoordinateException e) {
			System.out.println(e.getMessage());
			this.xCoord = 0;
			this.yCoord = 0;
		}//end catch
	}//end preferred constructor
	
	
	public void Update(int x, int y){
		try {
			if(x < 0 || y < 0) {
				throw new InvalidCoordinateException("Coordinates cannot be less than zero.");
			}//end if
			this.xCoord = x;
			this.yCoord = y;
		}//end try
		catch(InvalidCoordinateException e) {
			System.out.println(e.getMessage());
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
		try {
			if(xCoord < 0) {
				throw new InvalidCoordinateException("Coordinates cannot be less than zero.");
			}//end if
			this.xCoord = xCoord;
		}//end try
		catch(InvalidCoordinateException e) {
			System.out.println(e.getMessage());
		}//end catch
	}//end setxCoord

	public int getyCoord() {
		return yCoord;
	}//end getyCoord

	public void setyCoord(int yCoord) {
		try {
			if(yCoord < 0) {
				throw new InvalidCoordinateException("Coordinates cannot be less than zero.");
			}//end if
			this.yCoord = yCoord;
		}//end try
		catch(InvalidCoordinateException e) {
			System.out.println(e.getMessage());
		}//end catch
	}//end setyCoord

	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	
	
	
	

}//end class
