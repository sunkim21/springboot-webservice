package com.example.webservice;

import com.example.webservice.domain.posts.Posts;
import com.example.webservice.domain.posts.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    PostsRepository postsRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        postsRepository.save(Posts.builder()
                .title("테스트 게시글 1")
                .content("테스트 게시글 1 본문입니다")
                .author("sunkim21@example.com")
                .build());

        postsRepository.save(Posts.builder()
                .title("테스트 게시글 2")
                .content("테스트 게시글 2 본문입니다")
                .author("sunkim21@example.com")
                .build());
    }
}
