package fan.study.patterns.behavioral.command.b;

public class DocumentEditorCommand implements ICommand{

	private Document document;
	private String line;
	
	public DocumentEditorCommand(Document document, String line) {
		this.document = document;
		this.line = line;
	}

	@Override
	public void undo() {
		System.out.println("----- undo -----");
		document.eraseLast();
	}

	@Override
	public void redo() {
		System.out.println("----- redo -----");
		document.write(line);
	}
}
