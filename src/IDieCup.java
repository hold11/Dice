import java.util.Collection;

/**
 * Created by AndersWOlsen on 09-10-2016.
 */
public interface IDieCup {
    void roll();

    void addDice(Die die);
    void addDice(Collection<Die> dice);

    void removeDice(Die die);
    void removeDice(Collection<Die> dice);
}
