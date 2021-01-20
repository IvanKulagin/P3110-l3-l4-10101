import java.util.Objects;

class Clock implements Time {
    private int h, m;

    Clock(int h, int m) {
        this.h = h;
        this.m = m;
    }

    @Override
    public void add(int m) {
        System.out.println("Прошло " + m + " минут");
    }

    @Override
    public String getTime() {
        return "На часах " + h + ":" + m;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return h == clock.h && m == clock.m;
    }

    @Override
    public int hashCode() {
        return Objects.hash(h, m);
    }

    @Override
    public String toString() {
        return h + ":" + m;
    }
}
