public class BattleCry implements Speech {

    private static String[] LINES = {
            "Истинно! исстари",
            "слово мы слышим",
            "о доблести данов,",
            "о конунгах датских,",
            "чья слава в битвах",
            "была добыта!"};

    public BattleCry(){}

    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }


}
