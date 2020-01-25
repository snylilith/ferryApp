package pl.exercise.ferry;

public class Singleton {
    private Singleton (){
        if (Holder.INSTANCE != null){
            throw new IllegalStateException("Singleton already constructed");
        }
    }
    public static Singleton getInstance(){
        return Holder.INSTANCE;
    }
    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();
    }
}
