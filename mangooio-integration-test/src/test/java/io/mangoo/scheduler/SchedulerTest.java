package io.mangoo.scheduler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.quartz.JobKey;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.Trigger.TriggerState;

import io.mangoo.core.Application;
import io.mangoo.exceptions.MangooSchedulerException;


/**
 * 
 * @author svenkubiak
 *
 */
public class SchedulerTest {
    private static final String JOB_NAME = "jobs.InfoJob";
    private static Scheduler scheduler;
    
    @BeforeClass
    public static void init() {
        scheduler = Application.getInstance(Scheduler.class);
    }
    
    @Test
    public void testGetAllJobs() throws MangooSchedulerException {
        //when
        List<io.mangoo.models.Job> jobs = scheduler.getAllJobs();
        
        //then
        assertThat(jobs, not(nullValue()));
        assertThat(jobs.size(), equalTo(1));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void testChangeState() throws MangooSchedulerException, SchedulerException {
        //when
        scheduler.changeState(JOB_NAME);
        
        //then
        List<JobKey> jobKeys = scheduler.getAllJobKeys();
        
        //then
        for (JobKey jobKey : jobKeys) {
            if (jobKey.getName().equals(JOB_NAME)) {
                List<Trigger> triggers = (List<Trigger>) scheduler.getQuartzScheduler().getTriggersOfJob(jobKey);
                Trigger trigger = triggers.get(0);  
                TriggerState triggerState = scheduler.getQuartzScheduler().getTriggerState(trigger.getKey());
                
                assertThat(triggerState, equalTo(TriggerState.PAUSED));
            }
        }
        
        //when
        scheduler.changeState(JOB_NAME);
        
        //then
        jobKeys = scheduler.getAllJobKeys();
        
        //then
        for (JobKey jobKey : jobKeys) {
            if (jobKey.getName().equals(JOB_NAME)) {
                List<Trigger> triggers = (List<Trigger>) scheduler.getQuartzScheduler().getTriggersOfJob(jobKey);
                Trigger trigger = triggers.get(0);  
                TriggerState triggerState = scheduler.getQuartzScheduler().getTriggerState(trigger.getKey());
                
                assertThat(triggerState, equalTo(TriggerState.NORMAL));
            }
        }
    }
    
    @Test
    public void testExecuteJob() throws MangooSchedulerException {
        //when
        scheduler.executeJob(JOB_NAME);
    }

    @Test
    public void testGetAllJobKeys() throws MangooSchedulerException {
        //when
        List<JobKey> jobKeys = scheduler.getAllJobKeys();
        
        //then
        assertThat(jobKeys, not(nullValue()));
        assertThat(jobKeys.size(), equalTo(1));
    }
}