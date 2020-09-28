package site.heeseong.scheduler.batch;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class BatchJob {

    //초 분 시 일 월 주 년
    @Scheduled(cron = "0/2 * * * * *")
    private void scheduleTest() {
        System.out.println("배치 시작");
    }

}
