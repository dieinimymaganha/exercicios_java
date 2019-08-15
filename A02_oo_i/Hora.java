package A02_oo_i;

class Hora {

    private int hor, min, seg;

    public int getHoras() {
        return hor;
    }

    public int getMinutos() {
        return min;
    }

    public int getSegundos() {
        return seg;
    }

    public void setHoras(int h) {
        if (h >= 0 && h < 24) {
            hor = h;
        }
    }

    public void setMinutos(int m) {
        if (m >= 0 && m < 60) {
            min = m;
        }
    }

    public void setSegundos(int s) {
        if (s >= 0 && s < 60) {
            seg = s;
        }
    }

    public void setHorario(int h, int m, int s) {
        setHoras(h);
        setMinutos(m);
        setSegundos(s);
    }

    public String toString() {
        return getHoras() + ":" + getMinutos() + ":" + getSegundos();
    }
}
