package demo.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.audit.entity.Comentario;

@Repository
public interface CommentRepository extends JpaRepository<Comentario, Integer>{

}
