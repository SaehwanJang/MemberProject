package com.hk.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.member.mapper.MemberMapper;
import com.hk.member.vo.Member;

@Service
public class MemberService {
	
	@Autowired
	MemberMapper memberMapper;
	
	
	public List<Member> memberList() {
		
		return memberMapper.memberList();
	}
	
}
