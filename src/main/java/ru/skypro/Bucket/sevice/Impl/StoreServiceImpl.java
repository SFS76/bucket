package ru.skypro.Bucket.sevice.Impl;

import org.springframework.stereotype.Service;
import ru.skypro.Bucket.sevice.StoreService;

import java.util.List;
import java.util.Set;

@Service
public class StoreServiceImpl implements StoreService {

    private final BucketImpl bucket;
    public StoreServiceImpl (BucketImpl bucket) {
        this.bucket = bucket;
    }

    @Override
    public Set<Integer> add(List<Integer> goods) {
        return bucket.add(goods);
    }

    @Override
    public Set<Integer> get() {
        return bucket.get();
    }
}
