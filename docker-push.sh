docker build -t shelter-service:$1 .
docker tag shelter-service:latest piffek1/shelter-service:$1
docker push piffek1/shelter-service:$1
