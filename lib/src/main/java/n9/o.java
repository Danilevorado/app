package n9;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final b9.e f25636a;

    /* renamed from: b, reason: collision with root package name */
    private final r f25637b;

    /* renamed from: c, reason: collision with root package name */
    private final ka.d f25638c;

    /* renamed from: d, reason: collision with root package name */
    private final ka.h f25639d;

    /* renamed from: e, reason: collision with root package name */
    private final va.b f25640e;

    /* renamed from: f, reason: collision with root package name */
    private final va.c f25641f;

    /* renamed from: g, reason: collision with root package name */
    private String f25642g;

    /* renamed from: h, reason: collision with root package name */
    private String f25643h;

    /* renamed from: i, reason: collision with root package name */
    private String f25644i;

    /* renamed from: j, reason: collision with root package name */
    private List f25645j;

    /* renamed from: k, reason: collision with root package name */
    private List f25646k;

    /* renamed from: l, reason: collision with root package name */
    private String f25647l;

    /* renamed from: m, reason: collision with root package name */
    private p9.b f25648m;

    /* renamed from: n, reason: collision with root package name */
    private a9.j f25649n;

    /* renamed from: o, reason: collision with root package name */
    private a9.j f25650o;

    class a implements a9.j {
        a() {
        }

        @Override // a9.j
        public /* bridge */ /* synthetic */ void a(a9.g gVar) {
            a5.a.a(gVar);
            b(null);
        }

        public void b(a9.n nVar) {
            a9.i.g(a9.n.class, this);
            o.this.A();
        }
    }

    class b implements a9.j {
        b() {
        }

        @Override // a9.j
        public /* bridge */ /* synthetic */ void a(a9.g gVar) {
            a5.a.a(gVar);
            b(null);
        }

        public void b(a9.n nVar) {
            a9.i.g(a9.n.class, this);
            o.this.x();
        }
    }

    public o(b9.e eVar, r rVar, final ka.d dVar, ka.h hVar, va.b bVar, p9.b bVar2, va.c cVar) {
        JSONObject jSONObjectB;
        this.f25636a = eVar;
        this.f25637b = rVar;
        this.f25638c = dVar;
        this.f25639d = hVar;
        this.f25640e = bVar;
        this.f25648m = bVar2;
        this.f25641f = cVar;
        if (!dVar.z().a() || (jSONObjectB = hVar.x().b()) == null) {
            return;
        }
        k9.h.g("Resending application tags");
        rVar.d(jSONObjectB, new o8.a() { // from class: n9.l
            @Override // o8.a
            public final void a(o8.b bVar3) {
                o.g(dVar, bVar3);
            }
        });
    }

    private void B() {
        if (this.f25649n != null) {
            return;
        }
        b bVar = new b();
        this.f25649n = bVar;
        a9.i.f(a9.n.class, bVar);
    }

    private void C() {
        if (this.f25650o != null) {
            return;
        }
        a aVar = new a();
        this.f25650o = aVar;
        a9.i.f(a9.n.class, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(ka.d dVar, o8.b bVar) {
        if (bVar.f()) {
            dVar.z().b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(o8.a aVar, o8.b bVar) {
        o8.b bVarC;
        sa.b bVarB;
        if (aVar != null) {
            if (bVar.f()) {
                bVarB = bVar.d() == null ? sa.a.a() : (sa.b) bVar.d();
                this.f25639d.x().d(bVarB.b());
            } else {
                JSONObject jSONObjectB = this.f25639d.x().b();
                if (jSONObjectB == null) {
                    bVarC = o8.b.c(new e8.a(bVar.e() == null ? "" : ((b9.a) bVar.e()).getMessage()));
                    aVar.a(bVarC);
                }
                bVarB = sa.a.b(jSONObjectB);
            }
            bVarC = o8.b.b(bVarB);
            aVar.a(bVarC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(o8.b bVar) {
        p9.a aVar = (p9.a) bVar.d();
        if (aVar != null) {
            this.f25645j = aVar.a();
            this.f25646k = aVar.b();
            this.f25647l = aVar.d();
            p9.b bVar2 = this.f25648m;
            if (bVar2 != null) {
                bVar2.a().b(aVar.c());
            }
            a9.i.e(new a9.b());
        }
    }

    public void A() {
        va.c cVar = this.f25641f;
        if (cVar != null && !cVar.a()) {
            C();
            return;
        }
        n9.a aVar = new n9.a();
        b9.e eVar = this.f25636a;
        if (eVar == null) {
            return;
        }
        eVar.b(aVar, new v7.a(aVar, this.f25640e));
        b8.n nVarD = n7.l.i().d();
        nVarD.e("welcome-inapp", null);
        nVarD.e("app-update-message", null);
    }

    public List d() {
        return this.f25645j;
    }

    public void e(String str) {
        this.f25644i = str;
    }

    public void f(String str, String str2) {
        i iVar = new i(str, str2);
        b9.e eVar = this.f25636a;
        if (eVar == null) {
            return;
        }
        eVar.b(iVar, new v7.a(iVar, this.f25640e));
    }

    public void h(final o8.a aVar) {
        f fVar = new f();
        b9.e eVar = this.f25636a;
        if (eVar != null) {
            eVar.b(fVar, new o8.a() { // from class: n9.n
                @Override // o8.a
                public final void a(o8.b bVar) {
                    this.f25634a.i(aVar, bVar);
                }
            });
        } else if (aVar != null) {
            aVar.a(o8.b.c(new e8.a("Request Manager is null")));
        }
    }

    public void k(sa.b bVar, o8.a aVar) {
        JSONObject jSONObjectB = bVar.b();
        try {
            this.f25639d.x().c(jSONObjectB);
        } catch (Exception e5) {
            k9.h.o(e5);
        }
        this.f25637b.d(jSONObjectB, aVar);
    }

    public void l(boolean z10) {
        this.f25638c.d().b(z10);
    }

    public String m() {
        return this.f25644i;
    }

    public void n(String str) {
        this.f25643h = str;
    }

    public void o(String str, String str2) {
        if (str != null && TextUtils.equals(str, this.f25639d.i().a())) {
            k9.h.w("Push stat for (" + str + ") already sent");
            return;
        }
        this.f25639d.i().b(str);
        k kVar = new k(str, str2);
        b9.e eVar = this.f25636a;
        if (eVar == null) {
            return;
        }
        eVar.b(kVar, new v7.a(kVar, this.f25640e));
    }

    public String p() {
        return this.f25643h;
    }

    public void q(String str) {
        this.f25642g = str;
    }

    public String r() {
        return this.f25642g;
    }

    public List s() {
        return this.f25646k;
    }

    public String t() {
        return this.f25638c.k().a();
    }

    public boolean u() {
        return this.f25638c.d().a();
    }

    public boolean v() {
        return this.f25638c.v().a();
    }

    public boolean w() {
        return this.f25638c.h().a();
    }

    public void x() {
        va.c cVar = this.f25641f;
        if (cVar != null && !cVar.a()) {
            B();
            return;
        }
        b9.e eVar = this.f25636a;
        if (eVar == null) {
            return;
        }
        eVar.b(new p9.d(), new o8.a() { // from class: n9.m
            @Override // o8.a
            public final void a(o8.b bVar) {
                this.f25633a.j(bVar);
            }
        });
    }

    public void y() {
        f fVar = new f();
        b9.e eVar = this.f25636a;
        if (eVar == null) {
            return;
        }
        o8.b bVarD = eVar.d(fVar);
        if (!bVarD.f() || bVarD.d() == null) {
            return;
        }
        JSONObject jSONObjectB = ((sa.b) bVarD.d()).b();
        if (jSONObjectB.length() > 0) {
            this.f25639d.x().d(jSONObjectB);
        }
    }

    public void z() {
        this.f25639d.x().d(null);
        this.f25638c.v().b(true);
    }
}
