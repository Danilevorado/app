package c9;

import a9.g;
import a9.i;
import a9.j;
import c9.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f5078a = new AtomicBoolean(false);

    e() {
        i.f(b.c.class, new j() { // from class: c9.d
            @Override // a9.j
            public final void a(g gVar) {
                this.f5077a.d((b.c) gVar);
            }
        });
        i.f(b.C0087b.class, new j() { // from class: c9.c
            @Override // a9.j
            public final void a(g gVar) {
                this.f5076a.c((b.C0087b) gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(b.C0087b c0087b) {
        this.f5078a.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(b.c cVar) {
        this.f5078a.set(true);
    }

    boolean e() {
        return this.f5078a.get();
    }
}
