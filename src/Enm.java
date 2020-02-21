import java.util.EnumSet;

enum Weekday {
    Monday, Tuesday, Wednesday, Friday, Saturday,
}

public class Enm {

    EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
    EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
    EnumSet<Weekday> workday = EnumSet.range(Weekday.Monday, Weekday.Friday);

    public static void main(String[] args) {
        Enm o = new Enm();
        System.out.println(o.always);
        System.out.println(o.never);
        System.out.println(o.workday);
    }

}
