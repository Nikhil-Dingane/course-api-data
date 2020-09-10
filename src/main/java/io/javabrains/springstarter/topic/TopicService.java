package io.javabrains.springstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framwork Description"),
			new Topic("Java", "Core Java", "Java Description"),
			new Topic("Javascript", "Javascript", "Javascript Description")
			));
	
	public List<Topic> getTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		for(Topic topic : topics) {
			System.out.print(topic.getId());
			if(topic.getId().equals(id)) {				
				return topic;
			}
		}
		return null;
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public Topic updateTopic(Topic topic,String id) {
		for(Topic t : topics) {
			System.out.print(topic.getId());
			if(t.getId().equals(id)) {				
				t.setName(topic.getName());
				t.setDescription(topic.getDescription());
				return t;
			}
		}
		return null;
	}
	
	public Topic deleteTopic(String id) {
		Topic topic = null;
		for (int i = 0; i < topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topic = topics.remove(i);
				break;
			}
		}
		return topic;
	}
}
