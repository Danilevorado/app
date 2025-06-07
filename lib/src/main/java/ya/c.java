package ya;

import java.io.File;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final File f28596a;

    /* renamed from: b, reason: collision with root package name */
    private final ReadWriteLock f28597b;

    /* renamed from: c, reason: collision with root package name */
    private final Lock f28598c;

    public c(String str, ra.b bVar, Map map, Map map2) {
        this.f28596a = bVar.a();
        this.f28597b = b(str, map);
        this.f28598c = d(str, map2);
    }

    private ReadWriteLock b(String str, Map map) {
        if (map.containsKey(str)) {
            return (ReadWriteLock) map.get(str);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(true);
        map.put(str, reentrantReadWriteLock);
        return reentrantReadWriteLock;
    }

    private Lock d(String str, Map map) {
        if (map.containsKey(str)) {
            return (Lock) map.get(str);
        }
        b bVar = new b(new File(this.f28596a, str + ".lock"));
        map.put(str, bVar);
        return bVar;
    }

    @Override // ya.a
    public Lock a() {
        return this.f28597b.readLock();
    }

    @Override // ya.a
    public Lock c() {
        return this.f28598c;
    }

    @Override // ya.a
    public Lock e() {
        return this.f28597b.writeLock();
    }
}
