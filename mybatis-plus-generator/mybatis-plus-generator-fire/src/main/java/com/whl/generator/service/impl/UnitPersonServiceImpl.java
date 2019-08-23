package com.whl.generator.service.impl;

import com.whl.generator.entity.UnitPerson;
import com.whl.generator.dao.UnitPersonMapper;
import com.whl.generator.service.UnitPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 联网单位与人员关系表 服务实现类
 * </p>
 *
 * @author whl
 * @since 2019-04-13
 */
@Service
public class UnitPersonServiceImpl extends ServiceImpl<UnitPersonMapper, UnitPerson> implements UnitPersonService {

}
