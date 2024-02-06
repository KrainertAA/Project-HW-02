package org.example.basicClass.Comparator;

import org.apache.commons.lang3.StringUtils;
import org.example.basicClass.University;

public class UniversityMainProfileComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        if (null == o1.getMainProfile()) {
            return 1;
        } else if (null == o2.getMainProfile()) {
            return -1;
        }
        return StringUtils.compare(o1.getMainProfile().name(), o2.getMainProfile().name());
    }

}