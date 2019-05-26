package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.EvaluationForHouseDAO;
import com.example.airbmb.Model.EvaluationForHouse;

/**
 * EvaluationForHouse Memory DAO
 */
public class EvaluationForHouseDAOMemory implements EvaluationForHouseDAO {
    protected static ArrayList<EvaluationForHouse> EvaluationForHouseList = new ArrayList<EvaluationForHouse>();
    protected static double averagePrice;

    /**
     * Deletes a EvaluationForHouse
     * @param entity EvaluationForHouse
     */
    public void delete(EvaluationForHouse entity) {
        EvaluationForHouseList.remove(entity);
    }

    /**
     * Returns all EvaluationForHouse
     * @return list of EvaluationForHouse
     */
    public ArrayList<EvaluationForHouse> findAll() {
        ArrayList<EvaluationForHouse> result = new ArrayList<EvaluationForHouse>();
        result.addAll(EvaluationForHouseList);
        return result;
    }

    /**
     * Saves a EvaluationForHouse
     * @param entity EvaluationForHouse
     */
    public void save(EvaluationForHouse entity) {
        EvaluationForHouseList.add(entity);
    }

    /**
     * Finds a EvaluationForHouse according to id
     * @param houseId EvaluationForHouse's id
     * @return the EvaluationForHouse that was found or null
     */
    public House find(int EvaluationForHouseId)
    {
    	for(EvaluationForHouse EFH : EvaluationForHouseList) if(EFH.getEvaluationId() == EvaluationForHouseId) return EFH;

        return null;
    }

   /**
	 * finds a EvaluationForHouse according to Feedback
	 * @param Feedback EvaluationForHouse's int from 1 to 5
	 * @return Evaluation that was found or null
	 */
    @Override
    public ArrayList<EvaluationForHouse> findByFeedback(int Feedback){

        ArrayList<EvaluationForHouse> result = new ArrayList<>();

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