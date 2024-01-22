package org.example.basicClass;

public enum StudyProfile {
    MEDICINE("МЕДИЦИНА"),
    TEACHER("УЧИТЕЛЬ"),
    TRANSLATOR("ПЕРЕВОДЧИК"),
    PROGRAMMER("ПРОГРАММИСТ");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
