package j3;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ag;
import com.google.android.gms.internal.ads.bz2;
import com.google.android.gms.internal.ads.dx2;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.gy2;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.uf;
import com.google.android.gms.internal.ads.xf;
import com.google.android.gms.internal.ads.ze0;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import k3.w;
import m3.b2;

/* loaded from: classes.dex */
public final class i implements Runnable, xf {
    private int A;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f24466p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f24467q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f24468r;

    /* renamed from: s, reason: collision with root package name */
    private final Executor f24469s;

    /* renamed from: t, reason: collision with root package name */
    private final dx2 f24470t;

    /* renamed from: u, reason: collision with root package name */
    private Context f24471u;

    /* renamed from: v, reason: collision with root package name */
    private final Context f24472v;

    /* renamed from: w, reason: collision with root package name */
    private ff0 f24473w;

    /* renamed from: x, reason: collision with root package name */
    private final ff0 f24474x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f24475y;

    /* renamed from: m, reason: collision with root package name */
    private final List f24463m = new Vector();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicReference f24464n = new AtomicReference();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f24465o = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    final CountDownLatch f24476z = new CountDownLatch(1);

    public i(Context context, ff0 ff0Var) {
        this.f24471u = context;
        this.f24472v = context;
        this.f24473w = ff0Var;
        this.f24474x = ff0Var;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f24469s = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) w.c().b(ir.f9884a2)).booleanValue();
        this.f24475y = zBooleanValue;
        this.f24470t = dx2.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f24467q = ((Boolean) w.c().b(ir.W1)).booleanValue();
        this.f24468r = ((Boolean) w.c().b(ir.f9895b2)).booleanValue();
        if (((Boolean) w.c().b(ir.Z1)).booleanValue()) {
            this.A = 2;
        } else {
            this.A = 1;
        }
        if (!((Boolean) w.c().b(ir.f9885a3)).booleanValue()) {
            this.f24466p = k();
        }
        if (!((Boolean) w.c().b(ir.T2)).booleanValue()) {
            k3.t.b();
            if (!se0.w()) {
                run();
                return;
            }
        }
        of0.f13186a.execute(this);
    }

    private final xf n() {
        return (xf) (m() == 2 ? this.f24465o : this.f24464n).get();
    }

    private final void o() {
        xf xfVarN = n();
        if (this.f24463m.isEmpty() || xfVarN == null) {
            return;
        }
        for (Object[] objArr : this.f24463m) {
            int length = objArr.length;
            if (length == 1) {
                xfVarN.a((MotionEvent) objArr[0]);
            } else if (length == 3) {
                xfVarN.f(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f24463m.clear();
    }

    private final void p(boolean z10) {
        this.f24464n.set(ag.y(this.f24473w.f8252m, q(this.f24471u), z10, this.A));
    }

    private static final Context q(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void a(MotionEvent motionEvent) {
        xf xfVarN = n();
        if (xfVarN == null) {
            this.f24463m.add(new Object[]{motionEvent});
        } else {
            o();
            xfVarN.a(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void b(View view) {
        xf xfVarN = n();
        if (xfVarN != null) {
            xfVarN.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void c(StackTraceElement[] stackTraceElementArr) {
        xf xfVarN;
        if (!l() || (xfVarN = n()) == null) {
            return;
        }
        xfVarN.c(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String d(Context context, View view, Activity activity) {
        if (!((Boolean) w.c().b(ir.f9924d9)).booleanValue()) {
            xf xfVarN = n();
            if (((Boolean) w.c().b(ir.f9934e9)).booleanValue()) {
                t.r();
                b2.e(view, 2, null);
            }
            return xfVarN != null ? xfVarN.d(context, view, activity) : "";
        }
        if (!l()) {
            return "";
        }
        xf xfVarN2 = n();
        if (((Boolean) w.c().b(ir.f9934e9)).booleanValue()) {
            t.r();
            b2.e(view, 2, null);
        }
        return xfVarN2 != null ? xfVarN2.d(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String e(Context context) {
        xf xfVarN;
        if (!l() || (xfVarN = n()) == null) {
            return "";
        }
        o();
        return xfVarN.e(q(context));
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void f(int i10, int i11, int i12) {
        xf xfVarN = n();
        if (xfVarN == null) {
            this.f24463m.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        } else {
            o();
            xfVarN.f(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String h(Context context, String str, View view, Activity activity) {
        if (!l()) {
            return "";
        }
        xf xfVarN = n();
        if (((Boolean) w.c().b(ir.f9934e9)).booleanValue()) {
            t.r();
            b2.e(view, 4, null);
        }
        if (xfVarN == null) {
            return "";
        }
        o();
        return xfVarN.h(q(context), str, view, activity);
    }

    final /* synthetic */ void j(boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            uf.i(this.f24474x.f8252m, q(this.f24472v), z10, this.f24475y).p();
        } catch (NullPointerException e5) {
            this.f24470t.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e5);
        }
    }

    protected final boolean k() {
        Context context = this.f24471u;
        dx2 dx2Var = this.f24470t;
        h hVar = new h(this);
        return new bz2(this.f24471u, gy2.b(context, dx2Var), hVar, ((Boolean) w.c().b(ir.X1)).booleanValue()).d(1);
    }

    public final boolean l() throws InterruptedException {
        try {
            this.f24476z.await();
            return true;
        } catch (InterruptedException e5) {
            ze0.h("Interrupted during GADSignals creation.", e5);
            return false;
        }
    }

    protected final int m() {
        if (!this.f24467q || this.f24466p) {
            return this.A;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) w.c().b(ir.f9885a3)).booleanValue()) {
                this.f24466p = k();
            }
            boolean z10 = this.f24473w.f8255p;
            final boolean z11 = false;
            if (!((Boolean) w.c().b(ir.S0)).booleanValue() && z10) {
                z11 = true;
            }
            if (m() == 1) {
                p(z11);
                if (this.A == 2) {
                    this.f24469s.execute(new Runnable() { // from class: j3.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24460m.j(z11);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    uf ufVarI = uf.i(this.f24473w.f8252m, q(this.f24471u), z11, this.f24475y);
                    this.f24465o.set(ufVarI);
                    if (this.f24468r && !ufVarI.r()) {
                        this.A = 1;
                        p(z11);
                    }
                } catch (NullPointerException e5) {
                    this.A = 1;
                    p(z11);
                    this.f24470t.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e5);
                }
            }
        } finally {
            this.f24476z.countDown();
            this.f24471u = null;
            this.f24473w = null;
        }
    }
}
