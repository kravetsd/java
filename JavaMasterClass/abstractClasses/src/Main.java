public class Main {
    private static UfcFighter MikeHunt = new MikeHunt();

    private static Ifighter Habib = new HabibNurmagomedow();

    public static void main(String[] args) {
        MikeHunt.musicToGo();
        Habib.playMusicToGo();

        boolean habibCanStrike = Habib.isStriker();

        if (habibCanStrike){
            System.out.println("Habib is trying to strike his oponent");
        } else {
            System.out.println("Habib's airlines are open!");
        }

        boolean HuntHasBelt=false;
        if (MikeHunt.isFormerChamp(HuntHasBelt)){
            System.out.println("Announcing Hunt as a former champ!!!");
        } else {
            System.out.println("Hunt is a pretender");
        };
    }
}
