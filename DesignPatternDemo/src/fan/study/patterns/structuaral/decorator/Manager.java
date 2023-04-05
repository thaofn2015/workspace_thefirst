package fan.study.patterns.structuaral.decorator;

public class Manager extends EmployeeDecorator {

	public Manager(IEmployeeComponent employee) {
		super(employee);
	}
	
	public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }
 
    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }

	@Override
	public void doTask() {
		this.employee.doTask();
		createRequirement();
		assignTask();
	}

}
