package altlib.collections;

import java.util.function.Function;

public interface List<T> {
    T at(int i);
    int size();
    boolean isEmpty();
    List<T> add(T... items);
    <R> List<R> map(Function<T, R> function);
}
