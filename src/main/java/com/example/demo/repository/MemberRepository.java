package com.example.demo.repository;
import com.example.demo.model.Member;

import java.util.ArrayList;
import java.util.List;


public class MemberRepository extends MemberAbstractRepository {
  @Override
  public void read(){
    if(memberMap.isEmpty()) {
      System.out.println("No members found.");
    } else {
      System.out.println("Member list: ");
      for(Member member: memberMap.values()){
        System.out.println(member);
      }
      System.out.println("\n");
    }
  }
}
