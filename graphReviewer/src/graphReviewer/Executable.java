package graphReviewer;

import java.util.ArrayList;
import java.util.List;

public class Executable {
	public static void main(String[] args) {
		/*
		 * The following data represent Vertex Table
		 * 
		 * Vertex
		 * -----
		 * Id
		 * Name
		 * Type
		 * */
		List<Node> vertexData = new ArrayList<Node>();
		vertexData.add(new Node().setId(1).setName("RB.vue").setNodeType(NodeType.FILE));
		vertexData.add(new Node().setId(2).setName("SEList.vue").setNodeType(NodeType.FILE));
		vertexData.add(new Node().setId(3).setName("IndView.vue").setNodeType(NodeType.FILE));
		vertexData.add(new Node().setId(4).setName("UP.vue").setNodeType(NodeType.FILE));
		vertexData.add(new Node().setId(5).setName("RM").setNodeType(NodeType.REVIEWER));
		vertexData.add(new Node().setId(6).setName("AS").setNodeType(NodeType.REVIEWER));
		vertexData.add(new Node().setId(7).setName("JP").setNodeType(NodeType.REVIEWER));
		
		
		for(Node node : vertexData) {
			VertexList.addVertex(node);
		}
		
		/*
		 * The following data represent Edge Table
		 * 
		 * Edge
		 * ----
		 * StartVertexId
		 * EndVertexId
		 * Weight
		 * */
		AdjacencyList.addEdge(1, 5);
		AdjacencyList.addEdge(1, 6);
		AdjacencyList.addEdge(1, 7);
		AdjacencyList.addEdge(2, 5);
		AdjacencyList.addEdge(3, 7);
		
		
		List<Node> suggestedReviewerList = AdjacencyList.getReviewersForFile(2);
		for(Node reviewer : suggestedReviewerList) {
			System.out.println(reviewer.toString());
		}
	}
}
