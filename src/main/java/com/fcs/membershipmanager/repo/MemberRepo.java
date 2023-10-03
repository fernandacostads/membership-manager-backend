package com.fcs.membershipmanager.repo;

import com.fcs.membershipmanager.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member, Long> {

}
