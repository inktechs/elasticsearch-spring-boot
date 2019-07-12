package com.mesadhan.elasticsearch.repository;
import com.mesadhan.elasticsearch.data.OrderLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderLogRepository extends ElasticsearchRepository<OrderLog, String> {

}
