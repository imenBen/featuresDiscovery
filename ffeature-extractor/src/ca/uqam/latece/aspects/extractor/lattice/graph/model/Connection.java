package ca.uqam.latece.aspects.extractor.lattice.graph.model;
/*
 * a graph connection 
 *  @author Imen
 */
public class Connection {
	
	private Node parent;
	private Node child;
	public Connection(Node parent, Node child) {
		super();
		this.parent = parent;
		this.child = child;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public Node getChild() {
		return child;
	}
	public void setChild(Node child) {
		this.child = child;
	}

}
