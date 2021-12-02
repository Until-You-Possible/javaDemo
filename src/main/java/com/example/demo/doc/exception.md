### Java的异常分析和处理

###### 概念

如果某个方法不能按照正常的途径完成任务，就可以通过另一种路径退出方法。在这种情况下
会抛出一个封装了错误信息的对象。此时，这个方法会立刻退出同时不返回任何值。另外，调用
这个方法的其他代码也无法继续执行，异常处理机制会将代码执行交给异常处理器。


###### 异常的分类

Throwable 是 Java 语言中所有错误或异常的超类。下一层分为 Error 和 Exception

1： Error 类是指 java 运行时系统的内部错误和资源耗尽错误。应用程序不会抛出该类对象。如果
出现了这样的错误，除了告知用户，剩下的就是尽力使程序安全的终止。

2： Exception（RuntimeException、CheckedException）
Exception 又有两个分支，一个是运行时异常 RuntimeException ，一个是
CheckedException

RuntimeException 如 ： NullPointerException 、 ClassCastException ；一个是检查异常
CheckedException，如 I/O 错误导致的 IOException、SQLException。 RuntimeException 是
那些可能在 Java 虚拟机正常运行期间抛出的异常的超类。 如果出现 RuntimeException，那么一
定是程序员的错误.

检查异常 CheckedException：一般是外部错误，这种异常都发生在编译阶段，Java 编译器会强
制程序去捕获此类异常，即会出现要求你把这段可能出现异常的程序进行 try catch，该类异常一
般包括几个方面：


###### 异常处理方式

遇到问题不进行具体处理，而是继续抛给调用者 （throw,throws）

抛出异常有三种形式，一是 throw,一个 throws，还有一种系统自动抛异常