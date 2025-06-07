package y7;

import a9.i;
import a9.j;
import a9.n;
import android.text.TextUtils;
import ga.b;
import java.util.HashMap;
import java.util.Map;
import m9.h;
import n7.l;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private final va.c f28588e;

    /* renamed from: f, reason: collision with root package name */
    private f f28589f;

    /* renamed from: g, reason: collision with root package name */
    private j f28590g;

    /* renamed from: b, reason: collision with root package name */
    private final Map f28585b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f28586c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final ka.d f28584a = ka.e.f();

    /* renamed from: d, reason: collision with root package name */
    private final h f28587d = b.c();

    class a implements j {
        a() {
        }

        @Override // a9.j
        public /* bridge */ /* synthetic */ void a(a9.g gVar) {
            a5.a.a(gVar);
            b(null);
        }

        public void b(n nVar) {
            i.g(n.class, this);
            e.this.c();
        }
    }

    public e(f fVar, va.c cVar) {
        this.f28589f = fVar;
        this.f28588e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str, o8.b bVar) {
        if (bVar.e() != null) {
            this.f28584a.A().b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(o8.a aVar, o8.b bVar) {
        if (!bVar.f()) {
            if (aVar != null) {
                aVar.a(o8.b.c((e8.b) bVar.e()));
            }
            k9.h.y("[InApp]PushwooshInApp", bVar.e() == null ? "" : ((e8.b) bVar.e()).getMessage(), bVar.e());
            return;
        }
        q9.b bVar2 = (q9.b) bVar.d();
        if (aVar != null) {
            aVar.a(o8.b.b(null));
        }
        if (bVar2 == null) {
            return;
        }
        if (this.f28584a.d().a()) {
            h(bVar2);
        } else {
            k9.h.l("[InApp]PushwooshInApp", "cant show inApp because all communication disable");
        }
    }

    private void h(q9.b bVar) {
        if (bVar == null) {
            k9.h.l("[InApp]PushwooshInApp", "resource is null, can not finds resource");
            return;
        }
        ga.b bVarF = new b.C0137b().d(bVar).f();
        ma.g gVarK = l.i().k();
        if (gVarK != null) {
            gVarK.k(bVarF);
        }
    }

    private void k() {
        if (this.f28590g != null) {
            return;
        }
        a aVar = new a();
        this.f28590g = aVar;
        i.f(n.class, aVar);
    }

    public void c() {
        va.c cVar = this.f28588e;
        if (cVar == null || cVar.a()) {
            this.f28589f.a();
        } else {
            k();
        }
    }

    public void d(String str, String str2, String str3, String str4, int i10, o8.a aVar) {
        this.f28587d.i(str, str2, str3, str4, i10, aVar);
    }

    public void f(String str, sa.b bVar, final o8.a aVar) {
        this.f28587d.j(str, bVar, new o8.a() { // from class: y7.d
            @Override // o8.a
            public final void a(o8.b bVar2) {
                this.f28582a.g(aVar, bVar2);
            }
        });
    }

    public Map i() throws IllegalAccessException, InstantiationException {
        HashMap map = new HashMap();
        map.putAll(this.f28585b);
        for (Map.Entry entry : this.f28586c.entrySet()) {
            String str = (String) entry.getKey();
            try {
                Object objNewInstance = Class.forName((String) entry.getValue()).newInstance();
                if (objNewInstance != null) {
                    map.put(str, objNewInstance);
                }
            } catch (Exception e5) {
                k9.h.y("[InApp]PushwooshInApp", "Failed to instantiate javascript interface for " + str, e5);
            }
        }
        return map;
    }

    public void j(String str) {
        final String strA = this.f28584a.A().a();
        if (TextUtils.equals(str, strA)) {
            return;
        }
        this.f28584a.A().b(str);
        this.f28587d.s(str, new o8.a() { // from class: y7.c
            @Override // o8.a
            public final void a(o8.b bVar) {
                this.f28580a.e(strA, bVar);
            }
        });
    }
}
