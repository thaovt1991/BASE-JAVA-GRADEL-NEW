ssh -o StrictHostKeyChecking=no ec2-user@$EC2_PUBLIC_IP_ADDRESS << 'ENDSSH'
  cd /home/ec2-user/okasan/backend/odpj-api-admin
  export $(cat .env | xargs)
  aws ecr get-login-password --region $AWS_DEFAULT_REGION | docker login --username AWS --password-stdin $CI_REGISTRY
  docker pull $IMAGE:api-service
  docker-compose -f docker-compose.prod.yml up -d
  docker system prune -f
ENDSSH