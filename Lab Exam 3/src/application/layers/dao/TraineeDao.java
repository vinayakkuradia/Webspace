package application.layers.dao;

import java.util.List;

import application.layers.dao.entity.Trainee;

public interface TraineeDao {
	public List<Trainee> getAllTrainees();
	public void addTrainee(Trainee trainee);
}
