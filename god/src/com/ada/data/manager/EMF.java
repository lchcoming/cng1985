package com.ada.data.manager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EMF {
    private static final EntityManagerFactory emfInstance =
        Persistence.createEntityManagerFactory("ada");

    private EMF() {}

    public static EntityManagerFactory get() {
        return emfInstance;
    }
}