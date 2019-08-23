package com.sp.client.protocol.event.monitor;
//事件对象
class Even{
    private Person person;

    public Even(Person person) {
        super();
        this.person = person;
    }

    public Even() {
        super();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}