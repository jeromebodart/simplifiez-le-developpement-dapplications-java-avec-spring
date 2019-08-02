package org.example.demo.ticket.business.manager;

public class ManagerFactory {

    private static final ManagerFactory INSTANCE = new ManagerFactory();
    public ManagerFactory() {
        super();
    }

    /**
     * Renvoie l'instance unique de la classe (design pattern Singleton).
     *
     * @return {@link ManagerFactory}
     */
    public static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }


    public ProjetManager getProjetManager() {
        return new ProjetManager();
    }

    public TicketManager getTicketManager() {
        return new TicketManager();
    }
}
