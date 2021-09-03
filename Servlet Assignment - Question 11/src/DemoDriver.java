
public class DemoDriver {
	String nameString;

	public DemoDriver(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DemoDriver [nameString=");
		builder.append(nameString);
		builder.append("]");
		return builder.toString();
	}
	
}
