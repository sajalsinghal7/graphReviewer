package graphReviewer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VertexListTest {

	@Test
	void testAddVertexAddNode() {
		Node obj = new Node().setId(1).setName("SS").setNodeType(NodeType.REVIEWER);
		VertexList.addVertex(obj);
		assertTrue(VertexList.getNodeOfId(1).getNodeType() == NodeType.REVIEWER);
	}
}
