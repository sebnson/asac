package com.example.demo.repository;
import com.example.demo.model.Member;
import java.util.List;

public interface Irepository {
  void create(Member member);
  Member read(int id);
  void update(int id, Member member);
  void delete(int id);
  void read();
}
