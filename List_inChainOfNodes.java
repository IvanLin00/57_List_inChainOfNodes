/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
     private Node headRef;
     /**
      Construct an empty list
     */
     public List_inChainOfNodes(){
		headRef = new Node(null);
	 }
     /**
      @return the number of elements in this list
     */
     public int size() {
		int i = 0;
		Node n = headRef;
		while (n.getCargoReference()!= null){
			i += 1;
			n = n.getReferenceToNextNode();
		}
		return i;
	 }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
     public String toString() {
		 String s = "[";
		 Node nextNode = headRef;
		 while (nextNode.getCargoReference() != null){
			 s += nextNode.getCargoReference() + ", ";
			 nextNode = nextNode.getReferenceToNextNode();
		 }
		 return s + "]";
     }
    
    
     /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
		 headRef = new Node(val,headRef);
		 return true;
     }
	 
	 public Object set(int index, Object newValue){ //works
		 Node n = headRef;
		 for (int i = 0; i<index; i++){
			 n = n.getReferenceToNextNode();
		 }
		 Object returnValue = n.getCargoReference();
		 n = new Node(newValue, n.getReferenceToNextNode());
		 for(int counter = 0; counter < index; counter++){
			 Node n2 = headRef;
			 for (int i = counter; i<index-1; i++){
				n2 = n2.getReferenceToNextNode();
			 }
			 n = new Node(n2.getCargoReference(),n);
		 }
		 headRef = n;
		 return returnValue;	 
	 }

	 public Object get(int index){ //works
		 Node n = headRef;
		 for (int i = 0; i<index; i++){
			 n = n.getReferenceToNextNode();
		 }
		 return n.getCargoReference();
	 }
	 
	 public Object remove(int index){ //works
		 Node n = headRef;
		 for (int i = 0; i<index;i++){
			 n = n.getReferenceToNextNode();
		 }
		 Object returnValue = n.getCargoReference();
		 n = n.getReferenceToNextNode();
		 for(int counter = 0; counter < index; counter++){
			 Node n2 = headRef;
			 for (int i = counter; i<index-1; i++){
				n2 = n2.getReferenceToNextNode();
			 }
			 n = new Node(n2.getCargoReference(),n);
		 }
		 headRef = n;
		 return returnValue;
	 }
	 
	 public void add(int index, Object val){
		 Node n = headRef;
		 for (int i = 0; i<index; i++){
			 n = n.getReferenceToNextNode();
		 }
		 n = new Node(val, n);
		 for(int counter = 0; counter < index; counter++){
			 Node n2 = headRef;
			 for (int i = counter; i<index-1; i++){
				n2 = n2.getReferenceToNextNode();
			 }
			 n = new Node(n2.getCargoReference(),n);
		 }
		 headRef = n;
	 }
}
