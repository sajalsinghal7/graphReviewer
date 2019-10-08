package graphReviewer;

import java.util.HashMap;
import java.util.Map;

public class VertexList {
	private static Map<Integer, Node> vertexList = new HashMap<Integer, Node>();
	public static void addVertex(Node node) {
		vertexList.put(node.getId(), node);
	}
	public static Node getNodeOfId(Integer nodeId) {
		return vertexList.get(nodeId);
	}
}
