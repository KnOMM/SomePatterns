package com.company;

public final class Person {
    private int id;
    private String name;

    private Person() {}

    public static class Builder{
        private Person personToBuild;

        Builder(){
            personToBuild = new Person();
        }

        Person build(){
            Person builtPerson = personToBuild;
            personToBuild = new Person();
            return builtPerson;
        }

        public Builder setId(int id){
            this.personToBuild.id = id;
            return this;
        }

        public Builder setName(String name){
            this.personToBuild.name = name;
            return this;
        }
    }

    public static void main(String[] args) {
        Person person = new Person.Builder().setId(1).setName("name").build();
        Person person2 = new Person.Builder().setId(2).setName("name2").build();
        System.out.println(person.id);
        System.out.println(person2.id);
        System.out.println(person.name);
        System.out.println(person2.name);
    }
}
