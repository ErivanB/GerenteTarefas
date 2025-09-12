package br.edu.ifpb.GerenteTarefas.model.repository;



import br.edu.ifpb.GerenteTarefas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
