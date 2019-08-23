package com.whl.generator.service.crm.impl;

import com.whl.generator.bean.crm.FyCurrencyLog;
import com.whl.generator.dao.crm.FyCurrencyLogMapper;
import com.whl.generator.service.crm.FyCurrencyLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2018-09-29
 */
@Service
public class FyCurrencyLogServiceImpl extends ServiceImpl<FyCurrencyLogMapper, FyCurrencyLog> implements FyCurrencyLogService {

    @Autowired
    private FyCurrencyLogMapper mapper;
    @Override
    public List<FyCurrencyLog> list() {
        return mapper.selectList(null);
    }
}
