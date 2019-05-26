package com.example.airbmb.DaoMemory;

import java.util.ArrayList;
import com.example.airbmb.Dao.EvaluationForRenterDAO;
import com.example.airbmb.Model.EvaluationForRenter;

/**
 * EvaluationForRenter Memory DAO
 */
public class EvaluationForRenterDAOMemory implements EvaluationForRenterDAO {
    protected static ArrayList<EvaluationForRenter> evaluationForRenterList = new ArrayList<EvaluationForRenter>();
    protected static double averagePrice;

    /**
     * Deletes a EvaluationForRenter
     * @param evaluationForRenter EvaluationForRenter
     */
    public void delete(EvaluationForRenter evaluationForRenter) {
       evaluationForRenterList.remove(evaluationForRenter);
    }

    /**
     * Returns all EvaluationForRenter
     * @return list of EvaluationForRenter
     */
    public ArrayList<EvaluationForRenter> findAll() {
        ArrayList<EvaluationForRenter> result = new ArrayList<EvaluationForRenter>();
        result.addAll(evaluationForRenterList);
        return result;
    }

    /**
     * Saves a EvaluationForRenter
     * @param evaluationForRenter EvaluationForRenter
     */
    public void save(EvaluationForRenter evaluationForRenter) {
        evaluationForRenterList.add(evaluationForRenter);
    }

    /**
     * Finds a EvaluationForRenter according to id
     * @param evaluationForRenterId EvaluationForRenter's id
     * @return the EvaluationForRenter that was found or null
     */
    public EvaluationForRenter find(int evaluationForRenterId)
    {
    	for(EvaluationForRenter e : evaluationForRenterList) if(e.getEvaluationId() == evaluationForRenterId) return e;

        return null;
    }

   /**
	 * finds a EvaluationForRenter according to feedback
	 * @param feedback EvaluationForRenter's int from 1 to 5
	 * @return Evaluation list that was found or null.
	 */
    @Override
    public ArrayList<EvaluationForRenter> findByFeedback(int feedback){

        ArrayList<EvaluationForRenter> result = new ArrayList<>();
        for (EvaluationForRenter f : evaluationForRenterList) {
            if (f.getFeedback()==feedback) {
                result.add(f);
            }
        }
        return result;
    }
	
	
	
	

   
}