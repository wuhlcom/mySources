1. gateway����֧��java�ͷ�java�ķ���
2. web�޸�·����Ϣ��ַ:
- 192.168.10.232:11007/index.html
- �˻������������:
- zhilutec/zhilu@2016
- zhilutec/123456  
- Ҫ�޸�������Ե��ýӿ����޸��˻�����
4. ����Ŀǰֻʹ����Path���͵�·�ɶ��ԣ�·�ɹ���δʹ��
5. ��ʵ���ǿ��Ը�����Ҫ����֧��10��·�ɶ��ԣ���ָ·��ƥ����жϹ��򣩺�20��·�ɹ��ˣ�·�ɵ���������д���ض����ض��ֶ��޸�ɾ���ȹ��ܣ���
6. ·�ɶ��Ժ�·�ɹ��˿����໥���,���·�ɹ�������Ҳ�������ʹ��
7. Ҫ֧���������͵�·�ɶ��Ժ�·�ɹ�����Ҫ�Դ�������Ӧ������
8. ·��ȫ����redis�б���
9. ע��
 - spring boot 2.0��redis��������spring 1.5��Щ��ͬ
 - Ŀǰ����ֻ�����������İ汾����ʹ��

spring boot ʹ��2.0.3.RELEASE,spring cloud  Finchley.RELEASE
```
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Finchley.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <!--����spring boot����-->
            <dependency>
                <!-- Import dependency management from Spring Boot -->
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>2.0.3.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```
�ֿ�д
```
 <parent>
        <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-parent</artifactId>
         <version>2.0.3.RELEASE</version>
         <relativePath/> <!-- lookup parent from repository -->
 </parent>
```
```
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Finchley.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>        
</dependencyManagement>
```
       
       


