package love.wangqi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: wangqi
 * @description:
 * @date: Created in 2019-02-18 16:58
 */
@Component
public class EventDemoListener implements ApplicationListener<EventDemo> {
    Logger logger = LoggerFactory.getLogger(EventDemoListener.class);

    public EventDemoListener() {
        System.out.println("EventDemoListener");
    }

    @Async
    @Override
    public void onApplicationEvent(EventDemo event) {
        logger.info("receiver " + event.getMessage());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
