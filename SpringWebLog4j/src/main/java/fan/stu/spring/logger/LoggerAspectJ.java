package fan.stu.spring.logger;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAspectJ {

    private static final Logger logger = Logger.getLogger(LoggerAspectJ.class);

    @Before("execution(* fan.stu.spring.MainController.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Start method " + joinPoint.getSignature().getName());
    }

    @After("execution(* fan.stu.spring.MainController.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("Finish method " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* fan.stu.spring.MainController.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoin, Object result) {
        logger.info("After returning " + joinPoin.getSignature().getName());
        logger.info("Return value " + result);
    }

    @AfterThrowing(pointcut = ("execution(* fan.stu.spring.MainController.*(..))"), throwing = "error")
    public void logThrow(JoinPoint joinPoin, Throwable error) {
        logger.info("Exception of method " + joinPoin.getSignature().getName());
        logger.info("Exception is " + error);
    }
}
