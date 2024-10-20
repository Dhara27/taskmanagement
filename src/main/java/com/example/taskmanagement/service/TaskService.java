package com.example.taskmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.repository.TaskRepository;

/**
 * @author Dhara27 This is Service class for Task Management
 */
@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	/**
	 * Returns All Tasks
	 * 
	 * @return List of Tasks
	 */
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	/**
	 * Save a task
	 * 
	 * @param task input
	 * @return Task
	 */
	public Task save(Task task) {
		return taskRepository.save(task);
	}

	/**
	 * Delete a task
	 * 
	 * @param id input
	 */
	public void deleteById(Long id) {
		taskRepository.deleteById(id);
	}
}
