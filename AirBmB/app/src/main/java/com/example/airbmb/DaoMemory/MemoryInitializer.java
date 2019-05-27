package  com.example.airbmb.DaoMemory;

import com.example.airbmb.Dao.EvaluationForHouseDAO;
import com.example.airbmb.Dao.EvaluationForRenterDAO;
import com.example.airbmb.Dao.HouseDAO;
import com.example.airbmb.Dao.Initializer;
import com.example.airbmb.Dao.LeaseDAO;
import com.example.airbmb.Dao.OwnerDAO;
import com.example.airbmb.Dao.RenterDAO;
import com.example.airbmb.Model.EvaluationForHouse;
import com.example.airbmb.Model.EvaluationForRenter;
import com.example.airbmb.Model.House;
import com.example.airbmb.Model.Lease;
import com.example.airbmb.Model.Owner;
import com.example.airbmb.Model.Renter;

public class MemoryInitializer extends Initializer {
    
    @Override
    protected void eraseData() {

        for(Owner owner : getOwnerDAO().findAll()) {
            getOwnerDAO().delete(owner);
        }

        for(House house : getHouseDAO().findAll()) {
            getHouseDAO().delete(house);
        }
        
        for(Renter renter : getRenterDAO().findAll()) {
            getRenterDAO().delete(renter);
        }

        for(Lease lease : getLeaseDAO().findAll()) {
            getLeaseDAO().delete(lease);
        }

        for(EvaluationForRenter er : getEvaluationForRenterDAO().findAll()) {
            getEvaluationForRenterDAO().delete(er);
        }

        for(EvaluationForHouse eh : getEvaluationForHouseDAO().findAll()) {
            getEvaluationForHouseDAO().delete(eh);
        }
    }

    @Override
    public OwnerDAO getOwnerDAO()
    {
        return new OwnerDAOMemory();
    }

    @Override
    public HouseDAO getHouseDAO()
    {
        return new HouseDAOMemory();
    }

    @Override
    public RenterDAO getRenterDAO() {
        return new RenterDAOMemory();
    }

    @Override
    public LeaseDAO getLeaseDAO() {
        return new LeaseDAOMemory();
    }

    @Override
    public EvaluationForHouseDAO getEvaluationForHouseDAO() {
        return new EvaluationForHouseDAOMemory();
    }

    @Override
    public EvaluationForRenterDAO getEvaluationForRenterDAO() {
        return new EvaluationForRenterDAOMemory();
    }
}