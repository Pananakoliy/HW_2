import java.util.Collection;

public class Commando implements Shooter{
    public Commando(){}
    public void toShoot(){
        for (Gun bigGun:guns){
            bigGun.makeBang();
        }
    }
    private Collection<Gun> guns;
    public void setGuns(Collection<Gun> guns){
        this.guns = guns;
    }
}
