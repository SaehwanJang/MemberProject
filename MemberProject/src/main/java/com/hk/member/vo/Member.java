package com.hk.member.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Member {

	int mno;
	String email;
	String pwd;
	String mname;
	Date cre_date;
	Date mod_date;

	
	// 3가지를 기본 생성 해야함.
	// 1. Getter 값을 넣고 
	// 2. Setter 빼고 할때 쓰고
	// 3. toString 전체값을 한번에 확인할 때 쓰고
	
	
}
