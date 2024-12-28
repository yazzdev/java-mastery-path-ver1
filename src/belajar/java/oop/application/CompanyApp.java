package belajar.java.oop.application;

import belajar.java.oop.data.Company;

public class CompanyApp {
  public static void main(String[] args) {

    Company company = new Company();
    company.setName("Google");

    Company.Employee employee = company.new Employee();
    employee.setName("Dyaz Amrullah");

    System.out.println(company.getName());
    System.out.println(employee.getName());

    Company company1 = new Company();
    company1.setName("Amazon");

    Company.Employee employee1 = company1.new Employee();
    employee1.setName("Yusuf Dadan");

    System.out.println(company1.getName());
    System.out.println(employee1.getName());
  }
}
