
public class Flight {
	String flightNum;
	String flightOrigin;
	String flightDestination;
	String flightDepartureDate;
	String flightType;
	String flightDepartureTime;
	String flightArrivalTime;


public Flight( String flightNum, String flightOrigin, String flightDestination, String flightDepartureDate, String flightType, String flightDepartureTime, String flightArrivalTime) {

		this.flightNum 				= flightNum;
		this.flightOrigin 			= flightOrigin;
		this.flightDestination 		= flightDestination;
		this.flightDepartureDate 	= flightDepartureDate;
		this.flightType 			= flightType;
		this.flightDepartureTime 	= flightDepartureTime;
		this.flightArrivalTime 		= flightArrivalTime;
}

	public String getFlightNum() {
		return flightNum;
	}
	public String getFlightOrigin() {
		return flightOrigin;				
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public String getFlightDepartureDate() {
		return flightDepartureDate;
	}
	public String getflightType() {
		return flightType;
	}
	public String getFlightDepartureTime() {
		return flightDepartureDate;
	}
	public String getFlightArrivalTime() {
		return flightArrivalTime;
	}
	void setFlightNum( String flightNum) {
		this.flightNum = flightNum;
	}
	void setFlightOrigin( String flightOrigin) {
		this.flightOrigin = flightOrigin;
	}
	void setFlightDestination( String flightDestination) {
		this.flightDestination = flightDestination;
	}
	void setFlightDepartureDate( String flightDepartureDate) {
		this.flightDepartureDate = flightDepartureDate;
	}
	void setFlightArrivalTime( String flightArrivalTime) {
		this.flightArrivalTime = flightArrivalTime;
	}
	void setFlightDepartureTime( String flightDepartureTime) {
		this.flightDepartureTime = flightDepartureTime;
	}
	void setFlightType( String flightType) {
		this.flightType = flightType;
	}
}