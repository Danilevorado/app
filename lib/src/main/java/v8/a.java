package v8;

import n7.l;
import sa.b;
import y7.e;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static a f27906b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final e f27907a;

    private a() {
        e eVarS;
        if (l.i() != null) {
            eVarS = l.i().s();
        } else {
            l.o();
            eVarS = null;
        }
        this.f27907a = eVarS;
    }

    public static a a() {
        return f27906b;
    }

    public void b(String str, b bVar) {
        e eVar = this.f27907a;
        if (eVar != null) {
            eVar.f(str, bVar, null);
        }
    }
}
