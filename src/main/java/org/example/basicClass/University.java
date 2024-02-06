package org.example.basicClass;

import org.example.basicClass.enums.StudyProfile;

public class University {
    String id, fullName, shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;

    public University() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    @Override
    public String toString() {
        return "Университет " + id + " с полным наименованием " + fullName + " (краткое наименование " + shortName + "), имеет год основания " +
                yearOfFoundation + " и основной профиль " + mainProfile;
    }
}
