/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;
    private int numberOfElements;
    private List listOfNodes;
    /**
      Construct an empty list
     */
    public List_inChainOfNodes(){
	headReference = new Node

    /**
      @return the number of elements in this list
     */
    public int size() {
	return numberOfElements;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    // public String toString() {
    // }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        return true;
     }
}
