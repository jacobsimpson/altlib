package altlib.collections;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListTest {

    @Test
    void testIsEmpty() {
        List<Integer> l = new LinkedList<>();
        assertThat(l.isEmpty()).isTrue();
        l.add(1);
        assertThat(l.isEmpty()).isFalse();
    }

    @Test
    void testSmallList() {
        List<String> l = new LinkedList<String>().add("the").add("s", "t", "a", "r");

        assertThat(l.size()).isEqualTo(5);
        assertThat(l.at(0)).isEqualTo("the");
    }

    @Test
    void testAt() {
        List<Integer> l = new LinkedList<Integer>().add(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        assertThat(l.at(2)).isEqualTo(2);
        assertThat(l.at(9)).isEqualTo(9);
    }

    @Test
    void testMap() {
        List<Integer> l = new LinkedList<Integer>().add(0, 1, 2, 3);

        List<String> s = l.map(i -> "" + i);

        assertThat(s.size()).isEqualTo(4);
        assertThat(s.at(0)).isEqualTo("0");
        assertThat(s.at(3)).isEqualTo("3");
    }
}
