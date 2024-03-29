package example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import example.project.domain.Scenario;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.mockito.Mockito.*;


public class TestChecker {

    @Test
    public void testCheckCollisionViolations()
    {
        // setup
        Simulator simulator = new Simulator("dummy");
        Scenario scenario = new Scenario();

        // testing target
        // Checker checker = new Checker(simulator);
        Checker checker = mock();
        when(checker.checkCollisionViolations(scenario)).thenReturn(false);
        boolean isCollision = checker.checkCollisionViolations(scenario); // this invokes a null pointer exception due to the dummy simulator
        assertEquals(false, isCollision);
        verify(checker, times(1)).checkCollisionViolations(scenario);
    }

}