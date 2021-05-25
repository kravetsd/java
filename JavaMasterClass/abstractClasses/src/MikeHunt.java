public class MikeHunt extends UfcFighter {

    @Override
    public void musicToGo() {
        System.out.println("Playing New Zeland music");

    }

    @Override
    public void moneyForTheFight(int rate) {
        System.out.println("Is paid "+rate*2+" for a fight.");
    }
}
