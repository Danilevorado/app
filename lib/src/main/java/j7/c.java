package j7;

import com.onesignal.f3;
import com.onesignal.k3;
import com.onesignal.n2;
import com.onesignal.r1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final r1 f24547a;

    /* renamed from: b, reason: collision with root package name */
    private final f3 f24548b;

    /* renamed from: c, reason: collision with root package name */
    private final a f24549c;

    /* renamed from: d, reason: collision with root package name */
    private k7.c f24550d;

    public c(r1 r1Var, f3 f3Var, k3 k3Var, n2 n2Var) {
        rb.h.e(r1Var, "logger");
        rb.h.e(f3Var, "apiClient");
        this.f24547a = r1Var;
        this.f24548b = f3Var;
        rb.h.b(k3Var);
        rb.h.b(n2Var);
        this.f24549c = new a(r1Var, k3Var, n2Var);
    }

    private final d a() {
        return this.f24549c.j() ? new g(this.f24547a, this.f24549c, new h(this.f24548b)) : new e(this.f24547a, this.f24549c, new f(this.f24548b));
    }

    private final k7.c c() {
        if (!this.f24549c.j()) {
            k7.c cVar = this.f24550d;
            if (cVar instanceof e) {
                rb.h.b(cVar);
                return cVar;
            }
        }
        if (this.f24549c.j()) {
            k7.c cVar2 = this.f24550d;
            if (cVar2 instanceof g) {
                rb.h.b(cVar2);
                return cVar2;
            }
        }
        return a();
    }

    public final k7.c b() {
        return this.f24550d != null ? c() : a();
    }
}
