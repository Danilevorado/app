package da;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f22985a;

    public b(String str, Map map) {
        this.f22985a = d(str, map);
    }

    private Map d(String str, Map map) {
        if (map.containsKey(str)) {
            return (Map) map.get(str);
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        map.put(str, concurrentHashMap);
        return concurrentHashMap;
    }

    @Override // da.a
    public Set a() {
        return Collections.unmodifiableSet(this.f22985a.keySet());
    }

    @Override // da.a
    public void b(String str, Object obj) {
        this.f22985a.put(str, obj);
    }

    @Override // da.a
    public Object c(String str) {
        return this.f22985a.get(str);
    }

    @Override // da.a
    public boolean contains(String str) {
        return this.f22985a.containsKey(str);
    }

    @Override // da.a
    public Map getAll() {
        return this.f22985a;
    }

    @Override // da.a
    public void remove(String str) {
        this.f22985a.remove(str);
    }
}
