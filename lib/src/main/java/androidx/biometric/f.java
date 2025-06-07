package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f extends f0 {
    private androidx.lifecycle.s A;

    /* renamed from: d, reason: collision with root package name */
    private Executor f1470d;

    /* renamed from: e, reason: collision with root package name */
    private BiometricPrompt.a f1471e;

    /* renamed from: f, reason: collision with root package name */
    private BiometricPrompt.d f1472f;

    /* renamed from: g, reason: collision with root package name */
    private BiometricPrompt.c f1473g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.biometric.a f1474h;

    /* renamed from: i, reason: collision with root package name */
    private g f1475i;

    /* renamed from: j, reason: collision with root package name */
    private DialogInterface.OnClickListener f1476j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1477k;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1479m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1480n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1481o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1482p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1483q;

    /* renamed from: r, reason: collision with root package name */
    private androidx.lifecycle.s f1484r;

    /* renamed from: s, reason: collision with root package name */
    private androidx.lifecycle.s f1485s;

    /* renamed from: t, reason: collision with root package name */
    private androidx.lifecycle.s f1486t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.lifecycle.s f1487u;

    /* renamed from: v, reason: collision with root package name */
    private androidx.lifecycle.s f1488v;

    /* renamed from: x, reason: collision with root package name */
    private androidx.lifecycle.s f1490x;

    /* renamed from: z, reason: collision with root package name */
    private androidx.lifecycle.s f1492z;

    /* renamed from: l, reason: collision with root package name */
    private int f1478l = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1489w = true;

    /* renamed from: y, reason: collision with root package name */
    private int f1491y = 0;

    class a extends BiometricPrompt.a {
        a() {
        }
    }

    private static final class b extends a.d {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f1494a;

        b(f fVar) {
            this.f1494a = new WeakReference(fVar);
        }

        @Override // androidx.biometric.a.d
        void a(int i10, CharSequence charSequence) {
            if (this.f1494a.get() == null || ((f) this.f1494a.get()).B() || !((f) this.f1494a.get()).z()) {
                return;
            }
            ((f) this.f1494a.get()).J(new androidx.biometric.c(i10, charSequence));
        }

        @Override // androidx.biometric.a.d
        void b() {
            if (this.f1494a.get() == null || !((f) this.f1494a.get()).z()) {
                return;
            }
            ((f) this.f1494a.get()).K(true);
        }

        @Override // androidx.biometric.a.d
        void c(CharSequence charSequence) {
            if (this.f1494a.get() != null) {
                ((f) this.f1494a.get()).L(charSequence);
            }
        }

        @Override // androidx.biometric.a.d
        void d(BiometricPrompt.b bVar) {
            if (this.f1494a.get() == null || !((f) this.f1494a.get()).z()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new BiometricPrompt.b(bVar.b(), ((f) this.f1494a.get()).t());
            }
            ((f) this.f1494a.get()).M(bVar);
        }
    }

    private static class c implements Executor {

        /* renamed from: m, reason: collision with root package name */
        private final Handler f1495m = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1495m.post(runnable);
        }
    }

    private static class d implements DialogInterface.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        private final WeakReference f1496m;

        d(f fVar) {
            this.f1496m = new WeakReference(fVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f1496m.get() != null) {
                ((f) this.f1496m.get()).a0(true);
            }
        }
    }

    private static void e0(androidx.lifecycle.s sVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            sVar.k(obj);
        } else {
            sVar.i(obj);
        }
    }

    boolean A() {
        BiometricPrompt.d dVar = this.f1472f;
        return dVar == null || dVar.f();
    }

    boolean B() {
        return this.f1481o;
    }

    boolean C() {
        return this.f1482p;
    }

    LiveData D() {
        if (this.f1490x == null) {
            this.f1490x = new androidx.lifecycle.s();
        }
        return this.f1490x;
    }

    boolean E() {
        return this.f1489w;
    }

    boolean F() {
        return this.f1483q;
    }

    LiveData G() {
        if (this.f1488v == null) {
            this.f1488v = new androidx.lifecycle.s();
        }
        return this.f1488v;
    }

    boolean H() {
        return this.f1479m;
    }

    void I() {
        this.f1471e = null;
    }

    void J(androidx.biometric.c cVar) {
        if (this.f1485s == null) {
            this.f1485s = new androidx.lifecycle.s();
        }
        e0(this.f1485s, cVar);
    }

    void K(boolean z10) {
        if (this.f1487u == null) {
            this.f1487u = new androidx.lifecycle.s();
        }
        e0(this.f1487u, Boolean.valueOf(z10));
    }

    void L(CharSequence charSequence) {
        if (this.f1486t == null) {
            this.f1486t = new androidx.lifecycle.s();
        }
        e0(this.f1486t, charSequence);
    }

    void M(BiometricPrompt.b bVar) {
        if (this.f1484r == null) {
            this.f1484r = new androidx.lifecycle.s();
        }
        e0(this.f1484r, bVar);
    }

    void N(boolean z10) {
        this.f1480n = z10;
    }

    void O(int i10) {
        this.f1478l = i10;
    }

    void P(BiometricPrompt.a aVar) {
        this.f1471e = aVar;
    }

    void Q(Executor executor) {
        this.f1470d = executor;
    }

    void R(boolean z10) {
        this.f1481o = z10;
    }

    void S(BiometricPrompt.c cVar) {
        this.f1473g = cVar;
    }

    void T(boolean z10) {
        this.f1482p = z10;
    }

    void U(boolean z10) {
        if (this.f1490x == null) {
            this.f1490x = new androidx.lifecycle.s();
        }
        e0(this.f1490x, Boolean.valueOf(z10));
    }

    void V(boolean z10) {
        this.f1489w = z10;
    }

    void W(CharSequence charSequence) {
        if (this.A == null) {
            this.A = new androidx.lifecycle.s();
        }
        e0(this.A, charSequence);
    }

    void X(int i10) {
        this.f1491y = i10;
    }

    void Y(int i10) {
        if (this.f1492z == null) {
            this.f1492z = new androidx.lifecycle.s();
        }
        e0(this.f1492z, Integer.valueOf(i10));
    }

    void Z(boolean z10) {
        this.f1483q = z10;
    }

    void a0(boolean z10) {
        if (this.f1488v == null) {
            this.f1488v = new androidx.lifecycle.s();
        }
        e0(this.f1488v, Boolean.valueOf(z10));
    }

    void b0(CharSequence charSequence) {
        this.f1477k = charSequence;
    }

    void c0(BiometricPrompt.d dVar) {
        this.f1472f = dVar;
    }

    void d0(boolean z10) {
        this.f1479m = z10;
    }

    int f() {
        BiometricPrompt.d dVar = this.f1472f;
        if (dVar != null) {
            return androidx.biometric.b.b(dVar, this.f1473g);
        }
        return 0;
    }

    androidx.biometric.a g() {
        if (this.f1474h == null) {
            this.f1474h = new androidx.biometric.a(new b(this));
        }
        return this.f1474h;
    }

    androidx.lifecycle.s h() {
        if (this.f1485s == null) {
            this.f1485s = new androidx.lifecycle.s();
        }
        return this.f1485s;
    }

    LiveData i() {
        if (this.f1486t == null) {
            this.f1486t = new androidx.lifecycle.s();
        }
        return this.f1486t;
    }

    LiveData j() {
        if (this.f1484r == null) {
            this.f1484r = new androidx.lifecycle.s();
        }
        return this.f1484r;
    }

    int k() {
        return this.f1478l;
    }

    g l() {
        if (this.f1475i == null) {
            this.f1475i = new g();
        }
        return this.f1475i;
    }

    BiometricPrompt.a m() {
        if (this.f1471e == null) {
            this.f1471e = new a();
        }
        return this.f1471e;
    }

    Executor n() {
        Executor executor = this.f1470d;
        return executor != null ? executor : new c();
    }

    BiometricPrompt.c o() {
        return this.f1473g;
    }

    CharSequence p() {
        BiometricPrompt.d dVar = this.f1472f;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    LiveData q() {
        if (this.A == null) {
            this.A = new androidx.lifecycle.s();
        }
        return this.A;
    }

    int r() {
        return this.f1491y;
    }

    LiveData s() {
        if (this.f1492z == null) {
            this.f1492z = new androidx.lifecycle.s();
        }
        return this.f1492z;
    }

    int t() {
        int iF = f();
        return (!androidx.biometric.b.d(iF) || androidx.biometric.b.c(iF)) ? -1 : 2;
    }

    DialogInterface.OnClickListener u() {
        if (this.f1476j == null) {
            this.f1476j = new d(this);
        }
        return this.f1476j;
    }

    CharSequence v() {
        CharSequence charSequence = this.f1477k;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.d dVar = this.f1472f;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    CharSequence w() {
        BiometricPrompt.d dVar = this.f1472f;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    CharSequence x() {
        BiometricPrompt.d dVar = this.f1472f;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    LiveData y() {
        if (this.f1487u == null) {
            this.f1487u = new androidx.lifecycle.s();
        }
        return this.f1487u;
    }

    boolean z() {
        return this.f1480n;
    }
}
