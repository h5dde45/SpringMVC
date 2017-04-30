package ru.javabegin.training.objects;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

    @Size(min = 6, message = "Имя должно быть больше 6 знаков")
    private String name;

    @Size(min = 6, max = 10,
            message = "Имя должно быть от 5 до 10 знаков")
    private String password;
    private boolean admin;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
