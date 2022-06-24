package o.after;

public class Excecutive extends TypeEmployee implements Worker{
    @Override
    public void setRole() {
        this.isManager = true;
        this.isExecutive = true;
    }
}
