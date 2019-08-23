##相关服务
eureka服务

hystrixdashboard服务

http://192.168.10.188:5510/hi

lucy-hystrixdashboard服务

http://192.168.10.188:5511/hi

断路监控服务
http://192.168.10.188:5512

###所有相关服务启动后要调用接口才会有监控信息

###dashborad断路监控
http://192.168.10.188:5512/actuator/hystix.stream

###dashboard页面，添加聚合监控
   http://192.168.10.188:5510/hystrix
>输入url:

  http://192.168.10.188:5512/turbine.stream
>delay

 2000
>title

 turbine