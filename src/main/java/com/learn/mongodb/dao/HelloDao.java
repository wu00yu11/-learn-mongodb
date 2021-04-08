package com.learn.mongodb.dao;

import com.learn.mongodb.model.HelloEntity;

public interface HelloDao {
    void saveDemo(HelloEntity helloEntity);

    void removeDemo(Long id);

    void updateDemo(HelloEntity helloEntity);

    HelloEntity findDemoById(Long id);
}
