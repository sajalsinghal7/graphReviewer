package graphReviewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList {
	private static Map<Integer, Edge> adjacencyList = new HashMap<Integer, Edge>();
	public static void generateAdjacencyList() {
		
	}
	public static void addEdge(Integer fileIndex, Integer reviewerindex) {
		if(adjacencyList.containsKey(fileIndex) == false) {
			adjacencyList.put(fileIndex, new Edge()
					.setPairNodeId(reviewerindex)
					.setWeight(1)
					.setNextReviewer(null));
			
		} else {
			Edge head = adjacencyList.get(fileIndex);
			addupdateReviewer(head, reviewerindex);
		}
	}
	private static void addupdateReviewer(Edge head, Integer reviewerindex) {
		while(head.getNextReviewer() != null) {
			if(head.getPairNodeId() == reviewerindex) {
				head.setWeight(head.getWeight() + 1);
				break;
			}
			head = head.getNextReviewer();
		}
		if(head.getPairNodeId() != reviewerindex) {
			head.setNextReviewer(new Edge()
					.setPairNodeId(reviewerindex)
					.setWeight(1)
					.setNextReviewer(null));
		}
	}
	public static List<Node> getReviewersForFile(Integer fileIndex) {
		List<Node> reviewerList = new ArrayList<Node>();
		if(adjacencyList.containsKey(fileIndex)) {
			Edge head = adjacencyList.get(fileIndex);
			while(head != null) {
				reviewerList.add(VertexList.getNodeOfId(head.getPairNodeId()));
				head = head.getNextReviewer();
			}
		}
		return reviewerList;
	}
}