package com.company.oop.legasy;

class Employe extends Person{
    private String company;
    public Employe(String name, String company) {
        super(name);
        this.company = company;
    }
    public void work(){
        System.out.printf("%s works in %s", getName(), company);
    }
}
