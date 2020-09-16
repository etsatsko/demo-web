package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        return new ArrayList<Post> (Arrays.asList(
                new Post("first", new Date()),
                new Post("second", new Date()),
                new Post("third", new Date())
        ));
    }
}
