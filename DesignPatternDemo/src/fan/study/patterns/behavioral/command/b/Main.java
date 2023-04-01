package fan.study.patterns.behavioral.command.b;

public class Main {

	public static void main(String[] args) {
		
		DocumentInvoker docInvoker = new DocumentInvoker();
		
		System.out.println("Read 1: ");
		docInvoker.read();
		
		docInvoker.write("Hello world 1");
		System.out.println("Read 2: ");
		docInvoker.read();

		docInvoker.write("Hello world 2");
		docInvoker.write("Hello world 3");
		docInvoker.write("Hello world 4");
		System.out.println("Read 3: ");
		docInvoker.read();
		
		docInvoker.undo();
		docInvoker.undo();
		System.out.println("Read 4: ");
		docInvoker.read();
		
		docInvoker.redo();
		System.out.println("Read 5: ");
		docInvoker.read();
	}
}
