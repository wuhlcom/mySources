package com.my;

import com.my.sample1.Register;
import com.my.sample1.ServiceInterface;
import com.my.sample1.ServiceType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Resource
	Register register;

	@Test
	public void testServiceSample1() {
		ServiceInterface service = register.getServiceImpl("A");
		service.method();
		ServiceInterface service2 = register.getServiceImpl("B");
		service2.method();
	}

	@Test
	public void testServiceSample12() {
		ServiceInterface service = register.getServiceImpl(ServiceType.valueOf("A"));
		service.method();
		ServiceInterface service2 = register.getServiceImpl(ServiceType.valueOf("B"));
		service2.method();
	}

	@Test
	public void testServiceSample13() {
		ServiceInterface service = register.getServiceImpl(ServiceType.A);
		service.method();
		ServiceInterface service2 = register.getServiceImpl(ServiceType.B);
		service2.method();
	}


	// @Test
	// public void testGetTrafficSample2() {
	// 	TrafficMode mode = TrafficModeFactory.getTrafficMode(TrafficCode.BUS);
	// 	Assert.assertEquals(mode.getFee().intValue(), 10000);
    //
	// 	mode = TrafficModeFactory.getTrafficMode(TrafficCode.TRAIN);
	// 	Assert.assertEquals(mode.getFee().intValue(), 9000);
	// }

	// @Test
	// public void testGetTrafficSample3() {
	// 	TrafficMode mode = com.my.sample3.TrafficModeFactory.getTrafficMode(TrafficCode.BUS);
	// 	Assert.assertEquals(mode.getFee().intValue(), 10000);
    //
	// 	mode = com.my.sample3.TrafficModeFactory.getTrafficMode(TrafficCode.TRAIN);
	// 	Assert.assertEquals(mode.getFee().intValue(), 9000);
	// }

}
