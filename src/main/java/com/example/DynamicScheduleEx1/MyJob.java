package com.example.DynamicScheduleEx1;

import com.example.DynamicScheduleEx1.repository.ConfigRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;



@Configuration
  public class MyJob  implements SchedulingConfigurer {
    private static Logger LOGGER = LoggerFactory.getLogger(MyJob.class);
    private ConfigRepo repo;
 @Autowired
     public MyJob(ConfigRepo repo)
     {
         this.repo=repo;
     }
  @Override
  public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
      System.out.println(repo.findAll());
     taskRegistrar.addTriggerTask(() -> scheduleCron(repo.findById("next_exec_time").get().getConfigValue()), t -> {
          CronTrigger crontrigger = new CronTrigger(repo.findById("next_exec_time").get().getConfigValue());
          return crontrigger.nextExecution(t);

      });

  }

  public void scheduleCron(String cron) {
         LOGGER.info("scheduleCron: Next execution time of this taken from cron expression -> {}", cron);
     }
}
