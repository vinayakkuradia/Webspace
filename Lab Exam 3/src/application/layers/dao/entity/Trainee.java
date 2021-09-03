package application.layers.dao.entity;

public class Trainee {
	
	// Attributes
	int traineeId;
	String traineeName;
	Branch branch;
 	float percentage;
 	
 	// Constructors
 	
	public Trainee() {
	}

	public Trainee(String traineeName, Branch branch, float percentage) {
		this.traineeName = traineeName;
		this.branch = branch;
		this.percentage = percentage;
	}

	public Trainee(int traineeId, String traineeName, Branch branch, float percentage) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.branch = branch;
		this.percentage = percentage;
	}
	
	// Getters and Setters
	
	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	
	// toString implementation
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trainee [traineeId=");
		builder.append(traineeId);
		builder.append(", traineeName=");
		builder.append(traineeName);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}
 	
}
