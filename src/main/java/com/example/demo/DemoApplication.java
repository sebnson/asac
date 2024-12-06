package com.example.demo;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		MemberRepository repository = new MemberRepository();

		Member member1 = new Member(1, "seb", 12, "sebn1@gmail.com");
		Member member2 = new Member(2, "been", 48, "sebn2@gmail.com");
		Member member3 = new Member(3, "sebeen", 72, "sebn3@gmail.com");
		repository.create(member1);
		repository.create(member2);
		repository.create(member3);
		repository.read();

		repository.delete(3);
		repository.read();

		Member updatedMember = new Member(2, "updatedBeen",48,"update@example.com");
		repository.update(2, updatedMember);
		repository.read();

		repository.read(1);
		repository.read(2);
		repository.read();

	}

}
