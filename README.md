# saiku UserInH2
基于siaku分支release-3.8整理：https://github.com/OSBI/saiku/tree/release-3.8


## 整理步骤
### 总览
> saiku的社区版本二次开发一直以来都是比较费劲的，最近saiku社区版在新版本中，引入了license的机制，于是我选了个3.8稳定版本（release-3.8），且不需要license的版本作为基础，将代码合并在一个项目中，以简化二次开发和源码研究。

#### 完成以下步骤后的结果是：
作为一个普通maven项目，可以使用eclipse部署在tomcat中，debug等各种玩耍

### 操作步奏
1. 创建新项目saiku3![image](http://firewarm.coding.me/images/saiku/2dDev1.png)

2. 在创建的项目中，分别创建resource目录：“src/main/saiku-web”，“src/main/saiku-service”，“src/main/saiku-olap-util”，并将saiku-core下的相应代码（java目录下和resources目录下的文件）分别copy到里面，

3. 将saiku-webapp\src\main\webapp目录下的所有文件，覆盖到新建项目的webapp目录中

4. 将编译过后的zip包中tomcat\webapps\下的ROOT目录中文件全部copy到新建项目的webapp目录中并修改/saiku3/src/main/webapp/js/saiku/Settings.js文件中的TOMCAT_WEBAPP值为“/saiku3”

5. 将编译过后的zip包中saiku-server目录下的data和repository文件夹copy到项目的webapp目录中

6. 修改saiku-beans.properties文件，修改所有“../../”的地方替换为“../webapps/saiku3/”;修改saiku-beans.properties文件，修改pluginpath为“../webapps/saiku3/js/saiku/plugins/”（20160614修改）

7. 修改eclipse中tomcat的工作路径：参考如下文章
http://blog.csdn.net/gsying1474/article/details/51597995

8. 修改 Database.java中的init方法，注释loadEarthquakes();方法的调用，以保证代码启动（此方法的代码中有部分导致启动错误，此方法为加载demo数据，所以不会影响功能使用）

9. 整理POM文件中的jar包依赖（比较复杂）

10. 如果不使用maven项目，也可以将打包好的项目中jar包全部copy到lib项目中
![image](http://firewarm.coding.me/images/saiku/2dDev1.png)
11. 添加配置文件目录：将 saiku-webapp中的如下目录文件（saiku-webapp\src\main\webapp\WEB-INF\classes），全部放到资源目录resources下（如果没有，则创建）==（20160727增加）==

#### 如果处理没有错误的话，就可以启动项目了

* create by：刘迎光
* email：liuyg@liuyingguang.cn
* saiku 研究学习交流群：495266201
* [CSDN 博客saiku专栏](http://blog.csdn.net/gsying1474/article/category/2712301)



# License

Saiku and the Saiku UI are free software. The UI, contained in this repository, is available under the terms of the Apache License Version 2. A copy is attached for your convenience.