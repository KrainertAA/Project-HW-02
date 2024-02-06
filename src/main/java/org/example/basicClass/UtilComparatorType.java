package org.example.basicClass;

import org.example.basicClass.Comparator.*;
import org.example.basicClass.enums.StudentComparatorType;
import org.example.basicClass.enums.UniversityComparatorType;

public class UtilComparatorType {

    public UtilComparatorType() {
    }

    public static StudentComparator getStudentComparator(StudentComparatorType studentComparatorType) {

        switch (studentComparatorType) {

            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            case FULL_NAME:
                return new StudentFullNameComparator();
            case COURSE:
                return new StudentCourseNumberComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorType universityComparatorType) {

        switch (universityComparatorType) {

            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case PROFILE:
                return new UniversityMainProfileComparator();
            case YEAR:
                return new UniversityYearOfFComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}
