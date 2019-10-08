package graphReviewer;

import java.util.HashMap;
import java.util.Map;

public class AdjacencyList {
	private static Map<Integer, Edge> adjacencyList = new HashMap<Integer, Edge>();
	public void generateAdjacencyList() {
		
	}
	public void addEdge(Integer fileIndex, Integer reviewerindex) {
		if(adjacencyList.containsKey(fileIndex) == false) {
			adjacencyList.put(fileIndex, new Edge()
					.setPairNodeIndex(reviewerindex)
					.setWeight(1)
					.setNextReviewer(null));
			
		} else {
			Edge head = adjacencyList.get(fileIndex);
			this.addupdateReviewer(head, reviewerindex);
		}
	}
	public void addupdateReviewer(Edge head, Integer reviewerindex) {
		while(head.getNextReviewer() != null) {
			if(head.getPairNodeIndex() == reviewerindex) {
				head.setWeight(head.getWeight() + 1);
				break;
			}
			head = head.getNextReviewer();
		}
		if(head.getPairNodeIndex() != reviewerindex) {
			head.setNextReviewer(new Edge()
					.setPairNodeIndex(reviewerindex)
					.setWeight(1)
					.setNextReviewer(null));
		}
	}
}