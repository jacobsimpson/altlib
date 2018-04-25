package altlib.collections;

import java.util.function.Function;

public interface ReadableList<T> {
    /**
     * Returns the requested indexed element from the list.
     *
     * @param i requested element
     * @return requested element
     * @throws IndexOutOfBoundsException - if the requested element is out of range (i &lt; 0 || i &gt;= size())
     */
    T at(int i);

    /**
     * Returns the number of elements in the list.
     *
     * @return number of elements in the list.
     */
    int size();

    /**
     * Checks if there are no elements in the current list.
     *
     * @return returns the result of size() == 0
     */
    boolean isEmpty();

    /**
     * Executes the specified function for each element of the current list and
     * generates a new list, with the same type as the current list, containing
     * the results of the execution of the function.
     *
     * @param function mapping function to execute for each element of the list
     * @param <R> type of the result of the mapping function
     * @return a new list of the same type as the current list
     */
    <R> List<R> map(Function<T, R> function);
}

