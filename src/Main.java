
public class Main {

	public static void main(String[] args) {
		TemplateMethod proc1 = new StarDisplay();
		TemplateMethod proc2 = new SquareDisplay();

		proc1.mainProcess();
		proc2.mainProcess();
	}
}
