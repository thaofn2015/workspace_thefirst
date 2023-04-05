package fan.study.patterns.structuaral.decorator;

public class TeamMember extends EmployeeDecorator {

	public TeamMember(IEmployeeComponent employee) {
		super(employee);
	}
	
	public void reportTask() {
		System.out.println(this.employee.getName() + " have task report");
	}

	@Override
	public void doTask() {
		this.employee.doTask();
		reportTask();
	}

}
