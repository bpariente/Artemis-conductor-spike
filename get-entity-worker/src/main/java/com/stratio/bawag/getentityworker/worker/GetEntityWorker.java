package com.stratio.bawag.getentityworker.worker;

import java.util.Optional;

import com.netflix.conductor.client.worker.Worker;
import com.netflix.conductor.common.metadata.tasks.Task;
import com.netflix.conductor.common.metadata.tasks.TaskResult;
import com.netflix.conductor.common.metadata.tasks.TaskResult.Status;
import com.stratio.bawag.getentityworker.domain.EntityEnum;
import com.stratio.bawag.getentityworker.domain.GetEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetEntityWorker implements Worker {

  private static EntityEnum entityEnum;
  private final String taskDefName;
  private final GetEntity getEntity  = new GetEntity();

  public GetEntityWorker(String taskDefName) {
    this.taskDefName = taskDefName;
  }

  @Override
  public String getTaskDefName() {
    return taskDefName;
  }

  @Override
  public TaskResult execute(Task task) {
    log.debug("Executing worker:{}", taskDefName);
    TaskResult result = new TaskResult(task);
    String iban = (String) task.getInputData().get("iban");
    Optional<String> entity = getEntity.getEntity(iban);
    result.setStatus(entity.map(e->Status.COMPLETED).orElse(Status.FAILED));
    result.addOutputData("entity",entity.orElse(""));
    return result;
  }
}
