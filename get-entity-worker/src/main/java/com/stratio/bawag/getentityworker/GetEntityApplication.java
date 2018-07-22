package com.stratio.bawag.getentityworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.netflix.conductor.client.http.TaskClient;
import com.netflix.conductor.client.task.WorkflowTaskCoordinator;
import com.stratio.bawag.getentityworker.worker.GetEntityWorker;

@SpringBootApplication
public class GetEntityApplication {

  public static void main(String[] args) {

    SpringApplication.run(GetEntityApplication.class, args);

    TaskClient taskClient = new TaskClient();
    taskClient.setRootURI("http://localhost:8080/api/");

    com.netflix.conductor.client.worker.Worker ibanChecksum = new GetEntityWorker("get_entity");

    //Create WorkflowTaskCoordinator
    WorkflowTaskCoordinator.Builder builder = new WorkflowTaskCoordinator.Builder();
    WorkflowTaskCoordinator coordinator = builder.withWorkers(ibanChecksum).withThreadCount(1)
        .withTaskClient(taskClient).build();

    //Start for polling and execution of the tasks
    coordinator.init();
  }

}