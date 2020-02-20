
public class Military implements Shooter{
    private String battleCry;
    private Gun gun;

    public Military() {}

    public void toShoot() {
        System.out.print("Scream: " + battleCry);
        gun.makeBang();
    }
    public void setBattleCry(String battleCry) {
        this.battleCry = battleCry;
    }
    public String getBattleCry() {
        return battleCry;
    }
    public void setGun(Gun gun){
        this.gun = gun;
    }
}