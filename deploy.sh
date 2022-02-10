sudo docker ps -a -q --filter "name=gcpstudy" | grep -q . && docker stop gcpstudy && docker rm gcpstudy | true
sudo docker rmi wannidev/gcpstudy:1.0
sudo docker pull wannidev/gcpstudy:1.0
docker run -d -p 8080:8080 --name gcpstudy wannidev/gcpstudy:1.0
docker rmi -f $(docker images -f "dangling=true" -q) || true