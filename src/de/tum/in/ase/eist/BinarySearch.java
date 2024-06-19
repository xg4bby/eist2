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

        boolean found = false;
        int lowerBound = 0;
        int upperBound = sortedChapters.size();
        int midPoint = -1;


        while (!found) {

            if (upperBound < lowerBound) {
                return -1;
            }

            midPoint = (upperBound - lowerBound) / 2;
            found = Objects.equals(sortedChapters.get(midPoint).getName(), name);

            int result = sortedChapters.get(midPoint).getName().compareTo(name);
            if (result < 0) {
                upperBound = midPoint;
            }
            if (result > 0) {
                lowerBound = midPoint;
            }
        }
        return sortedChapters.get(midPoint).getPageNumber();
    }
}
