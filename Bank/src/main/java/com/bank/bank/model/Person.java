package com.bank.bank.model;
import jakarta.persistence.*;
import org.aspectj.apache.bcel.classfile.Module;
import com.fasterxml.jackson.annotation.JsonProperty;






@MappedSuperclass
public abstract  class Person {
    private String personName;
    private  int age;
    private String address;




    protected Person(@JsonProperty("firstname") String firstname,@JsonProperty("lastname") String lastname, int age, String address) {
        this.personName = firstname+" "+lastname;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public String getPersonName() {
        return personName;
    }
public int getAge() {
        return age;
}
    public String getAddress() {
        return address;
    }

protected void setAddress(String address) {
         this.address=address;
}

    protected void setAge(int age) {
        this.age = age;
    }
    protected void setPersonName(String firstname,String lastname) {
        this.personName = firstname+" "+lastname;
    }


}
