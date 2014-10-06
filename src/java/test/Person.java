/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Houssem
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
class Person {
//    "firstName":"John","lastName":"Doe","age":50,"eyeColor":"blue"}

    @XmlElement(name = "firstName")
    String firstName;
    @XmlElement(name = "lastName")

    String lastName;
    @XmlElement(name = "age")
    int age;
    @XmlElement(name = "eyeColor")
    String eyeColor;

    public Person() {
    }

    public Person(String firstName, String lastName, String eyeColor, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eyeColor = eyeColor;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", eyeColor=" + eyeColor + ", age=" + age + '}';
    }

}
