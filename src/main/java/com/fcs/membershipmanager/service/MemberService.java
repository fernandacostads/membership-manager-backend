package com.fcs.membershipmanager.service;

import com.fcs.membershipmanager.repo.MemberRepo;
import com.fcs.membershipmanager.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MemberService {
    private final MemberRepo memberRepo;

    @Autowired
    public MemberService(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;
    }

    public Member addMember( Member member) {
        member.setMemberCode(UUID.randomUUID().toString());
        return memberRepo.save(member);
    }
}
