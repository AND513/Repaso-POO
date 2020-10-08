public class ComparaNombre implements java.util.Comparator<Contacto> {
    public int compare(Contacto c1, Contacto c2) {
        if (c1 == c2)
            return 0;
        if (c1 == null)
            return -1;
        if (c2 == null)
            return 1;
        return c1.getNombre().compareTo(c2.getNombre());
    }
}
