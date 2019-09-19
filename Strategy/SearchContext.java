public class SearchContext {
	private SearchAlgorithm _algorithm;

	//Sets a default search method
	public SearchContext() {
		_algorithm = new BreadthFirstSearch();
	}

	public void setAlgorithm(SearchAlgorithm algorithm) {
		_algorithm = algorithm;
	}

	public void solve() {
		_algorithm.solve();
	}
}