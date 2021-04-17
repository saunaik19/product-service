This service is exposed on Port : 9100

for docker setup
This code is currently using inbuilt mongo here  is docker config

https://blog.jeremylikness.com/blog/2018-12-27_mongodb-on-windows-in-minutes-with-docker/
docker run --name some-mongo -d mongo:tag


docker run --name mongodb-products -v mongodata:/data/db -d -p 27017:27017 mongo


C:\Windows\system32>docker run --name mongodb-products -v mongodata:/data/db -d -p 27017:27017 mongo
e0025254d2970d2122bbbaf43fd0df1c26ee2146aa85b1d817d4b091e5426eb6



use products-db
db.createUser({user:"saurabh", pwd:"saurabh", roles:[{role:"readWrite", db: "products-db"}]});


docker run --name mongodb-products -v mongodata:/data/db -d -p 27017:27017 mongo --auth



NOTE:
here is some sample data 


{
"id": 101,
"name": "Iphone",
"description": "Apple cha phone",
"price": 899.29
}
{
"id": 102,
"name": "Sony",
"description": "Sony dashcam",
"price": 520.29
}