package uk.gov.hmcts.reform.wastandalonetaskbpmn.bpmn;

import org.camunda.bpm.engine.test.Deployment;
import org.junit.Test;
import uk.gov.hmcts.reform.wastandalonetaskbpmn.CamundaProcessEngineBaseUnitTest;

public class CamundaCreateTaskTest extends CamundaProcessEngineBaseUnitTest {

    @Test
    @Deployment(resources = {"wa-task-initiation-ia-asylum.bpmn"})
    public void should_create_a_task_with_delay_until() {
        createTask(true);
    }

    @Test
    @Deployment(resources = {"wa-task-initiation-ia-asylum.bpmn"})
    public void should_create_a_task_with_no_delay_until() {
        createTask(false);
    }

}
