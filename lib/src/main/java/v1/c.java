package v1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import n2.k;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27813a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f27814b = new b();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f27815a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f27816b;

        a() {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue f27817a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f27817a) {
                aVar = (a) this.f27817a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f27817a) {
                if (this.f27817a.size() < 10) {
                    this.f27817a.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            aVarA = (a) this.f27813a.get(str);
            if (aVarA == null) {
                aVarA = this.f27814b.a();
                this.f27813a.put(str, aVarA);
            }
            aVarA.f27816b++;
        }
        aVarA.f27815a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) k.d(this.f27813a.get(str));
            int i10 = aVar.f27816b;
            if (i10 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f27816b);
            }
            int i11 = i10 - 1;
            aVar.f27816b = i11;
            if (i11 == 0) {
                a aVar2 = (a) this.f27813a.remove(str);
                if (!aVar2.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                }
                this.f27814b.b(aVar2);
            }
        }
        aVar.f27815a.unlock();
    }
}
