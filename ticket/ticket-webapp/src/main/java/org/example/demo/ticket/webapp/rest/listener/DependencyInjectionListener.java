package org.example.demo.ticket.webapp.rest.listener;

import org.example.demo.ticket.business.impl.ManagerFactory;
import org.example.demo.ticket.business.impl.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.ticket.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ManagerFactory vManagerFactory = new ManagerFactory();
        vManagerFactory.setProjetManager(new ProjetManagerImpl());
        vManagerFactory.setTicketManager(new TicketManagerImpl());
        AbstractResource.setManagerFactory(vManagerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
