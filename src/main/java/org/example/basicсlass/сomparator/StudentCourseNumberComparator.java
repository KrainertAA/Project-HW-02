package org.example.basicсlass.сomparator;

import org.example.basicсlass.Student;

public class StudentCourseNumberComparator implements StudentComparator{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getCurrentCourseNumber(), o2.getCurrentCourseNumber());
    }
}
