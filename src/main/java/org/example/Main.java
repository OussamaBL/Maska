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
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        
        // Retrieve the MemberService bean (Constructor Injection example)
        MemberService memberService = context.getBean(MemberService.class);

        // Display all members
        List<Member> members = memberService.listMembers();
        System.out.println("helo oussama");
        // Output members to the console
        for (Member member : members) {
            System.out.println("Member ID: " + member.getId());
            System.out.println("Membership Number: " + member.getMembership_number());
            System.out.println("First Name: " + member.getFirst_name());
            System.out.println("Last Name: " + member.getLast_name());
            System.out.println("Identification Document: " + member.getIdentification_document());
            System.out.println("Nationality: " + member.getNationality());
            System.out.println("Membership Date: " + member.getMembership_date());
            System.out.println("License Expiration Date: " + member.getLicense_expiration_date());
            System.out.println("------------");
        }
    }
}