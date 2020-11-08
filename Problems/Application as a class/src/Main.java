class Application {

	String name;

	void run(String[] args) {
		// implement me
		System.out.println(name);
		for (String var : args) {
			System.out.println(var);
		}
	}
}