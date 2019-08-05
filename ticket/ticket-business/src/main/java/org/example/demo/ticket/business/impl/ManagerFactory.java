package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public class ManagerFactory {

    private static final ManagerFactory INSTANCE = new ManagerFactory();
    public ManagerFactory() {
        super();
    }
    private ProjetManager projetManager;
    private TicketManager ticketManager;

    /**
     * Renvoie l'instance unique de la classe (design pattern Singleton).
     *
     * @return {@link ManagerFactory}
     */
    public static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }


    public ProjetManager getProjetManager() {
        return  this.projetManager;
    }

    public void setProjetManager(ProjetManager projetManager) {
        this.projetManager = projetManager;
    }

    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    public TicketManager getTicketManager() {
        return this.ticketManager;
    }
}
