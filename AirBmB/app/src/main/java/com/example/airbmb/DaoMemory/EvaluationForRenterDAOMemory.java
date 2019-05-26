package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.EvaluationForRenterDAO;
import com.example.airbmb.Model.EvaluationForRenter;

/**
 * EvaluationForRenter Memory DAO
 */
public class EvaluationForRenterDAOMemory implements EvaluationForRenterDAO {
    protected static ArrayList<EvaluationForRenter> EvaluationForRenterList = new ArrayList<EvaluationForRenter>();
    protected static double averagePrice;

    /**
     * Deletes a EvaluationForRenter
     * @param entity EvaluationForRenter
     */
    public void delete(EvaluationForRenter entity) {
       EvaluationForRenterList.remove(entity);
    }

    /**
     * Returns all EvaluationForRenter
     * @return list of EvaluationForRenter
     */
    public ArrayList<EvaluationForRenter> findAll() {
        ArrayList<EvaluationForRenter> result = new ArrayList<EvaluationForRenter>();
        result.addAll(EvaluationForRenterList);
        return result;
    }

    /**
     * Saves a EvaluationForRenter
     * @param entity EvaluationForRenter
     */
    public void save(EvaluationForRenter entity) {
        EvaluationForRenterList.add(entity);
    }

    /**
     * Finds a EvaluationForRenter according to id
     * @param houseId EvaluationForRenter's id
     * @return the EvaluationForRenter that was found or null
     */
    public House find(int EvaluationForRenterId)
    {
    	for(EvaluationForRenter EFR : EvaluationForRenterList) if(EFR.getEvaluationId() == EvaluationForRenterId) return EFR;

        return null;
    }

   /**
	 * finds a EvaluationForRenter according to Feedback
	 * @param Feedback EvaluationForRenter's int from 1 to 5
	 * @return Evaluation that was found or null
	 */
    @Override
    public ArrayList<EvaluationForRenter> findByFeedback(int Feedback){

        ArrayList<EvaluationForRenter> result = new ArrayList<>();

        if (Feedback != null) {
            for (EvaluationForHouse F : EvaluationForHouseList) {
                if (F.getCity().contains(Feedback)) {
                    result.add(F);
                }
            }
        }
        return result;
    }
	
	
	
	

   
}