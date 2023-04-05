package fan.study.patterns.structuaral.decorator;

public interface IEmployeeComponent {
	
	public String getName();

	public void doTask();
	
	public void join(String date);
	
	public void terminal(String date);
}
