package com.alejandroeguiazabal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class Employee {
//GABRIELA DE LUJAN;DIAZ;12/02/1986;25000

  String name;
  String lastName;
  LocalDate birthDate;
  String salary;

  public Employee (String name, String lastName, String birthDate, String salary) {
    this.name = name;
    this.lastName = lastName;
    this.birthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    this.salary = salary;
  }
  public String getName(String name) {
    return name;
  }

}
