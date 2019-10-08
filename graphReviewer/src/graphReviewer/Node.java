package graphReviewer;

public class Node {
	private Integer id;
	private String name;
	private NodeType nodeType;
//	public Node(Integer id, String name, NodeType type) {
//		// TODO Auto-generated constructor stub
//		this.id = id;
//		fileName = name;
//		nodeType = type;
//	}
	public String getName() {
		return name;
	}
	public Node setName(String fileName) {
		this.name = fileName;
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
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Node another = (Node) obj;
		return (this.id == another.getId());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.id + "\t" + this.name + "\t" + this.nodeType);
	}
}