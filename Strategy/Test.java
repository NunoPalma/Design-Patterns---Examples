public class Test {

	public static void main(String args[]) {
		SearchContext problem = new SearchContext();

		problem.setAlgorithm(new DepthFirstSearch());
		problem.solve();

		problem.setAlgorithm(new BreadthFirstSearch());
		problem.solve();
	}
}