project_name=$1
echo "Initializing maven project $project_name"

mkdir $project_name
touch $project_name/README.md
touch $project_name/pom.xml
mkdir -p $project_name/src/main/java/com/sample
touch $project_name/src/main/java/com/sample/Application.java

echo "package com.sample;\n\npublic class Application {\n\n public static void main(String[] args) {\n\n } \n\n }" >> $project_name/src/main/java/com/sample/Application.java

# echo '<?xml version="1.0" encoding="UTF-8"?><project xmlns="http://maven.apache.org/POM/4.0.0"  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">  <modelVersion>4.0.0</modelVersion>  <groupId>com.sample</groupId>  <artifactId>project-name</artifactId>  <version>1.0-SNAPSHOT</version>  <properties>    <maven.compiler.source>8</maven.compiler.source>    <maven.compiler.target>8</maven.compiler.target>    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>    <spring.version>5.3.19</spring.version>  </properties>  <dependencies>    <dependency>      <groupId>org.springframework</groupId>      <artifactId>spring-context</artifactId>      <version>${spring.version}</version>    </dependency>    <dependency>      <groupId>org.springframework</groupId>      <artifactId>spring-core</artifactId>      <version>${spring.version}</version>    </dependency>  </dependencies>  <build>    <plugins>      <plugin>        <groupId>org.codehaus.mojo</groupId>        <artifactId>exec-maven-plugin</artifactId>        <version>3.1.0</version>        <configuration>          <mainClass>com.sample.Application</mainClass>        </configuration>      </plugin>    </plugins>  </build></project>' >> $project_name/pom.xml 
# 
# sed "s/project-name/$project_name/g" $project_name/pom.xml

echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<project xmlns=\"http://maven.apache.org/POM/4.0.0\"  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n  <modelVersion>4.0.0</modelVersion>\n\n  <groupId>com.sample</groupId>\n  <artifactId>${project_name}</artifactId>\n  <version>1.0-SNAPSHOT</version>  \n\n<properties>\n    <maven.compiler.source>8</maven.compiler.source>\n    <maven.compiler.target>8</maven.compiler.target>\n   <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n    <spring.version>5.3.19</spring.version>\n  </properties>\n\n  <dependencies>    <dependency>      <groupId>org.springframework</groupId>      <artifactId>spring-context</artifactId>      <version>\${spring.version}</version>    </dependency>    <dependency>      <groupId>org.springframework</groupId>      <artifactId>spring-core</artifactId>      <version>\${spring.version}</version>    </dependency>  </dependencies>\n\n  <build>    <plugins>      <plugin>        <groupId>org.codehaus.mojo</groupId>        <artifactId>exec-maven-plugin</artifactId>        <version>3.1.0</version>        <configuration>          <mainClass>com.sample.Application</mainClass>        </configuration>      </plugin>    </plugins>  \n\n</build>\n\n</project>" >> $project_name/pom.xml 



