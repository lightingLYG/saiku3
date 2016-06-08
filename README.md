#saiku
1、创建新项目saiku3



2、在创建的项目中，分别创建resource目录：“src/main/saiku-web”，“src/main/saiku-service”，“src/main/saiku-olap-util”，并将saiku-core下的相应代码（java目录下和resources目录下的文件）分别copy到里面，

3、将saiku-webapp\src\main\webapp目录下的所有文件，覆盖到新建项目的webapp目录中
4、将编译过后的zip包中tomcat\webapps\下的ROOT目录中文件全部copy到新建项目的webapp目录中并修改/saiku3/src/main/webapp/js/saiku/Settings.js文件中的TOMCAT_WEBAPP值为“/saiku3”

5、将编译过后的zip包中saiku-server目录下的data和repository文件夹copy到项目的webapp目录中

6、修改saiku-beans.properties文件，修改所有“../../”的地方替换为“../webapps/saiku3/”
7、修改eclipse中tomcat的工作路径：参考如下文章
http://blog.csdn.net/gsying1474/article/details/51597995

8、修改 Database.java中的init方法，注释loadEarthquakes();方法的调用，以保证代码启动（此方法的代码中有部分导致启动错误，此方法为加载demo数据，所以不会影响功能使用）

9.1、整理POM文件中的jar包依赖（比较复杂）
9.2、如果不使用maven项目，也可以将打包好的项目中jar包全部copy到lib项目中


如果处理没有错误的话，就可以启动项目了

by 刘迎光
liuyg@liuyingguang.cn
saiku 研究学习交流群： 495266201
博客saiku专栏：http://blog.csdn.net/gsying1474/article/category/2712301