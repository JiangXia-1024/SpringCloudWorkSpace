# SpringCloud示例
运行springcloud示例需要以下环境：

本地安装nacos，并启动nacos（可以使用standalone+数据本地化的最简单模式启动）

nacos地址：https://github.com/alibaba/nacos/releases/tag/1.1.0

下载解压后bin目录里面startup.cmd，双击启动了。

访问地址：http://localhost:8848/nacos/index.html

用户名密码：[nacos](https://so.csdn.net/so/search?q=nacos&spm=1001.2101.3001.7020)/nacos

添加一个dev命名空间，id指定为e4d6fe3f-aab8-430d-a782-0e8a3af710bc

手动添加nacos-consumer.yaml、nacos-service1.yaml、nacos-service2.yaml三个配置，配置的内容随便，只要满足yaml的格式即可，如

key1: abc

key2: defg

![img](file:///C:/Users/Administrator/AppData/Roaming/JisuOffice/Favorite/poclip1/03/image0.png)

![img](file:///C:/Users/Administrator/AppData/Roaming/JisuOffice/Favorite/poclip1/03/image1.png)

本地安装nacos，并启动nacos

分别启动nacos-consumer、nacos-service1、nacos-service2三个模块，启动后10秒内在nacos管理页面会看到

![img](file:///C:/Users/Administrator/AppData/Roaming/JisuOffice/Favorite/poclip1/03/image2.png)

 

**验证**：

配置中心正常启动并成功读取

访问：http://127.0.0.1:1800/config/get?key=key1，显示为abc

http://127.0.0.1:1800/config/get?key=key2，显示defg

注册中心正常启动并成功调用

http://127.0.0.1:1800/feign/service1?orderid=123，显示service1_123

http://127.0.0.1:1800/feign/service2?orderid=123，显示service2_123

http://127.0.0.1:1800/feign/both?orderid=123，显示

service1_123
service2_123

 

http://127.0.0.1:1800/ribbon/service1?orderid=123，显示service1_123

http://127.0.0.1:1800/ribbon/service2?orderid=123，显示service2_123

http://127.0.0.1:1800/ribbon/both?orderid=123，显示

service1_123
service2_123

