package com.pushwoosh;

import a9.i;
import a9.j;
import a9.k;
import a9.n;
import android.text.TextUtils;
import android.util.Log;
import c9.b;
import com.pushwoosh.BootReceiver;
import ia.b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k9.h;
import n9.o;
import r7.g;
import w9.f;
import y7.e;
import z7.c;
import z7.d;

/* loaded from: classes.dex */
public class a {

    /* renamed from: p, reason: collision with root package name */
    public static final String f22565p = "b";

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f22566a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f22567b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f22568c = new AtomicReference("");

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f22569d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final d f22570e;

    /* renamed from: f, reason: collision with root package name */
    private final ka.d f22571f;

    /* renamed from: g, reason: collision with root package name */
    private final c f22572g;

    /* renamed from: h, reason: collision with root package name */
    private final o f22573h;

    /* renamed from: i, reason: collision with root package name */
    private final f f22574i;

    /* renamed from: j, reason: collision with root package name */
    private final e f22575j;

    /* renamed from: k, reason: collision with root package name */
    private final n9.e f22576k;

    /* renamed from: l, reason: collision with root package name */
    private final g f22577l;

    /* renamed from: m, reason: collision with root package name */
    private final b f22578m;

    /* renamed from: n, reason: collision with root package name */
    private final va.c f22579n;

    /* renamed from: o, reason: collision with root package name */
    private j f22580o;

    /* renamed from: com.pushwoosh.a$a, reason: collision with other inner class name */
    class C0114a implements j {
        C0114a() {
        }

        @Override // a9.j
        public /* bridge */ /* synthetic */ void a(a9.g gVar) {
            a5.a.a(gVar);
            b(null);
        }

        public void b(n nVar) {
            i.g(n.class, this);
            a.this.F();
        }
    }

    public a(d dVar, ka.d dVar2, c cVar, o oVar, f fVar, e eVar, n9.e eVar2, g gVar, b bVar, va.c cVar2) {
        this.f22570e = dVar;
        this.f22571f = dVar2;
        this.f22572g = cVar;
        this.f22573h = oVar;
        this.f22574i = fVar;
        this.f22575j = eVar;
        this.f22576k = eVar2;
        this.f22577l = gVar;
        this.f22578m = bVar;
        this.f22579n = cVar2;
    }

    private void A() {
        if (this.f22569d.compareAndSet(false, true)) {
            i.f(b.d.class, new j() { // from class: n7.r
                @Override // a9.j
                public final void a(a9.g gVar) {
                    this.f25606a.s((b.d) gVar);
                }
            });
        }
    }

    private void B() {
        va.c cVar = this.f22579n;
        if (cVar == null || cVar.a()) {
            F();
        } else {
            H();
        }
    }

    private void D() {
        h.g("sendAppOpenEndTagMigrate");
        if (((String) this.f22568c.get()).isEmpty()) {
            return;
        }
        this.f22573h.A();
    }

    private void E() {
        if (this.f22566a.get()) {
            this.f22572g.f();
            if (this.f22567b.get()) {
                this.f22573h.A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        if (TextUtils.isEmpty(this.f22571f.A().a())) {
            this.f22575j.j(this.f22571f.k().a());
        }
    }

    private void G() {
        i.f(b.d.class, new j() { // from class: n7.t
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f25608a.v((b.d) gVar);
            }
        });
        h.g("appOpen:" + this.f22566a.get() + " onAppReady:" + this.f22567b.get());
        if (this.f22566a.get()) {
            if (this.f22567b.get()) {
                D();
                B();
            }
            i.f(f.b.class, new j() { // from class: n7.w
                @Override // a9.j
                public final void a(a9.g gVar) {
                    this.f25611a.w((f.b) gVar);
                }
            });
        } else {
            a9.f.d(a9.f.c(b.d.class), a9.f.c(f.b.class)).a(new j() { // from class: n7.u
                @Override // a9.j
                public final void a(a9.g gVar) {
                    this.f25609a.y((b.d) gVar);
                }
            });
        }
        i.f(BootReceiver.a.class, new j() { // from class: n7.q
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f25605a.n((BootReceiver.a) gVar);
            }
        });
    }

    private void H() {
        if (this.f22580o != null) {
            return;
        }
        C0114a c0114a = new C0114a();
        this.f22580o = c0114a;
        i.f(n.class, c0114a);
    }

    private void j() {
        Log.i("Pushwoosh", "HWID: " + this.f22571f.k().a());
        h.h("PushwooshModule", "onApplicationCreated");
        h.s(f22565p, String.format("This is %s device", j9.b.d().j()));
        Iterator it = this.f22570e.q().iterator();
        while (it.hasNext()) {
            ((w8.a) it.next()).a();
        }
    }

    private void k(final a9.o oVar, final a9.o oVar2) {
        h.g("initHwid");
        w7.a.c(new w7.f() { // from class: n7.y
            @Override // w7.f
            public final void c(String str) {
                this.f25613a.l(oVar, oVar2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(b.d dVar) {
        this.f22566a.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(BootReceiver.a aVar) {
        this.f22574i.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void l(String str, a9.o oVar, a9.o oVar2) {
        this.f22568c.set(str);
        this.f22571f.k().b((String) this.f22568c.get());
        i.e(new k((String) this.f22568c.get()));
        E();
        G();
        oVar.a();
        oVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(f.b bVar) {
        this.f22567b.set(true);
    }

    private void r() {
        try {
            new s8.b(c9.a.b()).c();
        } catch (Exception e5) {
            h.l(f22565p, "Failed to migrate group notifications channel" + e5.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(b.d dVar) {
        this.f22573h.x();
        this.f22576k.j();
        this.f22575j.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(f.b bVar) {
        A();
    }

    private void u() {
        h.g("onAppOpen");
        this.f22572g.f();
        this.f22566a.set(true);
        if (this.f22567b.get()) {
            D();
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(b.d dVar) {
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(f.b bVar) {
        D();
        B();
    }

    private void x() {
        h.g("onAppReady");
        if (this.f22566a.get()) {
            D();
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(b.d dVar) {
        x();
    }

    public void C() {
        this.f22569d.set(false);
    }

    public void z() {
        h.t();
        a9.o oVarF = i.f(b.d.class, new j() { // from class: n7.s
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f25607a.m((b.d) gVar);
            }
        });
        a9.o oVarF2 = i.f(f.b.class, new j() { // from class: n7.x
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f25612a.q((f.b) gVar);
            }
        });
        a9.f.d(a9.f.c(f.b.class), a9.f.c(k.class)).a(new j() { // from class: n7.v
            @Override // a9.j
            public final void a(a9.g gVar) {
                this.f25610a.t((f.b) gVar);
            }
        });
        if (!this.f22578m.g()) {
            this.f22574i.k();
        }
        this.f22574i.l();
        k(oVarF, oVarF2);
        j();
        r();
        this.f22577l.f();
    }
}
