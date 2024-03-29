package com.example.list_tasks.repository;

import com.example.list_tasks.model.Task;
import com.example.list_tasks.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Интерфейс для соединения и работы с базой данных. Является репозиторием. Использует Spring Data и его интерфейс JpaRepository
 * для поиска, удаления, изменения данных в БД.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Метод для поиска задач по статусу. Не входит в список базовых, но засчет корректного наименования задачи
     * Spring Data понимает, что нужно искать при вызове данного метода.
     * @param status Принимает статус из адресной строки запроса.
     * @return Возвращает список задач с указанным статусом.
     */
    List<Task> findByStatus(TaskStatus status);
}
