package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;

import static org.junit.Assert.*;

public class JobTest {

    Job test1;
    Job test2;
    Job test3;
    Job test4;

    @Before
    public void JobObject(){
        test1 = new Job();
        test2 = new Job();
        test3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1,test2.getId() - test1.getId() );
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(test3 instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
        assertNotEquals(test3, test4);
    }

}
