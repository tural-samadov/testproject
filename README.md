## 1)Task was developed on version 2.4.3 of the Spring Boot
## 2)MySQL version 8 was used as a database
## 3)To run the project, the user must change the following information in the application.yml file accordingly

```
database:
  username: root
  password: eagle
  host: localhost
  port: 3306
  name: testproject
  dialect: org.hibernate.dialect.MySQL8Dialect

log:
  file:
    path: D:/Workspaces/LogFiles
 ```
	

## 4)Tools such as Postman or SOAPUI can be used to test services.

## 5)Request and Response in Services are as follows :


# ADD Service
## REQUEST : 
	Method : POST
	URL : http://localhost:9090/calculate/add
	
	RequestBody :	
		{
			"intA": 6,
			"intB": 3
		}

	Response :  
		{
			"addResult": 9
		}


# SUBTRACT Service
## REQUEST : 
	Method : POST
	URL : http://localhost:9090/calculate/subtract
	
	RequestBody :	
		{
			"intA": 6,
			"intB": 3
		}

	Response :  
		{
			"subtractResult": 3
		}
		
	
# MULTIPLY Service
## REQUEST : 
	Method : POST
	URL : http://localhost:9090/calculate/multiply
	
	RequestBody :	
		{
			"intA": 6,
			"intB": 3
		}

	Response :  
		{
			"multiplyResult": 18
		}				
				
				
# DIVIDE Service
## REQUEST : 
	Method : POST
	URL : http://localhost:9090/calculate/divide
	
	RequestBody :	
		{
			"intA": 6,
			"intB": 3
		}

	Response :  
		{
			"divideResult": 2
		}	
				
				
				
				
				
				
				
