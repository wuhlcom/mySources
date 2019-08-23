package com.whl.generator.service.impl;

import com.whl.generator.entity.FirePerson;
import com.whl.generator.dao.FirePersonMapper;
import com.whl.generator.service.FirePersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 联网单位人员和监控中心人员 服务实现类
 * </p>
 *
 * @author whl
 * @since 2019-04-11
 */
@Service
public class FirePersonServiceImpl extends ServiceImpl<FirePersonMapper, FirePerson> implements FirePersonService {

}
