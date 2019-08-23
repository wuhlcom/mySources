###eureka服务启动
所有服务都必须注册上来

###srv-hi
srv-hi服务启动两个

http://192.168.10.188:5502

http://192.168.10.188:5503

###Feign

集成Hystrix，HystrixDashboard

此服务负载调用srv-hi

接口

http://192.168.10.188:5504/hi

dashborad断路监控

http://192.168.10.188:5504/actuator/hystix.stream

http://192.168.10.188:5504/hystix

###Turbine服务
在配置文件中添加app-config为feign

###服务全部启动后调用，Feign的接口一次

###dashboard页面，添加聚合监控
   http://192.168.10.188:5504/hystrix
>输入url:

  http://192.168.10.188:5512/turbine.stream
>delay

 2000
>title

 turbine
 
###停止srv-hi 5502
  注意  
1.为避免不必要的干扰，此时eureka不要有其它无关服务
2.eureka服务最好打开自我保护enable-self-preservation

  反复调用feign中的接口
  
  在聚合监控页面可以看到实时的断路曲线变化和统计信息
  
  如：请求成功数据，请求超时数量，超时百分比等