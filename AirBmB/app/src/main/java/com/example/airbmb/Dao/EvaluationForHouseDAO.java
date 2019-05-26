package com.example.airbmb.Dao;

import java.util.List;
import com.example.airbmb.Model.EvaluationForHouse;

/**
 * Renter DAO
 */
public interface EvaluationForHouseDAO
{
	/**
	 * Deletes a EvaluationForHouse
	 * @param entity EvaluationForHouse
	 */
	void delete(EvaluationForHouse entity);

	/**
	 * Returns all EvaluationForHouse
	 * @return list of EvaluationForHouse
	 */
	List<EvaluationForHouse> findAll();

	/**
	 * Saves a EvaluationForHouse
	 * @param entity EvaluationForHouse
	 */
	void save(EvaluationForHouse entity);

	/**
	 * finds a EvaluationForHouse according to id
	 * @param EvaluationId EvaluationForHouse's unique id
	 * @return Evaluation that was found or null
	 */
	EvaluationForHouse find(int EvaluationId);
	
	/**
	 * finds a EvaluationForHouse according to Feedback
	 * @param Feedback EvaluationForHouse's int from 1 to 5
	 * @return Evaluation that was found or null
	 */
	EvaluationForHouse findByFeedback(int Feedback);
	

	
 }