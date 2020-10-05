package site.heeseong.scheduler.batch;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "PT30S")
public class BatchJob {

    private static final String ONE_MIN = "PT1M";

    //초 분 시 일 월 주 년
    @Scheduled(cron = "0 * 13 * * *")
    //@SchedulerLock(name = "scheduleTest1_schedul", lockAtMostFor = "PT1M", lockAtLeastFor = "PT2M")
    public void scheduleTest1() {
        System.out.println("배치 시작1");
        try{
            //throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 * 13 * * *")
    public void scheduleTest2() {
        System.out.println("배치 시작2");
    }

}
