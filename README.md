# SpringBoot Config
This project demonstrates the profile configuration for SpringBoot project

### **Versions Used:**

    Java: 1.8
    Springboot: 2.6.0
    
### **Commands Used:**  

*To clean the target folder and generate update packaged file:*  
```
mvn clean package  
```

![Alt text](/screenshots/TargetFolderJar.png?raw=true "Target Folder and JAR File")  

*To run the application with active profile as Test:*  
```
java -jar target/springboot-config-0.0.1-SNAPSHOT.jar --spring.profiles.active=test  
```

### Setting active profiles
Go to **Run -> Edit Configurations**  
Go to **Configuration** tab  
Expand the **Environment** section to reveal *VM options*  

![Alt text](/screenshots/RunConfigProfile.png?raw=true "Run Configuration Profile")  
