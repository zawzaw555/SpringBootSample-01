package com.example.demo.hello;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	@Autowired
	private SampleRepository sampleRepository;
	
	public Optional<Sample> getSample(String id) {
		return sampleRepository.findById(id);
	}
}
