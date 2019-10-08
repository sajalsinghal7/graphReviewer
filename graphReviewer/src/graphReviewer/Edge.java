package graphReviewer;

public class Edge {
	private Integer pairNodeIndex;
	private Integer weight;
	private Edge nextReviewer;
//	public Edge(Integer index, Integer weight) {
//		// TODO Auto-generated constructor stub
//		pairNodeIndex = index;
//		this.weight = weight;
//	}
	public Integer getPairNodeIndex() {
		return pairNodeIndex;
	}
	public Integer getWeight() {
		return weight;
	}
	public Edge getNextReviewer() {
		return nextReviewer;
	}
	public Edge setNextReviewer(Edge nextReviewer) {
		this.nextReviewer = nextReviewer;
		return this;
	}
	public Edge setWeight(Integer weight) {
		this.weight = weight;
		return this;
	}
	public Edge setPairNodeIndex(Integer pairNodeIndex) {
		this.pairNodeIndex = pairNodeIndex;
		return this;
	}
	
}
