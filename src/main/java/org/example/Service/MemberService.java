package org.example.Service;

import org.example.Model.Member;
import org.example.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    // Injection de memberRepository par constructeur
    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member add(Member member){
        return memberRepository.save(member);
    }
    public List<Member> listMembers(){
        return memberRepository.findAll();
    }
    public Optional<Member> getMembreById(long id){
        return memberRepository.findById(id);
    }
    public void updateMember(Member member){
        memberRepository.save(member);
    }
    public void deleteMember(Member member){
        memberRepository.delete(member);
    }

    public Member getMemberByFirst_name(String first_name){
        return memberRepository.getMemberByFirst_name(first_name);
    }

}
