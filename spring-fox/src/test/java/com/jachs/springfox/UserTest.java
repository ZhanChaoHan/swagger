package com.jachs.springfox;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jachs.springfox.domain.SysUser;
import com.jachs.springfox.service.SysUserService;

/**
 * 
 * @author zhanchaohan
 *
 */
@SpringBootTest(classes =SpringFoxApplication.class )
public class UserTest {
	@Autowired
	private SysUserService sysUserService;
	
	@Test
	public void addTest() {
		SysUser sys=new SysUser();
		
		sys.setUserid(1);
		sys.setUsername("zsnc");
		sys.setUserpwd("pwd1223");
		sys.setUserage(12);
		sysUserService.save(sys);
	}
}
