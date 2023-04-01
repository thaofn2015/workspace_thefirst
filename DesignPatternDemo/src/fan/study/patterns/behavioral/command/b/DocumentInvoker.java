package fan.study.patterns.behavioral.command.b;

import java.util.Stack;

public class DocumentInvoker {

	private Document document;

	private Stack<ICommand> undoCommand;
	private Stack<ICommand> redoCommand;
	
	public DocumentInvoker() {
		this.document = new Document();
		this.undoCommand = new Stack<ICommand>();
		this.redoCommand = new Stack<ICommand>();
	}

	public void undo() {
		if (!undoCommand.isEmpty()) {
			ICommand command = undoCommand.pop();
			command.undo();
			
			redoCommand.push(command);
		}
	}
	
	public void redo() {
		if (!redoCommand.isEmpty()) {
			ICommand command = redoCommand.pop();
			command.redo();
			
			undoCommand.push(command);
		}
	}
	
	public void write(String line) {
		ICommand command = new DocumentEditorCommand(document, line);
		command.redo();
		
		undoCommand.push(command);
		redoCommand.clear();
	}
	
	public void read() {
		document.read();
	}
}
