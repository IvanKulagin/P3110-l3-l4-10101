import java.util.Objects;

class Clock implements Time {
    int h, m;

    Clock(int h, int m) {
        this.h = h;
        this.m = m;
        System.out.println("Установлено время на часах " + h + " часов " + m + " минут");
    }

    @Override
    public void add(int m) {
        this.m += m;
        if (m >= 60){
            h += m / 60;
            this.m = this.m % 60;
        }
        System.out.println("Время увеличено на " + m + " минут");
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
        return "На часах " + h + ":" + m;
    }
}
