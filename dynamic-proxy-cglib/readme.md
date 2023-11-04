对于高版本的JDK，如果使用CGLIB，需要在启动项中添加两个启动参数：

![img.png](img.png)

--add-opens java.base/java.lang=ALL-UNNAMED

--add-opens java.base/sun.net.util=ALL-UNNAMED