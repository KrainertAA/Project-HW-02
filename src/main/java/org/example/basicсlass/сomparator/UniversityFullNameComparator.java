package org.example.basicсlass.сomparator;

import org.apache.commons.lang3.StringUtils;
import org.example.basicсlass.University;

public class UniversityFullNameComparator implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getFullName(), o2.getFullName());
    }
}
