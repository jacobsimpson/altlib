package altlib.collections;

import java.util.function.Function;

public interface ReadableList<T> {
    T at(int i);
    int size();
    boolean isEmpty();
    <R> List<R> map(Function<T, R> function);
}

