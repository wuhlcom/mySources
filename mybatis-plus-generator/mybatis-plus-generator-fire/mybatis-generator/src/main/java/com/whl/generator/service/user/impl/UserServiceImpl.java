package com.whl.generator.service.user.impl;

import com.whl.generator.entity.user.User;
import com.whl.generator.dao.user.UserMapper;
import com.whl.generator.service.user.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2019-04-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
