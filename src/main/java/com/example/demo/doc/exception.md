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

######  常见的异常
1: 运行时异常, NullPointerException, ArrayIndexOutOfBoundException, ClassCastException 
2: 编译时异常 (编译时异常必须进行处理否则无法运行), IOException (FileNotFoundException),ClassNotFoundException

###### 异常的抓抛模型原理

- 异常的抛出
- 异常的抓取

1：如果程序在运行过程中执行某段代码时发生了异常，那么系统（JVM）将会根据异常的类型，在异常代码处创建对应的异常类型的对象并抛出，抛出给程序的调用者。
一旦抛出对象以后,其后的代码不再运行,程序终止.
异常的抛出分为：① 系统向外抛出异常 ② 手动向外抛出异常（throw）

2：异常的抓取可以理解为异常的处理方式, 取有 try-catch-finally 和 throws 两种方式（详情见异常的处理部分）

###### throws + 异常类型


1: throws 一般用于方法中可能存在异常时, 需要将异常情况向方法之上的层级抛出, 由抛出方法的上一级来解决这个问题, 如果方法的上一级无法解决的会就会再将异常向上抛出, 
最终会抛给main方法. 这样一来main方法中调用了这个方法的时候,就需要解决这个可能出现的异常
2: throws + 异常类型写在方法的声明处.指明此方法执行时,可能会抛出的异常类型.
   一旦方法体执行时,出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，就会被抛出。
   异常代码的后续的代码，就不再执行
3: try-catch-finally:真正的将异常给处理掉了。throws的方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉.


###### 自定义异常类

继承现有的异常结构：RuntimeException（不用处理）、Exception（需要处理）
