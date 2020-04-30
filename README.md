# Spring-Eureka-Microservice-Example

a).Developed two microservices

     1.school microservice
     
     2.student microservice
     
 b). Eureka Server (here we can monitor the current running instance)
 
 Step to test
 1. Start Eureka Service .which is running on http://localhost:8761/
 2. open browser and hit the given url http://localhost:8761/     
 3. 1st time you will not get any instance beacuase our both the microservice is not yet started.
 4.start the student microservice which is running on 8098 port
 5.now if you can see the eureka server console then you will get over one running instance which is STUDENT-SERVICE.
 6.start the school microservice which is running on 9098 port
 7.use the below url to call our service
   http://localhost:9098/getSchoolDetails/oxfordschool
   
   
 Note:
 http://localhost:9098/getSchoolDetails/oxfordschool -- SCHOOL-SERVICE internally calling the STUDENT-SERVICE to get Student details.
