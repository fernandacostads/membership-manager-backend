package com.fcs.membershipmanager.service;

import com.fcs.membershipmanager.repo.MemberRepo;
import com.fcs.membershipmanager.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.UUID;
import java.util.List;

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

    public List<Member> findAllMembers() {
        return memberRepo.findAll();
    }

    public Member updateMember(Member member) {
        return memberRepo.save(member);
    }

    public Member findMemberById(Long id) {
        return memberRepo.findMemberById(id).orElseThrow(() -> new UserNotFoundException("User by id" + id + "was not find"));
    }
    public void deleteMember(Long id) {
        memberRepo.deleteMemberById(id);
    }
}
