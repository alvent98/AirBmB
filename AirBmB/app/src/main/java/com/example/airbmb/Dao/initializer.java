package com.mgiandia.library.dao;

import com.mgiandia.library.contacts.EmailAddress;
import com.mgiandia.library.domain.*;
import com.mgiandia.library.util.Money;


/**
 * Κλάση που αναλαμβάνει να αρχικοποιήσει τα δεδομένα της βάσης δεδομένων<p>
 * Βοηθητική κλάση που παρέχει δεδομένα για τα παραδείγματα και τις δοκιμασίες ελέγχου<p>
 * Βιβλία
 * <p>
 * Booch, G.,  Rumbaugh, J., Jacobson I., The Unified Modeling Language User Guide , 2nd ed., Addison Wesley, 2005 
 * <p>
 * Fowler, M., UML Distilled, 3rd ed., Addison-Wesley, 2004
 * <p>
 * Fowler, M., Refactoring: Improving the Design of Existing Code. Addison-Wesley, 1999
 * <p>
 * Αντίτυπα 
 * <p>
 * 1 - The Unified Modeling Language User Guide
 * <p>
 * 2 -  UML Distilled
 * <p>
 * 3 - Refactoring: Improving the Design of Existing Code
 * <p>
 * 4 - The Unified Modeling Language User Guide
 * <p>
 * 5 - UML Distilled
 * <p>
 * Δανειζόμενοι
 * <p>
 * 1, Μανόλης Γιακουμάκης, Καθηγητής
 * <p>
 * 2, Νίκος Διαμαντίδης, Φοιτητής
 * <p>
 *@author Νίκος Διαμαντίδης
 *    
 */
public abstract class Initializer  {
    public static final int GIAKOUMAKIS_ID = 1;
    public static final int DIAMANTIDIS_ID = 2;
    
    public static int UML_USER_GUIDE_ID1 = 1;
    public static int UML_DISTILLED_ID1 = 2;
    public static int UML_REFACTORING_ID = 3;
    public static int UML_USER_GUIDE_ID2 = 4;
    public static int UML_DISTILLED_ID2 = 5;
    
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
		
		public EvaluationForRenter(Lease lease, int feedback, String comments, int repairsValue)
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