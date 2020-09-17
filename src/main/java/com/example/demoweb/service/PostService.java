package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(
            new Post(0l, "первый пост", new Date()),
            new Post(1l, "второй пост", new Date()),
            new Post(2l, "третий пост", new Date())
    ));

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }
}
