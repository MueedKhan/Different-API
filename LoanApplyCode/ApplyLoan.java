// Loan  Salaried Employee(boolean)   Previous loan(boolean)  




class ApplyLoan{

	  private  		 	   String 	 employeeName;
	  private 			   boolean   salariedEmployee;
	  private  			   int 		 employeeSalary;
	  private 			   int 		 age;
	  private static final int 		 MIN_AGE_FOR_LOAN    =   21;
	  private static final int 		 MAX_AGE_FOR_LOAN    =   60;
      private static final int       MIN_MONTHLY_INCOME  =   15000;

      public ApplyLoan ( String employeeName, boolean salariedEmployee ){

        this.employeeName     =  employeeName;
      	this.salariedEmployee =  salariedEmployee;
        if ( this.salariedEmployee  ) {

        	System.out.println("You are a salaried employee and hence eligible for applying to Loan");
        
        }

        else {
        	
        	System.out.println("You are not eligible for applying because you are not a salaried employee");
        
        }
      
      }
      
       public  void  previousLoan ( String employeeName ) {

      	   if ( this.employeeName == employeeName ){

      	   	 System.out.println("Since you already have a previous loan so you are not eligible to apply again");
             notEligible();	   
      	   }    
      } 

      public   boolean ageForApplying ( int age ) {

      	this.age = age;

      	switch( age ){

      		case MAX_AGE_FOR_LOAN:
      		  System.out.println("Your age is " + age +  " Hence you are eligible to apply for loan");
      		  break;

      		case MIN_AGE_FOR_LOAN:
      		  System.out.println("Your age is " + age + " Hence you are eligible to apply for loan");
      		  break;

      		default:
      		  System.out.println("Not Eligible");;
      		  break; 

      	}
           return true;
      }

      public  boolean minSalaryForLoan( int employeeSalary ) {

      	this.employeeSalary  = employeeSalary;
      	if ( this.employeeSalary >= MIN_MONTHLY_INCOME ){

      		return true;
      	}
        
            else {

                System.out.println("Your salary " + employeeSalary + " is quite low to apply for loan  15000 is minimum salry required to apply ");
            	return false;
            }
      }

      public  void notEligible(){

      	System.out.println("Sorry you cannot apply for loan");

      }

      public static void main(String[] args) {
      	
      	ApplyLoan Mueed = new ApplyLoan("Mueed" , true);
      	if ( Mueed.salariedEmployee ){

      		Mueed.ageForApplying(21); 
      		Mueed.minSalaryForLoan(15000); 
            Mueed.previousLoan(Mueed.employeeName);
      }

      	else {
      		
      		 Mueed.notEligible();
      	}
      	
      }
}