package services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty.");
        }
        T max = list.get(0);
        for (T item : list) {
            // compareTo generates a score for each value, if one is higher than the compareTo it will be > 0.
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
