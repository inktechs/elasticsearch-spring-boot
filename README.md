# Setup ELK Stack

## Run docker compose from file

    docker-compose -f "docker-compose.yml" up -d
    docker-compose up -d
    docker-compose -dwon

## [Spring Boot Application Deploy in Docker](https://thepracticaldeveloper.com/2017/12/11/dockerize-spring-boot)



## Service Expose
- [http://localhost:9200/_nodes/http?pretty](http://localhost:9200/_nodes/http?pretty)
- [http://localhost:9200](http://localhost:9200)
- [http://localhost:5602](http://localhost:5602)


## Docker Run Command

```bash
docker run --name elasticsearch -p 9200:9200 -p 9300:9300  -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:6.8.1
docker run --name kibana_gui --link elasticsearch:elasticsearch_alias -p 5601:5601 docker.elastic.co/kibana/kibana:6.8.1


# generalization form 
docker run --name kibana --link YOUR_ELASTICSEARCH_CONTAINER_NAME_OR_ID:elasticsearch_alias -p 5601:5601 {docker-repo}:{version}

```

`Note:` `--link`  deprecated now, mainly `--link` used for Container Networking so Containers can Communicate to one another. Old container still use `--link`, But present uses Docker Networking.



## Learn More

- [Elasticsearch](https://www.elastic.co/guide/en/elasticsearch/reference/current/docker.html)
- [Kibana](https://www.elastic.co/guide/en/kibana/current/docker.html)
- [Logstash](https://www.elastic.co/guide/en/logstash/current/docker.html)
