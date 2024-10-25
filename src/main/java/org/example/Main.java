package org.example;

import org.example.Model.Member;
import org.example.Service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MemberService memberService = context.getBean(MemberService.class);
        Member member = new Member();
        member.setNationality("arabic");
        memberService.add(member);
        System.out.println("heelo oussama");

      /*  Member member = new Member();
        member.setFirst_name("ziko");
        member.setLast_name("sasasa");
        member.setNationality("marocain");

        memberService.add(member);
        System.out.println("member saved: " + member);


        System.out.println("All users:");
        memberService.listMembers().forEach(System.out::println);*/

    }
}