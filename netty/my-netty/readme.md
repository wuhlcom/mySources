协议分为header和body两部分，都是用网络字节序（BIG ENDIAN）  
header  
{ magic 32bit;  //校验用固定值0x0CAFFEE0  
version 8bit;  //版本号  
type 8bit;     //类型，请求或者响应  
seq 32bit;     //序号标记一对请求响应  
length 32bit;  //body长度 }  
body{}
