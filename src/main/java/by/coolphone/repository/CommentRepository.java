package by.coolphone.repository;

import by.coolphone.entity.Comment;
import by.coolphone.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findCommentsByPhone(Phone phone);
}
