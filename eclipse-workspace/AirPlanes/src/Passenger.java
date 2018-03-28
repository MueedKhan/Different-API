

public class Passenger {
	private String passengerName;
	private String passengerEmail;
	private long   passengerMobileNo;
	private int    passengerAge;
 	private static final int MINAGE = 12;
 	private int    passengerFare;

	
    public Passenger( String passengerName, String passengerEmail, long passengerMobileNo, int passengerAge) {
			this.passengerName  	= 	     passengerName;
			this.passengerEmail 	=    	 passengerEmail;
			this.passengerMobileNo  =        passengerMobileNo;
			this.passengerAge 		= 		 passengerAge;
	}
	//Getters Methods 
	public String getPassengerName() {
		return passengerName;
	}
	public String getPassangerEmail() {
		return passengerEmail;
	}
	public long getPassangerMobileNo() {
		return passengerMobileNo;
	}
	public int getpassengerAge() {
		return passengerAge;
	}
	//Setters Method
	void setPassengerName( String passengerName) {
		this.passengerName = passengerName;
	}
	void setPassengerEmail( String passengerEmail ) {
		this.passengerEmail = passengerEmail;
	}
	void setPassengerMobileNo( long passengerMobileNo) {
		this.passengerMobileNo = passengerMobileNo;
	}
	void setPassengerAge( int passengerAge) {
		this.passengerAge = passengerAge;
	}
	//switch to be used wiithin method
	int checkPassengerAge( ) {
		if ( passengerAge <= MINAGE) {
			System.out.println("You are below 12 and are in infant category");
			return passengerFare-2000;
		}
		else {
			System.out.println("You are in adult category");
			return passengerFare;
			}
		}
}