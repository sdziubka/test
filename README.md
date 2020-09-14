**Create user**

POST /

{
	"login":"sdziubka",
	"lastName":"Дзюбка",
	"firstName":"Сергей",
	"middleName":"Юръевич",
	"gender":"MALE",
	"dateOfBirth":"1994-05-08"
}

**Edit user**

PUT /

{
	"id":"1",
	"login":"serhiidziubka",
	"lastName":"Дзюбка",
	"firstName":"Сергей",
	"middleName":"Юръевич",
	"gender":"MALE",
	"dateOfBirth":"1994-05-08"
}

**Find user**

GET /?login=serhiidziubka