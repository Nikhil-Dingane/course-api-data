package io.javabrains.springstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public Topic updateTopic(Topic topic,String id) {
		return topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}
