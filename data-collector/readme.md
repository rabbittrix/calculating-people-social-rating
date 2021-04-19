# Work-flow
#RabbitMQ:
docker run -d --hostname rabbitmq-local --name rabbitmq-test -p 15672:15672 -p 5672:5672 rabbitmq:3-management
username: guest
password: guest

#Redis:
docker run -it --name redis -p 6379:6379 redis:latest

enter in redis: docker exec -it redis /bin/bash
call - redis-cli - keys * - keys <name-key>

## Can use Postman
DataCollector on port localhost:9000/custom
{
"first_name": "name",
"last_name": "last",
"age": 20
}

## Calculator rating
calculate social rating score (score = base seed * user’s age)
localhost:9001/ratings

