package ru.skypro.Bucket.sevice;

import java.util.List;
import java.util.Set;

public interface StoreService {
    Set<Integer> add(List<Integer> goods);
    Set<Integer> get();
}
