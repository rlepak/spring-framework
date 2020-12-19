package com.cybertek.Bootstrap;

import com.cybertek.entity.Post;
import com.cybertek.entity.Tag;
import com.cybertek.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PostRepository postRepository;


    @Override
    public void run(String... args) throws Exception {


        Post p1 = new Post("ORM", "ManyToMany");
        Post p2= new Post("MVC", "Controller");

        Tag t1 = new Tag("Springboot");
        Tag t2 = new Tag("JPA");

        p1.getTags().add(t1);
        p1.getTags().add(t2);

        t1.getPosts().add(p1);
        t2.getPosts().add(p1);

        t1.getPosts().add(p2);
        p2.getTags().add(t1);

        postRepository.save(p1);
        postRepository.save(p2);



    }
}
