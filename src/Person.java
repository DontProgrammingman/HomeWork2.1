public class Person {
    private String name;
    private String surName;

    public Person(String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "name " + name + " surName " + surName;
    }
}
