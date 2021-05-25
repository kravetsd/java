public class HabibNurmagomedow implements Ifighter {
    @Override
    public boolean isStriker() {
        return false;
    }

    @Override
    public boolean isGrappler() {
        return true;
    }

    @Override
    public void playMusicToGo() {
        System.out.println("Play lezginka");
    }
}
