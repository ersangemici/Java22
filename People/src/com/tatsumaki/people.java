package com.tatsumaki;

import java.time.LocalDate;

public class people {
    private final String name;
    private final String surname;
    private final short yearOfBirth;
    private final short ID;

    public people(String name, String surname, short yearOfBirth, short ID) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.ID = ID;
    }

    public byte age() {
        return (byte) (LocalDate.now().getYear() - yearOfBirth);
    }

    public String printAll() {
        return name + " " + surname + " " + age() + " " + ID;
    }
}
