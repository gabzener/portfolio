package aed.individual1;

import es.upm.aedlib.indexedlist.*;

public class Utils {

    public static <E> void eliminarRepetidos(IndexedList<E> lista) {
        for (int i = 0; i < lista.size();++i) {
            E actual = lista.get(i);

            int contador = 0;
            for (int j = 0; j < lista.size(); ++j) {
                if (lista.get(j).equals(actual)) {
                    contador++;
                }
            }

            if (contador > 1) {
                int index;
                while ((index = lista.indexOf(actual)) != -1) {
                    lista.removeElementAt(index);
                }
                i--;
            }
        }
    }

    public static <E> IndexedList<E> elementosRepetidos(IndexedList<E> l) {
        IndexedList<E> result = new ArrayIndexedList<>();

        for (int i = 0; i < l.size(); ++i) {
            E actual = l.get(i);

            int contador = 0;
            for (int j = 0; j < l.size(); ++j) {
                if (l.get(j).equals(actual)) {
                    contador++;
                }
            }

            if (contador > 1 && result.indexOf(actual) == -1) {
                result.add(result.size(), actual);
            }
        }

        return result;
    }

}