package com.hk.member.mapper;

import java.util.List;

import com.hk.member.vo.Member;

public interface MemberMapper {

	
//	 CRUD 5구현 (Create Read or retrieve Update Delete / 5가지)
//	 1. 전체리스트
	// @Select("select * from members") 이렇게도 사용함.
	public List<Member> memberList();
//	 2. 한개만 보기
//	 3. 한개만 Insert 하기
//	 4. 수정
//	 5. 삭제
}
