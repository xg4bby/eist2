package de.tum.in.ase.eist;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class LinearSearch implements SearchStrategy {
    public int performSearch(List<Chapter> chapters, String name) {
        return linearSearch(chapters, name);
    }

    public int linearSearch(List<Chapter> chapters, String name) {
        for (Chapter c: chapters) {
            if (Objects.equals(c.getName(), name)) {
                return c.getPageNumber();
            }
        }
        return -1;
    }
}
