package ch3.taskexecutor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan("ch3.taskexecutor")
@EnableAsync
public class TaskExecutorConfig {
}
