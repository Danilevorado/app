package u1;

import java.util.Queue;

/* loaded from: classes.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f27538a = n2.l.e(20);

    c() {
    }

    abstract l a();

    l b() {
        l lVar = (l) this.f27538a.poll();
        return lVar == null ? a() : lVar;
    }

    public void c(l lVar) {
        if (this.f27538a.size() < 20) {
            this.f27538a.offer(lVar);
        }
    }
}
