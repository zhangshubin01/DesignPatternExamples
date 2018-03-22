package com.padtast.designpatternexamples.prototype_case;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by zhangshubin on 2018/3/22.
 */
public class PersonTest {
  @Test
  public void test1() throws Exception {
      Person p=new Person();
      p.setAge(18);
      p.setName("张三");
      p.setHeight(178);
      p.setWeight(65);
      ArrayList<String> hobbies=new ArrayList<String>();
      hobbies.add("篮球");
      hobbies.add("编程");
      hobbies.add("长跑");
      p.setHobbies(hobbies);
      System.out.println(p);

      Person p1= (Person) p.clone();
      System.out.println(p1);

      p1.setName("李四");
      p1.getHobbies().add("游泳");
      System.out.println(p);
      System.out.println(p1);
  }
}