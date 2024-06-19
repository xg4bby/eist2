package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class BinarySearch implements SearchStrategy {
    public int performSearch(List<Chapter> chapters, String name) {
        return binarySearch(chapters, name);
    }

    public int binarySearch(List<Chapter> chapters, String name) {

        int lowerBound = 0;
        int upperBound = sortedChapters.size() - 1;
        int midPoint;
        while (lowerBound <= upperBound) {

            midPoint = lowerBound + (upperBound - lowerBound) / 2;
            int result = sortedChapters.get(midPoint).getName().compareTo(name);

            if (result == 0) {
                return sortedChapters.get(midPoint).getPageNumber();
            }
            if (result < 0) {
                lowerBound = midPoint + 1;
            }
            if (result > 0) {
                upperBound = midPoint - 1;
            }
        }
        return -1;
    }
}
