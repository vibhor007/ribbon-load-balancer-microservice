# ribbon-load-balancer-microservice

1. Start the the project "ribbon client" on different-different port and port must be match with configured port number
   which i have metioned in "ribbon-user-app" project under yml file( listOfServers: localhost:8081,localhost:8082,localhost:8083)
   
2. start the project "ribbon-user-app"

REST URL:
http://localhost:9090/invoke

OUTPUT:
application is up on port : 8081
