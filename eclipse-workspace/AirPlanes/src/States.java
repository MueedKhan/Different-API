
public class States {
		private String Bangalore;
		private String Delhi;
		private String Srinagar;
		private String Mumbai;
		private String Kolkatta;
		private String stateOrigin;
		private String stateDestination;
		
		int fareForDifferentStates( String stateOrigin, String stateDestination) {
		
				this.stateOrigin 			= 		stateOrigin;
				this.stateDestination 		=	 	stateDestination;
				
				if(stateOrigin.equals("Delhi") && stateDestination.equals("Bangalore")) {
					System.out.print("Your fare is ");
					return 4000;
			    }
				else if(stateOrigin.equals("Delhi")&& stateDestination.equals("Srinagar")) {
					    return 3000; 
				}
				else if(stateOrigin.equals("Delhi")&& stateDestination.equals("Mumbai")) {
						return 8000;
				}
				else if(stateOrigin.equals("Delhi") && stateDestination.equals("Kolkatta")) {
					return 5000;
				}
				else if(stateOrigin.equals("Srinagar") && stateDestination.equals("Delhi")) {
					return 3500;
				}
				else if(stateOrigin.equals("Srinagar") && stateDestination.equals("Mumbai")) {
					return 9000;
				}
				else if(stateOrigin.equals("Srinagar") && stateDestination.equals("Kolkatta")) {
					return 6000;
				}
				else if(stateOrigin.equals("Srinagar")&& stateDestination.equals("Bangalore")) {
					return 7500;
				}
				else if(stateOrigin.equals("Bangalore") && stateDestination.equals("Mumbai")) {
					return 4000;
		        }
         		else if(stateOrigin.equals("Bangalore") && stateDestination.equals("Delhi")) {
         			return 3800;
         		}
				else if(stateOrigin.equals("Bangalore")&& stateDestination.equals("Srinagar")) {
					return 7600;
				}
				else if(stateOrigin.equals("Bangalore") && stateDestination.equals("Kolkatta")) {
					return 5500;
				}
				else if(stateOrigin.equals("Mumbai") && stateDestination.equals("Srinagar")) {
					return 8800;
				}
				else if(stateOrigin.equals("Mumbai") && stateDestination.equals("Delhi")) {
					return 7500;
				}
				else if(stateOrigin.equals("Mumbai")&& stateDestination.equals("Bangalore")) {
					return 4500;
				}
				else if(stateOrigin.equals("Mumbai")&& stateDestination.equals("Kolkatta")) {
					return 6000;
				}
				else if(stateOrigin.equals("Kolkatta")&& stateDestination.equals("Delhi")) {
					return 4500;
				}
				else if(stateOrigin.equals("Kolkatta") && stateDestination.equals("Mumbai")) {
					return 5500;
				}
				else if(stateOrigin.equals("Kolkatta") && stateDestination.equals("Srinagar")) {
					return 6500;  
				}
				else if(stateOrigin.equals("Kolkatta")&& stateDestination.equals("Bangalore")) {
					return 6000;
				}
				else {   
			        return 0;
				}    
}
}