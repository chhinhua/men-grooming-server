package com.example.mengrooming.service;

import com.example.mengrooming.entity.Comment;
import com.example.mengrooming.payload.CommentDto;
import com.example.mengrooming.payload.ProductDto;

import java.util.List;

public interface CommentService {
    List<CommentDto> getCommentsByProduct(long productId);

    CommentDto addComment(Comment comment, long productId);

    CommentDto updateCommentById(Comment comment, long id);

    String deleteCommentById(long id);
}
