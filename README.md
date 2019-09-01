Sample REST application

REST application that provides REST API.

Run CustomerService locally

Database configuration

1. Create database sarafan |
Predefined username - admin |
Predefined password - 123456 |

2. git clone https://github.com/wveik/SpringBootSimpleRest.git
3. cd SpringBootSimpleRest
4. mvn spring-boot:run

5. Access CustomerService using next REST requests:

GET: localhost:8080/api/v1/customers/ - get all customers
GET: localhost:8080/api/v1/customers/1 - get customer with ID 1

POST: localhost:8080/api/v1/customers/
Request body:
{
	"firstName": "Test1",
	"lastName": "Test2",
	"address": "Test address",
	"budget": "100500"
}

PUT: localhost:8080/api/v1/customers/
Request body:
{
    "id": 2,
	"firstName": "Vasil",
	"lastName": "Vasilievish",
	"address": "Test address",
	"budget": "200800"
}


DELETE: localhost:8080/api/v1/customers/2 - delete customer with ID 2