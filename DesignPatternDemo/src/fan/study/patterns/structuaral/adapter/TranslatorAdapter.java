package fan.study.patterns.structuaral.adapter;

public class TranslatorAdapter implements VietnameseTarget {

	private JapaneseAdaptee adaptee;
	
	public TranslatorAdapter(JapaneseAdaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void send(String words) {
		System.out.println("Vietnamese: " + words);
		adaptee.receive(translate(words));
		
	}
	
	private String translate(String words) {
		System.out.println("Translated! " + words);
		return "こんにちは";
	}
}
