package fan.study.patterns.structuaral.decorator;

public class EmployeeConcreteComponent implements IEmployeeComponent {
	
	private String name;

	public EmployeeConcreteComponent(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void doTask() {
		System.out.println("Don't have task");
	}

	@Override
	public void join(String date) {
		System.out.println("Employee join at " + date);
	}

	@Override
	public void terminal(String date) {
		System.out.println("Employee terminal at " + date);
	}

}
