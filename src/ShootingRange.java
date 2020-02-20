public class ShootingRange {
    private ShootingRange(){}
    private static class StageSingletonHolder{
        static ShootingRange instance = new ShootingRange();
    }
    public static ShootingRange getInstance(){
        return StageSingletonHolder.instance;
    }
}
