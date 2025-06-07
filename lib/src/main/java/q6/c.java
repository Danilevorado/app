package q6;

import java.util.Iterator;
import java.util.Set;
import x5.q;

/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f26309a;

    /* renamed from: b, reason: collision with root package name */
    private final d f26310b;

    c(Set set, d dVar) {
        this.f26309a = e(set);
        this.f26310b = dVar;
    }

    public static x5.d c() {
        return x5.d.c(i.class).b(q.k(f.class)).f(new x5.h() { // from class: q6.b
            @Override // x5.h
            public final Object a(x5.e eVar) {
                return c.d(eVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(x5.e eVar) {
        return new c(eVar.b(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // q6.i
    public String a() {
        if (this.f26310b.b().isEmpty()) {
            return this.f26309a;
        }
        return this.f26309a + ' ' + e(this.f26310b.b());
    }
}
