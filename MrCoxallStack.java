/*
* The "MrCoxallStack" class
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-22
*/

import java.util.ArrayList;

public class MrCoxallStack {
    /**
    * This is the stack's array.
    */
    private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    /**
    * The Push() function adds integers to the stack.
    * @param pushNumber integer to be added to the stack
    */
    public void push(final int pushNumber) {
        stackAsArray.add(pushNumber);
    }

    /**
    * The Pop() function removes integers from the stack.
    */
    public void pop() {
        stackAsArray.remove(stackAsArray.size() - 1);
    }

    /**
    * The ShowStack() function shows the user the array.
    */
    public void showStack() {
        System.out.println("All integers in array\n****");
        for (int i : stackAsArray) {
            System.out.println(i);
        }
        System.out.println("****");
    }
}
