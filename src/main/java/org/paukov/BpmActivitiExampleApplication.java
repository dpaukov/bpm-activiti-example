package org.paukov;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BpmActivitiExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpmActivitiExampleApplication.class, args);
	}

    @Bean
    public CommandLineRunner init(final RepositoryService repositoryService,
                                  final RuntimeService runtimeService,
                                  final TaskService taskService) {

        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
            	Map<String, Object> variables = new HashMap<String, Object>();
                variables.put("userName", "John Doe");
                variables.put("phoneNumber", "123456789");
                runtimeService.startProcessInstanceByKey("activitiReview", variables);
            }
        };

    }
}
