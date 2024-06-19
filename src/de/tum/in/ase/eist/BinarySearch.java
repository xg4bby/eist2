package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class BinarySearch {
    public int performSearch(List<Chapter> chapters, String name) {
        return binarySearch(chapters, name);
    }

    public int binarySearch(List<Chapter> chapters, String name) {
        List<Chapter> sortedChapters = chapters.stream().sorted().toList();

        int lowerBound = 0;
        int upperBound = sortedChapters.size() - 1;
        int midPoint = -1;
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
