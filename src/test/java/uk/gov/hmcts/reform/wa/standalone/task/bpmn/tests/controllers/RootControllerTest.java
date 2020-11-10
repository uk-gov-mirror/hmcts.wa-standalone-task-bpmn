package uk.gov.hmcts.reform.wa.standalone.task.bpmn.tests.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import uk.gov.hmcts.reform.wa.standalone.task.bpmn.controllers.RootController;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SuppressWarnings({"PMD.JUnitAssertionsShouldIncludeMessage","PMD.MethodNamingConventions"})
class RootControllerTest {

    private final RootController rootController = new RootController();

    @Test
    void should_return_welcome_response() {

        ResponseEntity<String> responseEntity = rootController.welcome();

        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertThat(
            responseEntity.getBody(),
            containsString("Welcome")
        );
    }
}
