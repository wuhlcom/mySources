package com.whl.generator;

import com.whl.generator.bean.crm.FyCurrencyLog;
import com.whl.generator.service.crm.FyCurrencyLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusGenratorApplicationTests {

    @Autowired
    private FyCurrencyLogService service;

    @Test
    public void contextLoads() {
        List<FyCurrencyLog> list = service.list();
        for (FyCurrencyLog fyCurrencyLog : list) {
            System.out.println(fyCurrencyLog);
        }
    }

}
