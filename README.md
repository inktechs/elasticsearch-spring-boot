
# Run docker compose from file

    docker-compose -f "docker-compose.yml" up -d
    docker-compose up -d
    docker-compose -dwon

# [Spring Boot Application Deploy in Docker](https://thepracticaldeveloper.com/2017/12/11/dockerize-spring-boot)




# Service Expose
- [http://localhost:9200/_nodes/http?pretty](http://localhost:9200/_nodes/http?pretty)
- [http://localhost:9200](http://localhost:9200)
- [http://localhost:5602](http://localhost:5602)


# Docker Run Command

```bash
docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.2.0
docker run -p 5601:5601 -e "ELASTICSEARCH_URL='http://elasticsearch:9300'" docker.elastic.co/kibana/kibana:7.2.0
```
