package com.driver;

import java.sql.SQLOutput;

public class Main {
  public static void main(String[] args){
      //java: name has private access in com.driver.RWOnly
      RWOnly obj = new RWOnly();
      obj.setName("Saubhagya");
      System.out.println(obj.getName());
  }
}