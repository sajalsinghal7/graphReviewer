package graphReviewer;

public class Node {
	private Integer id;
	private String fileName;
	private NodeType nodeType;
//	public Node(Integer id, String name, NodeType type) {
//		// TODO Auto-generated constructor stub
//		this.id = id;
//		fileName = name;
//		nodeType = type;
//	}
	public String getFileName() {
		return fileName;
	}
	public Node setFileName(String fileName) {
		this.fileName = fileName;
		return this;
	}
	public NodeType getNodeType() {
		return nodeType;
	}
	public Node setNodeType(NodeType nodeType) {
		this.nodeType = nodeType;
		return this;
	}
	public Integer getId() {
		return id;
	}
	public Node setId(Integer id) {
		this.id = id;
		return this;
	}
}