# spring-boot-autoreload
Config Auto Reload When Code Change And Debug On spring Boot Docker Image
1. Include devtools library in pom.xml
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
	<scope>runtime</scope>
    <optional>true</optional>
</dependency>
```
2. Edit plugin in pom.xml
```
<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
			<configuration>
				<excludeDevtools>false</excludeDevtools>
			</configuration>
		</plugin>
	</plugins>
</build>
```

3. Add secret key for devtool library in application.properties

spring.devtools.remote.secret=********

4. Add new Java Application which help you upload code on Docker

Go to Run Configurations -> Java Application -> Create new
- On Main:
    + Write Name
    + Choose Project
    + Select Main Class: org.springframework.boot.devtools.RemoteSpringApplication
- Goto Arguments
    Program arguments setting: "http://localhost:8080" or your url deploy.

5. Add new Remote Java Application which help you debug on Docker

Go to Run Configurations -> Remote Java Application -> Create new
    - Write Name
    - Choose Project
    - Connection type: Standard (Socket attach)s
    - Connect properties
        + Host: localhost or your site ip
        + Port: 8000 or other port which setting "address" on docker
