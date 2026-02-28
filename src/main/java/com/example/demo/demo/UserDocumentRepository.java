package com.example.demo.demo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;



public interface UserDocumentRepository extends ElasticsearchRepository<UserDocument, String> {
}
