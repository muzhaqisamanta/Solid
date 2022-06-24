package o.after;

public class Manager extends TypeEmployee implements Worker{
    @Override
    public void setRole() {
        this.isManager = true;
    }
}
