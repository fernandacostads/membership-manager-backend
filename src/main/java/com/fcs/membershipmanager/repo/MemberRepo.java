package com.fcs.membershipmanager.repo;

import com.fcs.membershipmanager.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepo extends JpaRepository<Member, Long> {

    void deleteMemberById(Long id);

    Optional findMemberById(Long id);
}
