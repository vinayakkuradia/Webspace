package application.layers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.exceptions.DataAccessException;
import application.layers.dao.entity.Branch;
import application.layers.dao.entity.Trainee;
import application.layers.dao.factory.JdbcConnectionFactory;

public class TraineeDaoImpl implements TraineeDao {

	Connection connection;
	
	public TraineeDaoImpl() {
		this.connection = JdbcConnectionFactory.getConnection();
	}

	@Override
	public List<Trainee> getAllTrainees() {
		List<Trainee> traineeList = new ArrayList<>();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from trainees");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				traineeList.add(new Trainee(resultSet.getInt("trainee_id"),
						resultSet.getString("trainee_name"),
						Branch.valueOf(resultSet.getString("branch")),
						resultSet.getFloat("percentage")));
			}
		} catch (SQLException e) {
			throw new DataAccessException("Failed to retrieve records");
		}
		return traineeList;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into trainees(trainee_name, branch, percentage) values(?, ?, ?)");
			preparedStatement.setString(1, trainee.getTraineeName());
			preparedStatement.setString(2, trainee.getBranch().name());
			preparedStatement.setFloat(3, trainee.getPercentage());
			int affectedRows = preparedStatement.executeUpdate();
			System.out.println(affectedRows+" rows affected");
		} catch (SQLException e) {
			throw new DataAccessException("Failed to add trainee");
		}
	}

}
