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
}
