package com.xeonlab.redmine.cli.response;

/**
 * @author Konstantin Simon Maria Moellers
 * @version 2015-01-24
 */
final public class EnumeratedValue {
    private int id;
    private String name;

    public EnumeratedValue(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EnumeratedValue() {
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
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
}
