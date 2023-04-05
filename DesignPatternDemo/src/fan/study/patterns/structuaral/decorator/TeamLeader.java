package fan.study.patterns.structuaral.decorator;

public class TeamLeader extends EmployeeDecorator {

	public TeamLeader(IEmployeeComponent employee) {
		super(employee);
	}
	
	public void planingTask() {
		System.out.println(this.employee.getName() + " have planning task");
	}
	
	public void motivate() {
        System.out.println(this.employee.getName() + " have motivating task");
    }

	@Override
	public void doTask() {
		this.employee.doTask();
		planingTask();
		motivate();
	}

}
