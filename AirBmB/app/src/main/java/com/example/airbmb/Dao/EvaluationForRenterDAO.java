package com.example.airbmb.Dao;

import java.util.ArrayList;
import com.example.airbmb.Model.EvaluationForRenter;

/**
 * EvaluationForRenter DAO
 */
public interface EvaluationForRenterDAO
{
	/**
	 * Deletes a EvaluationForRenter
	 * @param entity EvaluationForRenter
	 */
	void delete(EvaluationForRenter entity);

	/**
	 * Returns all EvaluationForRenter
	 * @return list of EvaluationForRenter
	 */
	ArrayList<EvaluationForRenter> findAll();

	/**
	 * Saves a EvaluationForRenter
	 * @param entity EvaluationForRenter
	 */
	void save(EvaluationForRenter entity);

	/**
	 * finds a EvaluationForRenter according to id
	 * @param EvaluationId EvaluationForRenter's unique id
	 * @return Evaluation that was found or null
	 */
	EvaluationForRenter find(int EvaluationId);
	
	/**
	 * finds a EvaluationForRenter according to Feedback
	 * @param Feedback EvaluationForRenter's int from 1 to 5
	 * @return The ArrayList of evaluations found, or null
	 */
	ArrayList<EvaluationForRenter> findByFeedback(int Feedback);
 }