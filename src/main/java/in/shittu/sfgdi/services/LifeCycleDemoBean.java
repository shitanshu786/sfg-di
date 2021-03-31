package in.shittu.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("##In LifecycleBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## In LifecycleBean setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## In LifecycleBean setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## In LifecycleBean Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## In LifecycleBean afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## In LifecycleBean setApplicationContext");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## In LifecycleBean PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## In LifecycleBean PreDestroy");
    }

    public void beforeInit(){
        System.out.println("## Before initialization- Using Post ProcessorBean");
    }

    public void afterInit(){
        System.out.println("## After initialization- Using Post ProcessorBean");
    }
}
