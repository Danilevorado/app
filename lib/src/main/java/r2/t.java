package r2;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class t implements s {

    /* renamed from: e, reason: collision with root package name */
    private static volatile u f26533e;

    /* renamed from: a, reason: collision with root package name */
    private final b3.a f26534a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.a f26535b;

    /* renamed from: c, reason: collision with root package name */
    private final x2.e f26536c;

    /* renamed from: d, reason: collision with root package name */
    private final y2.r f26537d;

    t(b3.a aVar, b3.a aVar2, x2.e eVar, y2.r rVar, y2.v vVar) {
        this.f26534a = aVar;
        this.f26535b = aVar2;
        this.f26536c = eVar;
        this.f26537d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f26534a.a()).k(this.f26535b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f26533e;
        if (uVar != null) {
            return uVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(p2.b.b("proto"));
    }

    public static void f(Context context) {
        if (f26533e == null) {
            synchronized (t.class) {
                if (f26533e == null) {
                    f26533e = e.e().a(context).build();
                }
            }
        }
    }

    @Override // r2.s
    public void a(n nVar, p2.h hVar) {
        this.f26536c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public y2.r e() {
        return this.f26537d;
    }

    public p2.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.b()).c(fVar.getExtras()).a(), this);
    }
}
