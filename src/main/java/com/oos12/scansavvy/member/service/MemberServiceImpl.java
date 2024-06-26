package com.oos12.scansavvy.member.service;

import com.oos12.scansavvy.member.model.Member;
import com.oos12.scansavvy.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<Member> findAll(){
        return memberRepository.findAll();
    }
    @Override
    public Member findByEmail(String email){
        return memberRepository.findByEmail(email);
    }
    @Override
    public Member findByPhone(String phone){
        return memberRepository.findByPhone(phone);
    }
    @Override
    public List<Member> findAllByOrderByNameDesc(){
        return memberRepository.findAllByOrderByNameDesc();
    }
    @Override
    public Member saveOrUpdateMember(Member member){
        return memberRepository.save(member);
    }
    @Override
    public void deleteMemberById(String id){
        memberRepository.deleteById(id);
    }

}
