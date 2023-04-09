package fan.study.patterns.structuaral.adapter;

public class Main {

	public static void main(String[] args) {
		
		JapaneseAdaptee adaptee = new JapaneseAdaptee();
		
		VietnameseTarget veTarget = new TranslatorAdapter(adaptee);
		
		veTarget.send("Hello");
	}
	
}
