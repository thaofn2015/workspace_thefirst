package fan.study.patterns.structuaral.decorator;

public abstract class EmployeeDecorator implements IEmployeeComponent {

	protected IEmployeeComponent employee;
	
	public EmployeeDecorator(IEmployeeComponent employee) {
		this.employee = employee;
	}

	@Override
	public String getName() {
		return employee.getName();
	}

	@Override
	public void join(String date) {
		employee.join(date);
	}

	@Override
	public void terminal(String date) {
		employee.terminal(date);
	}

}
