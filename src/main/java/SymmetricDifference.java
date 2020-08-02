import java.util.HashSet;
import java.util.Set;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 *
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> newSet = new HashSet<>();

        for (T value: set1) {
            if (!set2.contains(value)) {
                newSet.add(value);
            }
        }

        for (T value: set2) {
            if (!set1.contains(value)) {
                newSet.add(value);
            }
        }

        return newSet;
    }
}
