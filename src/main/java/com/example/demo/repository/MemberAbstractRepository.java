package com.example.demo.repository;

import com.example.demo.model.Member;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MemberAbstractRepository implements Irepository{
  protected Map<Integer, Member> memberMap = new HashMap<>();

  @Override
  public void create(Member member){
    memberMap.put(member.getId(), member);
    System.out.println("Member created: "+member);
  }

  @Override
  public Member read(int id){
    Member member = memberMap.get(id);
    if (member != null){
      System.out.println("Member read: "+member);
      return member;
    } else {
      System.out.println("Failed to read member");
      return null;
    }
  }

  @Override
  public void update(int id, Member member) {
    if(memberMap.containsKey(id)){
      memberMap.put(id, member);
      System.out.println("Member updated: "+member);
    } else {
      System.out.println("Failed to update member: member no."+id+" doesn't exist");
    }
  }

  @Override
  public void delete(int id){
    memberMap.remove(id);
    System.out.println("no."+id+" deleted.");
  }
}
