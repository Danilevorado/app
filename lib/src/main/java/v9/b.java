package v9;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f27908a;

    public b(String str, Map map) {
        this.f27908a = b(str, map);
    }

    private Set b(String str, Map map) {
        if (map.containsKey(str)) {
            return (Set) map.get(str);
        }
        ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet();
        map.put(str, concurrentSkipListSet);
        return concurrentSkipListSet;
    }

    @Override // v9.a
    public Set a() {
        return Collections.unmodifiableSet(this.f27908a);
    }

    @Override // v9.a
    public void c(String str) {
        this.f27908a.add(str);
    }

    @Override // v9.a
    public void remove(String str) {
        this.f27908a.remove(str);
    }
}
