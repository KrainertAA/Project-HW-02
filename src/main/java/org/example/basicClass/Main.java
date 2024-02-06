package org.example.basicClass;

import org.apache.commons.collections4.ComparatorUtils;
import org.example.basicClass.Comparator.StudentComparator;
import org.example.basicClass.Comparator.UniversityComparator;
import org.example.basicClass.enums.StudentComparatorType;
import org.example.basicClass.enums.UniversityComparatorType;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<University> universities =
                XLSXFileReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                UtilComparatorType.getUniversityComparator(UniversityComparatorType.YEAR);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                XLSXFileReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                UtilComparatorType.getStudentComparator(StudentComparatorType.AVG_EXAM_SCORE);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }
}