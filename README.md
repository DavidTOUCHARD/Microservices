# Microservices

- Eureka service : microservice d'enregistrement (port 8761)
- Gateway : definition des routes (port 8888)
- Customer service : microservice des clients (port 8081) localhost:8888/CUSTOMER-SERVICE/  * * *
- Inventory service : microservice des produits (port 8082) localhost:8888/INVENTORY-SERVICE/  * * * 
- Billing service : microservice des achats (port 8083) localhost:8888/BILLING-SERVICE/  * * *
- Location service : microservice des magasins et adresses (port 8084) localhost:8888/LOCATION-SERVICE/  * * *

Monitoring : localhost:9999/hystrix
