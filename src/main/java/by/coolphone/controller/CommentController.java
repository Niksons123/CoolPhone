package by.coolphone.controller;

import by.coolphone.dto.SaveCommentDto;
import by.coolphone.entity.Comment;
import by.coolphone.repository.CommentRepository;
import by.coolphone.service.CommentService;
import by.coolphone.service.PhoneService;
import by.coolphone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;
    private final UserService userService;
    private final PhoneService phoneService;

    @PostMapping("/add")
    public String addComment(SaveCommentDto saveCommentDto, @AuthenticationPrincipal User principal){
        by.coolphone.entity.User user = userService.findByUsername(principal.getUsername());
        Comment comment = new Comment(saveCommentDto.getDescription(), LocalDateTime.now(), 0,
                phoneService.getPhone(saveCommentDto.getModel()), user);
        commentService.saveComment(comment);
        return "index";
    }
}
