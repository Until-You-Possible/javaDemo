
***difference between JDK, JRE, JVM***

```text

We must understand the differences between JDK, JRE, 
and JVM before proceeding further to Java. 

JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine 
because it doesn't physically exist. It is a specification that provides a runtime environment 
in which Java bytecode can be executed. It can also run those programs 
which are written in other languages and compiled to Java bytecode.

JVMs are available for many hardware and software platforms. JVM, JRE, and JDK 
are platform dependent because the configuration of each OS is different from each other. 
However, Java is platform independent. 
There are three notions of the JVM: specification, implementation, and instance.

```

the jvm performs the following main tasks
- loads code
- verifies code
- executes code
- provides runtime environment

**JRE**

```text

JRE is an acronym for Java Runtime Environment. It is also written as Java RTE. 
The Java Runtime Environment is a set of software tools which are used for developing Java applications. 
It is used to provide the runtime environment. It is the implementation of JVM. It physically exists.
It contains a set of libraries + other files that JVM uses at runtime.
The implementation of JVM is also actively released by other companies besides Sun Micro Systems.

```

![img.png](img/img.png)


**JDK**

```text

JDK is an acronym for java development Kit The java Development Kit is a software development eve which is used to develop 
application and applets. it physically

```

JDK is an implementation of any one of the below given Java Platforms released by Oracle Corporation:

- Standard Edition Java Platform
- Enterprise Edition Java Platform
- Micro Edition Java Platform

The JDK contains a private Java Virtual Machine (JVM) and a few other resources such as an interpreter/loader (java), 
a compiler (javac), an archiver (jar), a documentation generator (Javadoc), 
etc. to complete the development of a Java Application.

![img_1.png](img/img_1.png)

