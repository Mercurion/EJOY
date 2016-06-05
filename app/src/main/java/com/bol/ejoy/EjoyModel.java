package com.bol.ejoy;

/**
 * Created by jackb on 05/06/2016.
 */
public class EjoyModel {
    private static EjoyModel istanza = null;

    //Il costruttore private impedisce l'istanza di oggetti da parte di classi esterne
    private EjoyModel() {}

    // Metodo della classe impiegato per accedere al singleton
    public static synchronized EjoyModel getMioSingolo() {
        if (istanza == null) {
            istanza = new EjoyModel();
        }
        return istanza;
    }
    
}
