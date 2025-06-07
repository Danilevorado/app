package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.q0;
import com.google.firebase.messaging.v0;
import g6.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: o, reason: collision with root package name */
    private static final long f21388o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p, reason: collision with root package name */
    private static v0 f21389p;

    /* renamed from: q, reason: collision with root package name */
    static p2.g f21390q;

    /* renamed from: r, reason: collision with root package name */
    static ScheduledExecutorService f21391r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f21392s = 0;

    /* renamed from: a, reason: collision with root package name */
    private final v5.d f21393a;

    /* renamed from: b, reason: collision with root package name */
    private final g6.a f21394b;

    /* renamed from: c, reason: collision with root package name */
    private final i6.d f21395c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f21396d;

    /* renamed from: e, reason: collision with root package name */
    private final c0 f21397e;

    /* renamed from: f, reason: collision with root package name */
    private final q0 f21398f;

    /* renamed from: g, reason: collision with root package name */
    private final a f21399g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f21400h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f21401i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f21402j;

    /* renamed from: k, reason: collision with root package name */
    private final b5.i f21403k;

    /* renamed from: l, reason: collision with root package name */
    private final h0 f21404l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21405m;

    /* renamed from: n, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f21406n;

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* renamed from: a, reason: collision with root package name */
        private final e6.d f21407a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f21408b;

        /* renamed from: c, reason: collision with root package name */
        private e6.b f21409c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f21410d;

        a(e6.d dVar) {
            this.f21407a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(e6.a aVar) {
            if (c()) {
                FirebaseMessaging.this.H();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextJ = FirebaseMessaging.this.f21393a.j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextJ.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            if (this.f21408b) {
                return;
            }
            Boolean boolE = e();
            this.f21410d = boolE;
            if (boolE == null) {
                e6.b bVar = new e6.b() { // from class: com.google.firebase.messaging.z
                    @Override // e6.b
                    public final void a(e6.a aVar) {
                        this.f21607a.d(aVar);
                    }
                };
                this.f21409c = bVar;
                this.f21407a.b(v5.a.class, bVar);
            }
            this.f21408b = true;
        }

        synchronized boolean c() {
            Boolean bool;
            b();
            bool = this.f21410d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f21393a.q();
        }
    }

    FirebaseMessaging(v5.d dVar, g6.a aVar, h6.b bVar, h6.b bVar2, i6.d dVar2, p2.g gVar, e6.d dVar3) {
        this(dVar, aVar, bVar, bVar2, dVar2, gVar, dVar3, new h0(dVar.j()));
    }

    FirebaseMessaging(v5.d dVar, g6.a aVar, h6.b bVar, h6.b bVar2, i6.d dVar2, p2.g gVar, e6.d dVar3, h0 h0Var) {
        this(dVar, aVar, dVar2, gVar, dVar3, h0Var, new c0(dVar, h0Var, bVar, bVar2, dVar2), n.f(), n.c(), n.b());
    }

    FirebaseMessaging(v5.d dVar, g6.a aVar, i6.d dVar2, p2.g gVar, e6.d dVar3, h0 h0Var, c0 c0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f21405m = false;
        f21390q = gVar;
        this.f21393a = dVar;
        this.f21394b = aVar;
        this.f21395c = dVar2;
        this.f21399g = new a(dVar3);
        Context contextJ = dVar.j();
        this.f21396d = contextJ;
        p pVar = new p();
        this.f21406n = pVar;
        this.f21404l = h0Var;
        this.f21401i = executor;
        this.f21397e = c0Var;
        this.f21398f = new q0(executor);
        this.f21400h = executor2;
        this.f21402j = executor3;
        Context contextJ2 = dVar.j();
        if (contextJ2 instanceof Application) {
            ((Application) contextJ2).registerActivityLifecycleCallbacks(pVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextJ2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.d(new a.InterfaceC0135a() { // from class: com.google.firebase.messaging.t
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f21582m.C();
            }
        });
        b5.i iVarE = a1.e(this, h0Var, c0Var, contextJ, n.g());
        this.f21403k = iVarE;
        iVarE.e(executor2, new b5.f() { // from class: com.google.firebase.messaging.q
            @Override // b5.f
            public final void b(Object obj) {
                this.f21558a.D((a1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f21575m.E();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(b5.j jVar) {
        try {
            b5.l.a(this.f21397e.c());
            p(this.f21396d).d(q(), h0.c(this.f21393a));
            jVar.c(null);
        } catch (Exception e5) {
            jVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(b5.j jVar) {
        try {
            jVar.c(k());
        } catch (Exception e5) {
            jVar.b(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        if (v()) {
            H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(a1 a1Var) {
        if (v()) {
            a1Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        l0.c(this.f21396d);
    }

    private synchronized void G() {
        if (!this.f21405m) {
            I(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        g6.a aVar = this.f21394b;
        if (aVar != null) {
            aVar.c();
        } else if (J(s())) {
            G();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(v5.d dVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) dVar.i(FirebaseMessaging.class);
        e4.p.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging o() {
        return getInstance(v5.d.k());
    }

    private static synchronized v0 p(Context context) {
        if (f21389p == null) {
            f21389p = new v0(context);
        }
        return f21389p;
    }

    private String q() {
        return "[DEFAULT]".equals(this.f21393a.l()) ? "" : this.f21393a.n();
    }

    public static p2.g t() {
        return f21390q;
    }

    private void u(String str) {
        if ("[DEFAULT]".equals(this.f21393a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f21393a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f21396d).i(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b5.i x(final String str, final v0.a aVar) {
        return this.f21397e.f().o(this.f21402j, new b5.h() { // from class: com.google.firebase.messaging.r
            @Override // b5.h
            public final b5.i a(Object obj) {
                return this.f21561a.y(str, aVar, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b5.i y(String str, v0.a aVar, String str2) {
        p(this.f21396d).g(q(), str, str2, this.f21404l.a());
        if (aVar == null || !str2.equals(aVar.f21585a)) {
            u(str2);
        }
        return b5.l.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(b5.j jVar) {
        try {
            this.f21394b.b(h0.c(this.f21393a), "FCM");
            jVar.c(null);
        } catch (Exception e5) {
            jVar.b(e5);
        }
    }

    synchronized void F(boolean z10) {
        this.f21405m = z10;
    }

    synchronized void I(long j10) {
        m(new w0(this, Math.min(Math.max(30L, 2 * j10), f21388o)), j10);
        this.f21405m = true;
    }

    boolean J(v0.a aVar) {
        return aVar == null || aVar.b(this.f21404l.a());
    }

    String k() throws IOException {
        g6.a aVar = this.f21394b;
        if (aVar != null) {
            try {
                return (String) b5.l.a(aVar.a());
            } catch (InterruptedException | ExecutionException e5) {
                throw new IOException(e5);
            }
        }
        final v0.a aVarS = s();
        if (!J(aVarS)) {
            return aVarS.f21585a;
        }
        final String strC = h0.c(this.f21393a);
        try {
            return (String) b5.l.a(this.f21398f.b(strC, new q0.a() { // from class: com.google.firebase.messaging.s
                @Override // com.google.firebase.messaging.q0.a
                public final b5.i start() {
                    return this.f21565a.x(strC, aVarS);
                }
            }));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public b5.i l() {
        if (this.f21394b != null) {
            final b5.j jVar = new b5.j();
            this.f21400h.execute(new Runnable() { // from class: com.google.firebase.messaging.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21588m.z(jVar);
                }
            });
            return jVar.a();
        }
        if (s() == null) {
            return b5.l.e(null);
        }
        final b5.j jVar2 = new b5.j();
        n.e().execute(new Runnable() { // from class: com.google.firebase.messaging.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f21601m.A(jVar2);
            }
        });
        return jVar2.a();
    }

    void m(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f21391r == null) {
                f21391r = new ScheduledThreadPoolExecutor(1, new j4.b("TAG"));
            }
            f21391r.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    Context n() {
        return this.f21396d;
    }

    public b5.i r() {
        g6.a aVar = this.f21394b;
        if (aVar != null) {
            return aVar.a();
        }
        final b5.j jVar = new b5.j();
        this.f21400h.execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f21595m.B(jVar);
            }
        });
        return jVar.a();
    }

    v0.a s() {
        return p(this.f21396d).e(q(), h0.c(this.f21393a));
    }

    public boolean v() {
        return this.f21399g.c();
    }

    boolean w() {
        return this.f21404l.g();
    }
}
