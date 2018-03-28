
 class Plane {

	private String  planeNo;
	private int     noOfSeats;
	private int 	noOfPiolets;
	private String  planeType;
	private String  mealsType;
	
	public Plane( String planeNo, int noOfSeats, int noOfPiolets, String planeType, String mealsType)
		{
			this.planeNo = planeNo;
			this.noOfSeats = noOfSeats;
			this.noOfPiolets = noOfPiolets;
			this.planeType = planeType;
			this.mealsType = mealsType;
		}
		String getPlaneNo() {
			return planeNo;
		}
		int getNoOfSeats() {
			return noOfSeats;
		}
		int getNoOfPiolets() {
			return noOfPiolets;
		}
		String getMealsType() {
			return mealsType;
		}
		String getPlaneType() {
			return planeType;
		} 
		void setPlaneNo( String planeNo) {
			this.planeNo = planeNo;
		}
		void setNoOfSeats(int noOfSeats) {
			this.noOfSeats = noOfSeats;
		}
		void setNoOfPiolets(int noOfPiolets) {
			this.noOfPiolets = noOfPiolets;
		}
		void setMealsType(String mealsType) {
			this.mealsType = mealsType;
		}
		void setPlaneType(String planeType) {
			this.planeType = planeType;
		}
	
 }
