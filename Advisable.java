package interfaces;

public interface Advisable {
    
    public final static String advice = "Beginner";
    
    public abstract void giveAdvice();
    default void giveSpecialAdvice(){
        System.out.println("give special advice");
    }
    
    static void giveStaticAdvice(){
        System.out.println("give static advice");
    }
    
    
}
