package com.pkk.boot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.json.JsonParser;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>( Arrays.asList(
			new Topic("Spring","Spring framework","Spring description"),
			new Topic("Hibernate","Hibernate framework","Hibernate description"),
			new Topic("Boot","Spring Boot framework","Spring Boot description")));
	
	public List<Topic> getAllTopic(){
		return topics;
	}

	public Topic getTopic(String id) {
		return	topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<topics.size(); i++){
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
			}
			
		}
		
		
	}

	public void removeTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
	
}
