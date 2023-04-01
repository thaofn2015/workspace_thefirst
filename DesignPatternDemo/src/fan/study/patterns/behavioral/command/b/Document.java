package fan.study.patterns.behavioral.command.b;

import java.util.Stack;

public class Document {

	private Stack<String> lines;
	
	public Document() {
		this.lines = new Stack<String>();
	}

	public void write(String newLine) {
		lines.push(newLine);
	}

	public void eraseLast() {
		if (!lines.isEmpty()) {
			lines.pop();
		}
	}

	public void read() {
		lines.forEach(System.out::println);
	}
}
