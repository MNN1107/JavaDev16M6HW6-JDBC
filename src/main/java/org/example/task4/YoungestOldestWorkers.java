package org.example.task4;

import java.time.LocalDate;

public class YoungestOldestWorkers {
    private String type;
    private String name;
    private String birthday;

    public YoungestOldestWorkers(String type, String name, LocalDate birthday) {
        this.type = type;
        this.name = name;
        this.birthday = String.valueOf(birthday);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "YoungestOldestWorkers{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

}
