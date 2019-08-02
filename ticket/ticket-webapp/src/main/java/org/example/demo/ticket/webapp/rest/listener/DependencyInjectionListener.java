package org.example.demo.ticket.webapp.rest.listener;

import org.example.demo.ticket.business.manager.ManagerFactory;
import org.example.demo.ticket.webapp.rest.resource.ticket.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ManagerFactory vManagerFactory = new ManagerFactory();
        AbstractResource.setManagerFactory(vManagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
