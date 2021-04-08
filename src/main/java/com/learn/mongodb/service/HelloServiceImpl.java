package com.learn.mongodb.service;

import com.learn.mongodb.dao.HelloDao;
import com.learn.mongodb.model.HelloEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloDao helloDao;

    @Override
    public void add() {
        HelloEntity demoEntity = new HelloEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        helloDao.saveDemo(demoEntity);
    }
}
