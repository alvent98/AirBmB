package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.EvaluationForHouseDAO;
import com.example.airbmb.Model.EvaluationForHouse;

/**
 * EvaluationForHouse Memory DAO
 */
public class EvaluationForHouseDAOMemory implements EvaluationForHouseDAO {
    protected static ArrayList<EvaluationForHouse> evaluationForHouseList = new ArrayList<EvaluationForHouse>();
    protected static double averagePrice;

    /**
     * Deletes an EvaluationForHouse
     * @param entity EvaluationForHouse
     */
    public void delete(EvaluationForHouse entity) {
        evaluationForHouseList.remove(entity);
    }

    /**
     * Returns all EvaluationForHouse
     * @return list of EvaluationForHouse
     */
    public ArrayList<EvaluationForHouse> findAll() {
        ArrayList<EvaluationForHouse> result = new ArrayList<EvaluationForHouse>();
        result.addAll(evaluationForHouseList);
        return result;
    }

    /**
     * Saves a EvaluationForHouse
     * @param entity EvaluationForHouse
     */
    public void save(EvaluationForHouse entity) {
        evaluationForHouseList.add(entity);
    }

    /**
     * Finds a EvaluationForHouse according to id
     * @param evaluationForHouseId EvaluationForHouse's id
     * @return the EvaluationForHouse that was found or null
     */
    public EvaluationForHouse find(int evaluationForHouseId)
    {
    	for(EvaluationForHouse e : evaluationForHouseList) if(e.getEvaluationId() == evaluationForHouseId) return e;

        return null;
    }

   /**
	 * finds a EvaluationForHouse according to Feedback
	 * @param feedback EvaluationForHouse's int from 1 to 5
	 * @return Evaluation that was found or null
	 */
    @Override
    public ArrayList<EvaluationForHouse> findByFeedback(int feedback){

        ArrayList<EvaluationForHouse> result = new ArrayList<>(); 
        for (EvaluationForHouse e : evaluationForHouseList) {
        	if (e.getFeedback()==feedback) result.add(e);
        }
        return result;
    }
}