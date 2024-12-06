package com.example.demo.model;

public class Member {
  private int id;
  private String name;
  private int age;
  private String email;

  public Member(int id, String name, int age, String email){
    this.id=id;
    this.name=name;
    this.age=age;
    this.email=email;
  }

  public int getId(){
    return id;
  }

  @Override
  public String toString(){
    return "{ id = "+id+"\tname = "+name+"\tage = "+age+"\temail = "+email+" }";
  }
}
