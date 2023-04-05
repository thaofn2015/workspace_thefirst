package fan.study.patterns.structuaral.decorator;

public class Main {

	public static void main(String[] args) {
		
		IEmployeeComponent employee = new EmployeeConcreteComponent("ThaoPN1");
		employee.doTask();
		System.out.println("----------------");
		
		EmployeeDecorator member = new TeamMember(employee);
		member.doTask();
		System.out.println("----------------");
		
		
		EmployeeDecorator leader = new TeamLeader(employee);
		leader.doTask();
		System.out.println("----------------");
		
		EmployeeDecorator manager = new Manager(employee);
		manager.doTask();
		System.out.println("----------------");
		
		EmployeeDecorator manager2 = new Manager(leader);
		manager2.doTask();
		System.out.println("----------------");
	}
}
