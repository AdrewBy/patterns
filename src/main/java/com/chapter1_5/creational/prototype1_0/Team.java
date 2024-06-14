package com.chapter1_5.creational.prototype1_0;

public class Team implements Cloneable{

    private int id;
    private String name;

    private String owner;

    public Team(int id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public Team clone() {

       Team clone = new Team(id,name,owner);
       return clone;
    }

    @Override
    public String toString() {
        return "Team: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\''
                ;
    }
}
