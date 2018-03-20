import java.util.Scanner;
public class IndiGo{
 public static void main(String[] args) {

  	Passanger Mueed = new Passanger();
  	Mueed.setUniqueID(1551);
 	Mueed.setPassangerName("Mueed Khan");
 	Mueed.setPassangerAge(24);
 	Mueed.setPassangerEmailId("abc@gmail.com");
 	Mueed.setPassangerMobileNo(987589348L);
 	Scanner s = new Scanner(System.in);
    System.out.print("Enter your UniqueID ");
    int name = s.nextInt();
    if (Mueed.getUniqueID() == name){

    
    System.out.println("The details of a passanger are\nName : " + Mueed.getPassangerName() + " \nAge is : " + Mueed.getPassangerAge() + "\nMobileNo is " + Mueed.getPassangerMobileNo() + "\nEmail is " + Mueed.getPassangerEmailId() + " ");
    Flight Indigo = new Flight();
    Indigo.setFlightNum("6E 478");
    Indigo.setFlightOrigin("Srinagar");
    Indigo.setFlightDestination("Bangalore");
    Indigo.setFlightDepartureDate("20 July");
    Indigo.setFlightClass("Economy");
    Indigo.setMealsType("Beverages");
    System.out.println("The details of your flight are as follows\nFlight Number is " + Indigo.getFlightNum() + "\nFlight Origin " + Indigo.getFlightOrigin() + "\nFlight Destination " + Indigo.getFlightDestination() + "\nFlight Departure date is " + Indigo.getFlightDepartureDate() + "\nFlight meal that is avaliable " + Indigo.getMealsType());
    
   }
   else {
   	Mueed.bookingFailed();
   }
  }

}


class  Passanger{
        private int 		uniqueID;
		private String 		passangerName;
        private String 		passangerEmailId;
        private long   		passangerMobileNo;
        private int    		passangerAge;
        public int getUniqueID(){
            return uniqueID;
        }      
        public String getPassangerName(){
        	return passangerName;
        }
        public String getPassangerEmailId(){
        	return passangerEmailId;
        }
        public long getPassangerMobileNo(){
        	return passangerMobileNo;
        }
        public int getPassangerAge(){
        	return passangerAge;
        }
        public void setUniqueID( int uniqueID ){
        	this.uniqueID = uniqueID; 
        }
        public void setPassangerName( String passangerName ){
        	this.passangerName = passangerName;
        }
        public void setPassangerEmailId( String passangerEmailId ){
        	this.passangerEmailId = passangerEmailId;
        }
        public void setPassangerAge( int passangerAge ){
        	this.passangerAge = passangerAge;
        }
        public void setPassangerMobileNo( long passangerMobileNo ){
        	this.passangerMobileNo = passangerMobileNo;
        }     
        void bookingFailed(){
        	System.out.println("Your have not successfully booked the ticket");
        }
     /*    void data(){
    if ( this.passangerName == name){
    System.out.println("Your booking details are as follows ");
}
}*/
}


class  Flight{

		private 			 String   	flightNum;
		private 			 String   	flightOrgin;
		private 			 String   	flightDestination;
		private 			 String 	flightDepartureDate;
		private 			 String		flightClass;
		public  final static int 		LAGUAGGE_ALLOWED = 22;
        private 			 String		mealsType;

        public String getFlightNum(){
        	return  flightNum;
        }

        public String getFlightOrigin(){        	
        	return  flightOrgin;
        }

        public String getFlightDestination(){
        	return  flightDestination;
        }

        public String getFlightDepartureDate(){
        	return  flightDepartureDate;
        }

        public String getFlightClass(){
        	return  flightClass;
        }

        public String getMealsType(){
        	return  mealsType;
		}

        public  void setFlightNum( String flightNum ){
        	this.flightNum = flightNum;
        }
        public  void setFlightOrigin( String flightOrgin ){
        	this.flightOrgin = flightOrgin;
        }
        public  void setFlightDestination( String flightDestination ){
        	this.flightDestination = flightDestination;
        }
        public void setFlightDepartureDate( String flightDepartureDate ){
        	this.flightDepartureDate = flightDepartureDate;
        }
        public void setFlightClass( String flightClass ){
        	this.flightClass = flightClass;
        }
        public void setMealsType( String mealsType){
        	this.mealsType = mealsType;
        }
    
}
/*
class  Ticket{

				private String		bookingId;

		public boolean bookingTicket(String bookingId,String passangerName, String passangerEmailId, String flightNum, String flightOrgin, String flightDestination, String flightDepartureDate){
			this.bookingId			 = bookingId;
			this.passangerName       = passangerName;
			this.passangerEmailId    = passangerEmailId;
			this.flightNum           = flightNum;
			this.flightOrgin         = flightOrgin;
			this.flightDestination   = flightDestination;
			this.flightDepartureDate = flightDepartureDate;
		    return true;
		}
		public void confirmBooking(){
			System.out.println("Your booking details are\nbookingId :" + bookingId + "\npassagnger Name :"+ passangerName + "\npassanger EmailID :" + passangerEmailId + "\nflight number :" + flightNum + "\n flight Orgin " + flightOrgin + "\nflight destination :" + flightDestination + "\nflight Date :" + flightDepartureDate);  
		}
}*/
//Scanner function
//Compare with ID or name
//return details
//else return u have not any booking
