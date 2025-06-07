package n7;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class i {

    /* renamed from: h, reason: collision with root package name */
    private static final i f25543h = new i();

    /* renamed from: a, reason: collision with root package name */
    private final w9.f f25544a;

    /* renamed from: b, reason: collision with root package name */
    private final n9.o f25545b;

    /* renamed from: c, reason: collision with root package name */
    private final h f25546c;

    /* renamed from: d, reason: collision with root package name */
    private final m9.h f25547d;

    /* renamed from: e, reason: collision with root package name */
    private final ia.b f25548e;

    /* renamed from: f, reason: collision with root package name */
    private final va.c f25549f;

    /* renamed from: g, reason: collision with root package name */
    private AtomicBoolean f25550g;

    private i() {
        va.c cVarM;
        l lVarI = l.i();
        if (lVarI == null) {
            l.o();
            cVarM = null;
            this.f25544a = null;
            this.f25545b = null;
            this.f25546c = null;
            this.f25547d = null;
            this.f25548e = null;
        } else {
            this.f25544a = lVarI.q();
            this.f25545b = lVarI.t();
            this.f25546c = lVarI.f();
            this.f25550g = new AtomicBoolean();
            this.f25547d = y7.b.c();
            this.f25548e = lVarI.h();
            cVarM = lVarI.m();
        }
        this.f25549f = cVarM;
    }

    private void a(o8.a aVar, boolean z10, sa.b bVar) {
        if (ka.e.d() == null || ka.e.d().h().a()) {
            w9.f fVar = this.f25544a;
            if (fVar != null) {
                fVar.e(aVar, z10, bVar);
                return;
            }
            return;
        }
        if (aVar != null) {
            aVar.a(o8.b.c(new e8.d("Communication with Pushwoosh is disabled. You have to enable the server communication to register for push notifications. To enable the server communication use startServerCommunication method.")));
        } else {
            k9.h.k("Communication with Pushwoosh is disabled. You have to enable the server communication to register for push notifications. To enable the server communication use startServerCommunication method.");
        }
    }

    public static i d() {
        return f25543h;
    }

    public String b() {
        return this.f25545b != null ? ka.e.f().a().a() : "";
    }

    public String c() {
        return this.f25544a != null ? this.f25545b.t() : "";
    }

    public void e(o8.a aVar) {
        n9.o oVar = this.f25545b;
        if (oVar != null) {
            oVar.h(aVar);
        }
    }

    public String f() {
        return ka.e.f().A().a();
    }

    public void g() {
        h(null);
    }

    public void h(o8.a aVar) {
        a(aVar, true, null);
    }

    public void i(sa.b bVar) {
        j(bVar);
    }

    public void j(sa.b bVar) {
        k(bVar, null);
    }

    public void k(sa.b bVar, o8.a aVar) {
        n9.o oVar = this.f25545b;
        if (oVar != null) {
            oVar.k(bVar, aVar);
        }
    }

    public void l(o8.a aVar) {
        if (ka.e.d() == null || ka.e.d().h().a()) {
            w9.f fVar = this.f25544a;
            if (fVar != null) {
                fVar.d(aVar);
                return;
            }
            return;
        }
        if (aVar != null) {
            aVar.a(o8.b.c(new e8.f("Communication with Pushwoosh is disabled. You have to enable the server communication to unregister from push notifications. To enable the server communication use startServerCommunication method.")));
        } else {
            k9.h.k("Communication with Pushwoosh is disabled. You have to enable the server communication to unregister from push notifications. To enable the server communication use startServerCommunication method.");
        }
    }
}
