package com.learn.mongodb.dao;

import com.learn.mongodb.model.HelloEntity;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class HelloDaoImpl implements HelloDao {
    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public void saveDemo(HelloEntity helloEntity) {
        mongoTemplate.save(helloEntity);
    }

    @Override
    public void removeDemo(Long id) {
        mongoTemplate.remove(id);
    }

    @Override
    public void updateDemo(HelloEntity helloEntity) {
        Query query = new Query(Criteria.where("id").is(helloEntity.getId()));

        Update update = new Update();
        update.set("title", helloEntity.getTitle());
        update.set("description", helloEntity.getDescription());
        update.set("by", helloEntity.getBy());
        update.set("url", helloEntity.getUrl());

        mongoTemplate.updateFirst(query, update, HelloEntity.class);
    }

    @Override
    public HelloEntity findDemoById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        HelloEntity demoEntity = mongoTemplate.findOne(query, HelloEntity.class);
        return demoEntity;
    }
}
