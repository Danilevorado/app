package com.google.firebase.installations;

import android.text.TextUtils;
import b5.j;
import b5.l;
import com.google.firebase.installations.d;
import e4.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l6.d;
import l6.f;

/* loaded from: classes.dex */
public class c implements i6.d {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f21359m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f21360n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final v5.d f21361a;

    /* renamed from: b, reason: collision with root package name */
    private final l6.c f21362b;

    /* renamed from: c, reason: collision with root package name */
    private final k6.c f21363c;

    /* renamed from: d, reason: collision with root package name */
    private final i f21364d;

    /* renamed from: e, reason: collision with root package name */
    private final k6.b f21365e;

    /* renamed from: f, reason: collision with root package name */
    private final i6.f f21366f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f21367g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f21368h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f21369i;

    /* renamed from: j, reason: collision with root package name */
    private String f21370j;

    /* renamed from: k, reason: collision with root package name */
    private Set f21371k;

    /* renamed from: l, reason: collision with root package name */
    private final List f21372l;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f21373a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f21373a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21374a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21375b;

        static {
            int[] iArr = new int[f.b.values().length];
            f21375b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21375b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21375b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f21374a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21374a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(ExecutorService executorService, v5.d dVar, l6.c cVar, k6.c cVar2, i iVar, k6.b bVar, i6.f fVar) {
        this.f21367g = new Object();
        this.f21371k = new HashSet();
        this.f21372l = new ArrayList();
        this.f21361a = dVar;
        this.f21362b = cVar;
        this.f21363c = cVar2;
        this.f21364d = iVar;
        this.f21365e = bVar;
        this.f21366f = fVar;
        this.f21368h = executorService;
        this.f21369i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f21360n);
    }

    c(v5.d dVar, h6.b bVar) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f21360n), dVar, new l6.c(dVar.j(), bVar), new k6.c(dVar), i.c(), new k6.b(dVar), new i6.f());
    }

    private void A(k6.d dVar) {
        synchronized (this.f21367g) {
            Iterator it = this.f21372l.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void B(String str) {
        this.f21370j = str;
    }

    private synchronized void C(k6.d dVar, k6.d dVar2) {
        if (this.f21371k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            Iterator it = this.f21371k.iterator();
            while (it.hasNext()) {
                ((j6.a) it.next()).a(dVar2.d());
            }
        }
    }

    private b5.i e() {
        j jVar = new j();
        g(new e(this.f21364d, jVar));
        return jVar.a();
    }

    private b5.i f() {
        j jVar = new j();
        g(new f(jVar));
        return jVar.a();
    }

    private void g(h hVar) {
        synchronized (this.f21367g) {
            this.f21372l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void t(boolean z10) {
        k6.d dVarY;
        Exception iOException;
        k6.d dVarP = p();
        try {
            if (dVarP.i() || dVarP.l()) {
                dVarY = y(dVarP);
            } else {
                if (!z10 && !this.f21364d.f(dVarP)) {
                    return;
                }
                dVarY = j(dVarP);
            }
            s(dVarY);
            C(dVarP, dVarY);
            if (dVarY.k()) {
                B(dVarY.d());
            }
            if (dVarY.i()) {
                iOException = new d(d.a.BAD_CONFIG);
            } else {
                if (!dVarY.j()) {
                    A(dVarY);
                    return;
                }
                iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            z(iOException);
        } catch (d e5) {
            z(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void v(final boolean z10) {
        k6.d dVarQ = q();
        if (z10) {
            dVarQ = dVarQ.p();
        }
        A(dVarQ);
        this.f21369i.execute(new Runnable() { // from class: i6.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f24329m.t(z10);
            }
        });
    }

    private k6.d j(k6.d dVar) throws d {
        l6.f fVarE = this.f21362b.e(k(), dVar.d(), r(), dVar.f());
        int i10 = b.f21375b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f21364d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        B(null);
        return dVar.r();
    }

    private synchronized String m() {
        return this.f21370j;
    }

    public static c n() {
        return o(v5.d.k());
    }

    public static c o(v5.d dVar) {
        p.b(dVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) dVar.i(i6.d.class);
    }

    private k6.d p() {
        k6.d dVarD;
        synchronized (f21359m) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f21361a.j(), "generatefid.lock");
            try {
                dVarD = this.f21363c.d();
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
        return dVarD;
    }

    private k6.d q() {
        k6.d dVarD;
        synchronized (f21359m) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f21361a.j(), "generatefid.lock");
            try {
                dVarD = this.f21363c.d();
                if (dVarD.j()) {
                    dVarD = this.f21363c.b(dVarD.t(x(dVarD)));
                }
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
        return dVarD;
    }

    private void s(k6.d dVar) {
        synchronized (f21359m) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f21361a.j(), "generatefid.lock");
            try {
                this.f21363c.b(dVar);
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        v(false);
    }

    private void w() {
        p.g(l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.g(r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.g(k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(i.h(l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(i.g(k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String x(k6.d dVar) {
        if ((!this.f21361a.l().equals("CHIME_ANDROID_SDK") && !this.f21361a.r()) || !dVar.m()) {
            return this.f21366f.a();
        }
        String strF = this.f21365e.f();
        return TextUtils.isEmpty(strF) ? this.f21366f.a() : strF;
    }

    private k6.d y(k6.d dVar) throws d {
        l6.d dVarD = this.f21362b.d(k(), dVar.d(), r(), l(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f21365e.i());
        int i10 = b.f21374a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f21364d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void z(Exception exc) {
        synchronized (this.f21367g) {
            Iterator it = this.f21372l.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).b(exc)) {
                    it.remove();
                }
            }
        }
    }

    @Override // i6.d
    public b5.i a(final boolean z10) {
        w();
        b5.i iVarE = e();
        this.f21368h.execute(new Runnable() { // from class: i6.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f24331m.v(z10);
            }
        });
        return iVarE;
    }

    @Override // i6.d
    public b5.i getId() {
        w();
        String strM = m();
        if (strM != null) {
            return l.e(strM);
        }
        b5.i iVarF = f();
        this.f21368h.execute(new Runnable() { // from class: i6.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f24328m.u();
            }
        });
        return iVarF;
    }

    String k() {
        return this.f21361a.m().a();
    }

    String l() {
        return this.f21361a.m().b();
    }

    String r() {
        return this.f21361a.m().d();
    }
}
