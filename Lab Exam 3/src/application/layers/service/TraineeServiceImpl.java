package application.layers.service;

import java.util.List;

import application.layers.dao.TraineeDaoImpl;
import application.layers.dao.entity.Trainee;

public class TraineeServiceImpl implements TraineeService {

	TraineeDaoImpl traineeDaoImplObject;
	
	public TraineeServiceImpl() {
		traineeDaoImplObject = new TraineeDaoImpl();
	}
	
	@Override
	public List<Trainee> getAllTrainees() {
		return traineeDaoImplObject.getAllTrainees();
	}

	@Override
	public void addTrainee(Trainee trainee) {
		traineeDaoImplObject.addTrainee(trainee);
	}

}
