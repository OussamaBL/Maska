package org.example.Repository;

import org.example.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Member getMemberByFirst_name(String first_name);
}
