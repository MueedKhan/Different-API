

public class IndiGo {

	public static void main(String[] args) {
			Passenger Mueed = new Passenger("Mueed Ahmed Khan", "Mued1234@gmail.com", 9012345677L, 24);
			Passenger Burhan = new Passenger("Burhan-ud-din Drabu", "Drabu141@gmail.com", 9012425677L, 24);
			Passenger Aamir = new Passenger("Mohammad Aamir", "Amir.121@gmail.com", 9012345171L, 24);
			Passenger Iliyas = new Passenger("Iliyas Farooq Zargar", "ZargarEliyas1234@gmail.com", 9012346732L, 24);
			Passenger Zaid = new Passenger("Zaid Rasool Mir", "Zaid234@gmail.com", 90123443544L, 24);
			Passenger Shakeel = new Passenger("Shakeel Ahmed Mir", "Shaky324@gmail.com", 90123445437L, 24);
			Mueed.checkPassengerAge();
     		Flight f = new Flight("DE 657", "Delhi", "Bangalore", "12 july", "Economy", "14.25", "17.35");
			States s = new States();
			int var = s.fareForDifferentStates("Delhi","Bangalore");
			System.out.println(var);
	}

}
