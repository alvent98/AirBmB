package project_airbmb.airbmb.DAO;

package com.example.airbmb.DAO;

//import com.mgiandia.library.contacts.EmailAddress;
//import com.mgiandia.library.domain.*;
//import com.mgiandia.library.util.Money;


public abstract class Initializer  {

    
    //διαγράφουμε όλα τα δεδομένα στη βάση δεδομένων
    protected abstract void eraseData();
    
    
  
    
    public void prepareData() {
        // πριν εισάγουμε τα δεδομένα διαγράφουμε ότι υπάρχει
        eraseData();  

		Owner owner1 = new Owner ("Christopher","Robin","christ@email.com","12345678","chr","123123");
		Owner owner2 = new Owner ("Nick","Pos","nickpos@email.com","87654321","nick12","123443");
		Owner owner3 = new Owner ("Manos","Tounis","ManosT@email.com","78654321","Manos1996","444663");
		
		House house1 = new House ("kabala","kabalas",32,4,2,3,250,owner1);
		House house2 = new House ("evoia","xalkidas",17,72,3,3,300,owner2);
		House house3 = new House ("patra","kozanis",9,32,1,2,170,owner3);
		House house4 = new House ("tripoli","lakonias",57,7,0,4,320,owner2);
		
        Renter renter1= new Renter ("tom","possibol","tompos@email.com","12222237","possibol15","tom123");
		Renter renter2= new Renter ("kostantinos","pixinis","kopi@email.com","1598764","kostpi","56009");
		Renter renter3= new Renter ("takis","mpar","takmpar@email.com","22209767","takaros","957609");
		Renter renter4= new Renter ("alex","kouper","kouper@email.com","8757599","alex","102938");
		 
		 
		 
		 Lease lease1= new Lease((0,2,0),500);
		 Lease lease2= new Lease((0,5,0),1500);
		 Lease lease3= new Lease((2,0,0),4080);
		 Lease lease4= new Lease((0,6,0),1920);
		 
		 EvaluationForHouse EH1 = new EvaluationForHouse(lease1,1,"dont go there  its the most hidious owner ever");
		 EvaluationForHouse EH2 = new EvaluationForHouse(lease2,5,"perfect everything good");
		 EvaluationForHouse EH3 = new EvaluationForHouse(lease3,4,"nice house but no wifi"); 
		 EvaluationForHouse EH4 = new EvaluationForHouse(lease4,5,"everything was fine");
		
        EvaluationForRenter ER1 = new EvaluationForRenter(lease1,1,"dont rent to him its the most hidious renter ever",560);
        EvaluationForRenter ER2 = new EvaluationForRenter(lease2,4,"enough cooperative renter",0);
		EvaluationForRenter ER3 = new EvaluationForRenter(lease3,4,"very nice but they left trash behind",0);
		EvaluationForRenter ER4 = new EvaluationForRenter(lease3,5,"the kindest renter i've ever had!!",0);
		
	}
	   /*getItemDAO().save(umlUserGuideItem1);
        getItemDAO().save(umlDistilledItem2);                
        getItemDAO().save(refactoringItem3);
        getItemDAO().save(umlUserGuideItem4);
        getItemDAO().save(umlDistilledItem5);
        
       
		
       
        
        getBorrowerDAO().save(mgia);
        getBorrowerDAO().save(ndia);                                
    }    
    
    
    protected abstract BorrowerDAO getBorrowerDAO();
    protected abstract ItemDAO getItemDAO();
    protected abstract LoanDAO getLoanDAO();
    */
}