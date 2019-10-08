package graphReviewer;

import java.util.ArrayList;
import java.util.List;

public class VertexList {
	List<Node> vertexList = new ArrayList<Node>();
	public void addVertex(Node node) {
		vertexList.add(node);
	}
	public Node getNodeAtIndex(Integer index) {
		return vertexList.get(index);
	}
}
