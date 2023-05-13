package com.example.mengrooming.service.impl;

import com.example.mengrooming.entity.Comment;
import com.example.mengrooming.payload.CommentDto;
import com.example.mengrooming.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chhin_Hua - 13/05
 **/

@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public List<CommentDto> getCommentsByProduct(long productId) {
        return null;
    }

    @Override
    public CommentDto addComment(Comment comment, long productId) {
        return null;
    }

    @Override
    public CommentDto updateCommentById(Comment comment, long id) {
        return null;
    }

    @Override
    public String deleteCommentById(long id) {
        return null;
    }
}
