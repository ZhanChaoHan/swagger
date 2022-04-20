package com.jachs.springfox.service.impl;

import com.jachs.springfox.domain.SysUser;
import com.jachs.springfox.mapper.SysUserMapper;
import com.jachs.springfox.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanchaohan
 * @since 2022-04-20
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
