package com.example.demo.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDocument {
    /**
     * elasticSearch에서 사용할 Index의 정보 기입
     * Index에 대한 Mapping의 정보를 정의
     *
     * - users에 해당하는 인덱스가 존재하지 않으면 생성
     */

    @Id
    private String id;

    @Field(type = FieldType.Keyword)
    private String name;
    @Field(type = FieldType.Integer)
    private Long age;
    @Field(type = FieldType.Boolean)
    private Boolean isActive;

}