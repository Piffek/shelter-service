docker build -t shelter-service:$1 .
docker tag shelter-service:$1 piffek1/shelter-service:$1
docker push piffek1/shelter-service:$1
