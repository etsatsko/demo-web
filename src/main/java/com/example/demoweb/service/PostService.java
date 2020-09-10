package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        return new ArrayList<Post> (Arrays.asList(new Post("first"),new Post("second"),new Post("third")));
    }
}
