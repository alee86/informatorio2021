package com.alejandroeguiazabal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {
  private String name;
  private String lastName;
  private String birthDate;
  private String salary;

  public Empleado(String name, String lastName, String birthDate, String salary) {
    this.name = name;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.salary = salary;

  }

  DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

  public void printName() {
    System.out.println(this.name);
  }
  public void printLasNeme() {
    System.out.println(this.lastName);
  }
  public void printBirthDate() {
    System.out.println(this.birthDate);
  }
  public void printSalary() {
    System.out.println(this.salary);
  }

  public String getName(){
    return this.name;
  }

  public String getSalary(){
    return this.salary;
  }

  public LocalDate getBirthDate(){
    return LocalDate.parse(this.birthDate, dateFormat);
  }
}
