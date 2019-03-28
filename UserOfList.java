/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ){
			 list.addAsHead( elem);
             System.out.println( "number of elements: " + list.size() );
		}
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
		
		//tests get
		System.out.println("expected element: " + "S" + " returned element: " + list.get(0));
		System.out.println("expected element: " + "t" + " returned element: " + list.get(1));
		System.out.println("expected element: " + "u" + " returned element: " + list.get(2));
		System.out.println("expected element: " + "y" + " returned element: " + list.get(3));
		
		//tests set
		System.out.println("expected element: " + "y" + " returned element: " + list.set(3, "u"));
		System.out.println("status of list: "+ list.toString());
		list.set(3,"y");
		System.out.println("expected element: " + "u" + " returned element: " + list.set(2, "a"));
		System.out.println("status of list: "+ list.toString());
		list.set(2,"u");
		System.out.println("expected element: " + "t" + " returned element: " + list.set(1, "a"));
		System.out.println("status of list: "+ list.toString());
		list.set(1,"t");
		System.out.println("expected element: " + "S" + " returned element: " + list.set(0, "A"));
		System.out.println("status of list: "+ list.toString());
		list.set(0,"S");
		
		//tests remove
		System.out.println("removed element: " + list.remove(2));
		System.out.println("current list: " + list.toString());
		
		//tests add
		list.add(1, "a");
		System.out.println("current list: " + list.toString());
    }
}
