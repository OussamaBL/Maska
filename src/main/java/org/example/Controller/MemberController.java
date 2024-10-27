package org.example.Controller;

import org.example.Model.Member;
import org.example.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService membreService;

    @GetMapping("/save")
    public String index(Model model) {
        model.addAttribute("member", new Member());
        return "addMembre";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("member") Member membre) {
        membreService.add(membre);
        return "redirect:/";
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Member> list = membreService.listMembers();
        model.addAttribute("list", list);
        return "listMembre";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        Member member=new Member();
        member.setId(id);
        membreService.deleteMember(member);
        return "redirect:/";
    }

}
