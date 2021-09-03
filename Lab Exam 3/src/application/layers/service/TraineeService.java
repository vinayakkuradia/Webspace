package application.layers.service;

import java.util.List;

import application.layers.dao.entity.Trainee;

public interface TraineeService {
	public List<Trainee> getAllTrainees();
	public void addTrainee(Trainee trainee);
}
