package application.controller.web;

import application.layers.dao.entity.Branch;
import application.layers.dao.entity.Trainee;
import application.layers.service.TraineeServiceImpl;

public class Main {

	public static void main(String[] args) {
		TraineeServiceImpl impl = new TraineeServiceImpl();
		impl.addTrainee(new Trainee("Sahil Kumar", Branch.valueOf("JAVA"), 80.0f));
		System.out.println(impl.getAllTrainees());
	}

}
