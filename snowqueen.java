public class snowqueen extends human {
    private boolean freezeSkill;

    public snowqueen(String name, double height, double weight, double speed, String gender, boolean freezeSkill) {
        super(name, height, weight, speed, gender);
        this.freezeSkill = freezeSkill;
    }

    public void show() {
        super.show();
        System.out.println("Freeze Skill: " + (freezeSkill ? "YES" : "NO"));
    }

    public double distance(int x, double y) {
        return super.distance(x, y) * 2;
    }

    public double distance(int x) {
        return super.distance(x) * 2;
    }
}
