package com.example.airbmb.Dao;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.airbmb.Model.EvaluationForHouse;
import com.example.airbmb.Model.EvaluationForRenter;
import com.example.airbmb.Model.House;
import com.example.airbmb.Model.Lease;
import com.example.airbmb.Model.Owner;
import com.example.airbmb.Model.Renter;

import java.time.LocalDate;

public abstract class Initializer  {
    protected abstract void eraseData();

    @RequiresApi(api = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
    public void prepareData() {
        eraseData();

        OwnerDAO od = getOwnerDAO();
        HouseDAO hd = getHouseDAO();
        RenterDAO rd = getRenterDAO();
        LeaseDAO ld = getLeaseDAO();
        EvaluationForHouseDAO ehd = getEvaluationForHouseDAO();
        EvaluationForRenterDAO erd = getEvaluationForRenterDAO();

        Owner owner1 = new Owner ("Christopher","Robin","christ@email.com","12345678","chr","123123");
        Owner owner2 = new Owner ("Nick","Pos","nickpos@email.com","87654321","nick12","123443");
        Owner owner3 = new Owner ("Manos","Tounis","ManosT@email.com","78654321","Manos1996","444663");

        House house1 = new House ("kabala", "kabalas",32,4,2,3,250,owner1);
        House house2 = new House ("evoia","xalkidas",17,72,3,3,300,owner2);
        House house3 = new House ("patra","kozanis",9,32,1,2,170,owner3);
        House house4 = new House ("tripoli","lakonias",57,7,0,4,320,owner2);

        Renter renter1= new Renter ("tom","possibol","tompos@email.com","12222237","possibol15","tom123");
        Renter renter2= new Renter ("kostantinos","pixinis","kopi@email.com","1598764","kostpi","56009");
        Renter renter3= new Renter ("takis","mpar","takmpar@email.com","22209767","takaros","957609");
        Renter renter4= new Renter ("alex","kouper","kouper@email.com","8757599","alex","102938");

        LocalDate start = LocalDate.of(2019, 4, 20);
        LocalDate end = LocalDate.of(2019, 4, 26);
        Lease lease1= new Lease(start,end,0,renter1,house1);
        Lease lease2= new Lease(start,end,0,renter2,house2);
        Lease lease3= new Lease(start,end,0,renter3,house3);
        Lease lease4= new Lease(start,end,0,renter4,house4);

        EvaluationForHouse eh1 = new EvaluationForHouse(lease1,1,"dont go there  its the most hidious owner ever");
        EvaluationForHouse eh2 = new EvaluationForHouse(lease2,5,"perfect everything good");
        EvaluationForHouse eh3 = new EvaluationForHouse(lease3,4,"nice house but no wifi");
        EvaluationForHouse eh4 = new EvaluationForHouse(lease4,5,"everything was fine");

        EvaluationForRenter er1 = new EvaluationForRenter(lease1,1,"dont rent to him its the most hidious renter ever",560);
        EvaluationForRenter er2 = new EvaluationForRenter(lease2,4,"enough cooperative renter",0);
        EvaluationForRenter er3 = new EvaluationForRenter(lease3,4,"very nice but they left trash behind",0);
        EvaluationForRenter er4 = new EvaluationForRenter(lease3,5,"the kindest renter i've ever had!!",0);

        od.save(owner1);
        od.save(owner2);
        od.save(owner3);

        hd.save(house1);
        hd.save(house2);
        hd.save(house3);
        hd.save(house4);

        rd.save(renter1);
        rd.save(renter2);
        rd.save(renter3);
        rd.save(renter4);

        ld.save(lease1);
        ld.save(lease2);
        ld.save(lease3);
        ld.save(lease4);

        ehd.save(eh1);
        ehd.save(eh2);
        ehd.save(eh3);
        ehd.save(eh4);

        erd.save(er1);
        erd.save(er2);
        erd.save(er3);
        erd.save(er4);
    }
    public abstract OwnerDAO getOwnerDAO();

    public abstract HouseDAO getHouseDAO();

    public abstract RenterDAO getRenterDAO();

    public abstract LeaseDAO getLeaseDAO();

    public abstract EvaluationForHouseDAO getEvaluationForHouseDAO();

    public abstract EvaluationForRenterDAO getEvaluationForRenterDAO();
}
