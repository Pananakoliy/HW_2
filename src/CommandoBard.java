public class CommandoBard implements Shooter {

    private BattleCry battleCry;

    public CommandoBard(BattleCry battleCry){
        super();
        this.battleCry = battleCry;
    }
    public CommandoBard(int beanBags, BattleCry battleCry){
        this.battleCry = battleCry;
    }
    public void perform(){

    }

    @Override
    public void toShoot() {
        System.out.println("While reciting ...");
        battleCry.recite();
    }
}
