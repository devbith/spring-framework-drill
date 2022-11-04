### Interface in OOP: 
An interface is a description of actions or behaviour of an object. It is a way to
enforce actions on the object that implements the interface.

### Interface in Java:
An interface is a reference type, which contains collection of abstract method.
- With Java 8, interface can have public static method and default method
- With Java 9, interface can have private static method as well. 


### Advantage of an Interface in Spring and in Java

In Java:
- Allows decoupling between contract and its implementation
- Allows declaring contract between callee and caller

  If we look at SimpleFinancialReportService, it has two dependency FinancialDataDao and FinancialReportWriter
  so when we have the instance of FinancialDataDao or FinancialReportWriter, we are sure that the implementation
  will be implementing defined methods (declared contract).

- Increases interchangeability

  For the SimpleFinancialReportService, we can provide different implementation of FinancialDataDao and FinancialReportWriter
  like DatabaseStoreFinancialDataDao, FileStoreFinancialDataDao etc this means we have gain interchangeability using interface.

   
- Increses testability 

  Testability has increased as we can inject any implementation for the dependency that SimpleFinancialService required.
  also we can create our own mock implementation of the FinancialDataDao and FinancialReportWriter this means that 
  testability has also increased. Take a look at class SimpleFinancialServiceTest.


In Spring:
- Allows implementation hiding
  
  It is a simple concept, if we look at the package, only interface FinancialDao and FinancialReportWriter is public and the 
  implementation has the package-private access modifier.
  ```
  |  dao
  |    FinancialDataDao (public)
  |    FileStoreFinancialDataDao (package-private)
  |    DatabaseStoreFinancialDataDao  (package-private)
  |  writer
  |    FinancialReportWriter (public)
  |    FileStoreFinancialReportWriter (package-private)
  |    DatabaseStoreFinancialReportWriter (package-private)
 
  ```
  this means the implementation are not visible outside the package and this let us achieve implementation hiding.
  Here, instance of implementation can't be created by us but Spring will do that job for us with Spring IoC.
  

- Allows to easily switch beans 

  To understand this, We can look at the class FinancialReportService which has two dependency FinancialDataDao and FinancialReportServiceWriter
  with annotation @Qualifer from spring-bean project which allows eaisly switch between the implementation just changing the name of the qualifier.
 



- Allows JDK dynamic proxy
  If we are using interface is Spring, JDK dynamic proxy is an option other wise we need to use CGLib proxy.
  


