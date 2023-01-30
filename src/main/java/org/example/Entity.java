package org.example;

public class Entity {
    int id;
    String first_name;
    String last_name;
    String phone_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public Entity(int id, String first_name, String last_name, String phone_num) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_num = phone_num;
    }

    public Entity() {
    }
}
