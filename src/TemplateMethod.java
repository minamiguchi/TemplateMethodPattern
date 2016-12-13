public abstract class TemplateMethod {
	protected abstract void process1();

	protected abstract void process2();

	protected abstract void process3();

	public final void mainProcess() {
		process1();
		for (int i = 0; i < 5; i++) {
			process2();
		}
		process3();
	}
}