package com.codemachine.contacts;

public class ContactsView {

    private String name;
    private String number;

    public ContactsView(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
