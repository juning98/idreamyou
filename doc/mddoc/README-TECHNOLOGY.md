# 学习计划

## 2018.12.18
### 1.注解
````
内置注解：
1.@Override 用在方法上，表示这个方法重写了父类的方法，如toString()。
2.@Deprecated 表示这个方法已经过期，不建议开发者使用
3.@SuppressWarnings Suppress英文的意思是抑制的意思，这个注解的用处是忽略警告信息
4.@SafeVarargs 这是1.7 之后新加入的基本注解. 如例所示，当使用可变数量的参数的时候，而参数的类型又是泛型T的话，就会出现警告。 这个时候，就使用@SafeVarargs来去掉这个警告
5.@FunctionalInterface这是Java1.8 新增的注解，用于约定函数式接口。
自定义注解：
1.@Target 表示这个注解能放在什么位置上
2.@Retention 表示生命周期，3个选择（RetentionPolicy.SOURCE，RetentionPolicy.CLASS，RetentionPolicy.RUNTIME）
3.@Inherited 表示该注解具有继承性
4.@Documented 如图所示， 在用javadoc命令生成API文档后，DBUtil的文档里会出现该注解说明。
5.当没有@Repeatable修饰的时候，注解在同一个位置，只能出现一次
6.使用@Repeatable 这个元注解来表示，文件后缀名的范围可以是java, html, css, js 等等。
````
### 2.集合框架
````
ArrayList: 有顺序
HashSet: 无顺序(具体顺序，既不是按照插入顺序，也不是按照hashcode的顺序)
List中的数据可以重复
Set中的数据不能够重复
LinkedHashSet： 按照插入顺序
TreeSet： 从小到大排序

ArrayList 插入，删除数据慢
LinkedList， 插入，删除数据快
ArrayList是顺序结构，所以定位很快，指哪找哪。 就像电影院位置一样，有了电影票，一下就找到位置了。
LinkedList 是链表结构，就像手里的一串佛珠，要找出第99个佛珠，必须得一个一个的数过去，所以定位慢

HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
区别1： 
HashMap可以存放 null
Hashtable不能存放null
区别2：
HashMap不是线程安全的类
Hashtable是线程安全的类
````
### 3.泛型
````
1.T是type的缩写，也可以使用任何其他的合法的变量，比如A,B,X都可以，但是一般约定成俗使用T，代表类型。
````
