package by.coolphone.service;

import by.coolphone.entity.Comment;
import by.coolphone.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void saveComment(Comment comment){
        commentRepository.save(comment);
    }
}
