package b8;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ga.b;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private String f4533a;

    /* renamed from: b, reason: collision with root package name */
    private long f4534b;

    /* renamed from: c, reason: collision with root package name */
    private d f4535c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f4536d;

    /* renamed from: e, reason: collision with root package name */
    private e f4537e = new e(this, null);

    /* renamed from: f, reason: collision with root package name */
    private Date f4538f;

    /* renamed from: g, reason: collision with root package name */
    private String f4539g;

    /* renamed from: h, reason: collision with root package name */
    private z7.h f4540h;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.g(g.this);
        }
    }

    public interface b {
        void a(i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface c {
        boolean a(a9.g gVar);
    }

    public interface d {
        boolean a();
    }

    private class e {

        /* renamed from: a, reason: collision with root package name */
        private Object f4542a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0078g f4543b;

        private e() {
        }

        /* synthetic */ e(g gVar, a aVar) {
            this();
        }

        void a(InterfaceC0078g interfaceC0078g) {
            synchronized (this) {
                Object obj = this.f4542a;
                if (obj != null) {
                    interfaceC0078g.a(obj);
                } else {
                    this.f4543b = interfaceC0078g;
                }
            }
        }

        public void b(Object obj) {
            synchronized (this) {
                InterfaceC0078g interfaceC0078g = this.f4543b;
                if (interfaceC0078g != null) {
                    interfaceC0078g.a(obj);
                    this.f4543b = null;
                }
                this.f4542a = obj;
            }
        }
    }

    private class f implements a9.j {

        /* renamed from: a, reason: collision with root package name */
        private c f4545a;

        /* renamed from: b, reason: collision with root package name */
        private Class f4546b;

        /* renamed from: c, reason: collision with root package name */
        private f f4547c;

        f(Class cls, c cVar) {
            this.f4545a = cVar;
            this.f4546b = cls;
            a9.i.f(cls, this);
        }

        @Override // a9.j
        public void a(a9.g gVar) {
            if (this.f4545a.a(gVar)) {
                b();
            }
        }

        void b() {
            f fVar = this.f4547c;
            if (fVar != null) {
                if (fVar.f4547c == this) {
                    fVar.c(null);
                }
                this.f4547c.b();
            }
            a9.i.g(this.f4546b, this);
        }

        void c(f fVar) {
            this.f4547c = fVar;
        }
    }

    /* renamed from: b8.g$g, reason: collision with other inner class name */
    interface InterfaceC0078g {
        void a(Object obj);
    }

    public g(String str, float f5, SharedPreferences sharedPreferences, d dVar, z7.h hVar) {
        this.f4533a = str;
        this.f4534b = (long) (f5 * 8.64E7f);
        this.f4536d = sharedPreferences;
        this.f4535c = dVar;
        this.f4540h = hVar;
    }

    static /* synthetic */ b g(g gVar) {
        gVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Handler handler, final AtomicBoolean atomicBoolean, final AtomicBoolean atomicBoolean2, final b bVar, final String str) {
        handler.post(new Runnable() { // from class: b8.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f4525m.m(atomicBoolean, atomicBoolean2, str, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(f8.b bVar) {
        q9.b bVarA = bVar.a();
        if (bVarA == null) {
            k9.h.l("BusinessCase", "resource in event is null");
        } else if (TextUtils.equals(bVarA.l(), this.f4539g)) {
            a9.i.g(f8.b.class, new b8.a(this));
            new Handler().postDelayed(new a(), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(AtomicBoolean atomicBoolean, b bVar, AtomicBoolean atomicBoolean2) {
        if (atomicBoolean.get()) {
            return;
        }
        if (bVar != null) {
            bVar.a(i.LOADING_FAILED);
        }
        atomicBoolean2.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, final String str, final b bVar) {
        if (atomicBoolean.get()) {
            k9.h.h("BusinessCase", this.f4533a + " timeout Exceeded");
            return;
        }
        atomicBoolean2.set(true);
        s9.d dVarD = y7.b.d();
        q9.b bVarC = dVarD != null ? dVarD.c(str) : null;
        if (bVarC == null) {
            if (bVar != null) {
                bVar.a(i.LOADING_FAILED);
                return;
            }
            return;
        }
        if (bVar != null) {
            f fVar = new f(u9.b.class, new c() { // from class: b8.b
                @Override // b8.g.c
                public final boolean a(a9.g gVar) {
                    return g.p(str, (u9.b) gVar);
                }
            });
            f fVar2 = new f(u9.c.class, new c() { // from class: b8.c
                @Override // b8.g.c
                public final boolean a(a9.g gVar) {
                    return g.o(str, bVar, (u9.c) gVar);
                }
            });
            fVar.c(fVar2);
            fVar2.c(fVar);
        }
        ga.b bVarF = new b.C0137b().d(bVarC).f();
        this.f4539g = bVarC.l();
        a9.i.f(f8.b.class, new b8.a(this));
        ma.g gVarK = n7.l.i().k();
        if (gVarK != null) {
            gVarK.k(bVarF);
        }
        r();
    }

    private boolean n() {
        if (this.f4534b == 0) {
            return false;
        }
        long j10 = this.f4536d.getLong(this.f4533a, Long.MIN_VALUE);
        if (j10 != Long.MIN_VALUE) {
            this.f4538f = new Date(j10);
        }
        return this.f4538f != null && this.f4540h.b() - this.f4538f.getTime() < this.f4534b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o(String str, b bVar, u9.c cVar) {
        if (!cVar.a().l().equals(str)) {
            return false;
        }
        bVar.a(i.LOADING_FAILED);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean p(String str, u9.b bVar) {
        return bVar.a().l().equals(str);
    }

    private void r() {
        this.f4536d.edit().putLong(this.f4533a, this.f4540h.b()).apply();
    }

    public void i(final b bVar) {
        k9.h.h("[BusinessCase]", "trigger " + this.f4533a);
        if (!this.f4535c.a()) {
            if (bVar != null) {
                bVar.a(i.CONDITION_NOT_SATISFIED);
                return;
            }
            k9.h.h("BusinessCase", this.f4533a + " condition not satisfied");
            return;
        }
        if (n()) {
            if (bVar != null) {
                bVar.a(i.TRIGGER_CAP_EXCEEDED);
                return;
            }
            k9.h.h("BusinessCase", this.f4533a + " trigger cap exceeded");
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            k9.h.h("BusinessCase", "Looper is null. Using MainLooper instead, which will cause StrictMode policy violation");
        }
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        final Handler handler = new Handler(looperMyLooper);
        handler.postDelayed(new Runnable() { // from class: b8.f
            @Override // java.lang.Runnable
            public final void run() {
                g.l(atomicBoolean2, bVar, atomicBoolean);
            }
        }, 4000L);
        this.f4537e.a(new InterfaceC0078g() { // from class: b8.d
            @Override // b8.g.InterfaceC0078g
            public final void a(Object obj) {
                this.f4520a.h(handler, atomicBoolean, atomicBoolean2, bVar, (String) obj);
            }
        });
    }

    public void k(String str) {
        this.f4537e.b(str);
    }

    public String q() {
        return this.f4533a;
    }
}
