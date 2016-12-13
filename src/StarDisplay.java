public class StarDisplay extends TemplateMethod {

	@Override
	protected void process1() {
		System.out.println("START ☆");
	}

	@Override
	protected void process2() {
		System.out.println("★");
	}

	@Override
	protected void process3() {
		System.out.println("☆ END");
	}
}
