package org.example.basicClass.Comparator;

import org.example.basicClass.University;

public class UniversityYearOfFComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return Integer.compare(o2.getYearOfFoundation(), o1.getYearOfFoundation());
    }
}
