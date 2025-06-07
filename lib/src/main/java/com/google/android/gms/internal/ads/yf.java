package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class yf implements xf {
    protected static volatile dh G;
    protected float A;
    protected float B;
    protected DisplayMetrics E;
    protected vg F;

    /* renamed from: m, reason: collision with root package name */
    protected MotionEvent f18007m;

    /* renamed from: v, reason: collision with root package name */
    protected double f18016v;

    /* renamed from: w, reason: collision with root package name */
    private double f18017w;

    /* renamed from: x, reason: collision with root package name */
    private double f18018x;

    /* renamed from: y, reason: collision with root package name */
    protected float f18019y;

    /* renamed from: z, reason: collision with root package name */
    protected float f18020z;

    /* renamed from: n, reason: collision with root package name */
    protected final LinkedList f18008n = new LinkedList();

    /* renamed from: o, reason: collision with root package name */
    protected long f18009o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected long f18010p = 0;

    /* renamed from: q, reason: collision with root package name */
    protected long f18011q = 0;

    /* renamed from: r, reason: collision with root package name */
    protected long f18012r = 0;

    /* renamed from: s, reason: collision with root package name */
    protected long f18013s = 0;

    /* renamed from: t, reason: collision with root package name */
    protected long f18014t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected long f18015u = 0;
    private boolean C = false;
    protected boolean D = false;

    protected yf(Context context) {
        try {
            if (((Boolean) k3.w.c().b(ir.R2)).booleanValue()) {
                oe.d();
            } else {
                fh.a(G);
            }
            this.E = context.getResources().getDisplayMetrics();
            if (((Boolean) k3.w.c().b(ir.f10057q2)).booleanValue()) {
                this.F = new vg();
            }
        } catch (Throwable unused) {
        }
    }

    private final void n() {
        this.f18013s = 0L;
        this.f18009o = 0L;
        this.f18010p = 0L;
        this.f18011q = 0L;
        this.f18012r = 0L;
        this.f18014t = 0L;
        this.f18015u = 0L;
        if (this.f18008n.size() > 0) {
            Iterator it = this.f18008n.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f18008n.clear();
        } else {
            MotionEvent motionEvent = this.f18007m;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.f18007m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[PHI: r8 r9
  0x0088: PHI (r8v6 int) = (r8v3 int), (r8v3 int), (r8v7 int), (r8v8 int) binds: [B:37:0x008c, B:38:0x008e, B:34:0x0087, B:30:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r9v5 com.google.android.gms.internal.ads.xc) = 
  (r9v2 com.google.android.gms.internal.ads.xc)
  (r9v2 com.google.android.gms.internal.ads.xc)
  (r9v7 com.google.android.gms.internal.ads.xc)
  (r9v7 com.google.android.gms.internal.ads.xc)
 binds: [B:37:0x008c, B:38:0x008e, B:34:0x0087, B:30:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5 A[Catch: Exception -> 0x00fb, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fb, blocks: (B:48:0x00b4, B:51:0x00c1, B:60:0x00e5, B:61:0x00f5), top: B:76:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String o(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf.o(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final synchronized void a(MotionEvent motionEvent) {
        Long l10;
        if (this.C) {
            n();
            this.C = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18016v = 0.0d;
            this.f18017w = motionEvent.getRawX();
            this.f18018x = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d10 = rawX - this.f18017w;
            double d11 = rawY - this.f18018x;
            this.f18016v += Math.sqrt((d10 * d10) + (d11 * d11));
            this.f18017w = rawX;
            this.f18018x = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.f18007m = motionEventObtain;
                    this.f18008n.add(motionEventObtain);
                    if (this.f18008n.size() > 6) {
                        ((MotionEvent) this.f18008n.remove()).recycle();
                    }
                    this.f18011q++;
                    this.f18013s = i(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f18010p += motionEvent.getHistorySize() + 1;
                    gh ghVarM = m(motionEvent);
                    Long l11 = ghVarM.f8726e;
                    if (l11 != null && ghVarM.f8729h != null) {
                        this.f18014t += l11.longValue() + ghVarM.f8729h.longValue();
                    }
                    if (this.E != null && (l10 = ghVarM.f8727f) != null && ghVarM.f8730i != null) {
                        this.f18015u += l10.longValue() + ghVarM.f8730i.longValue();
                    }
                } else if (action2 == 3) {
                    this.f18012r++;
                }
            } catch (tg unused) {
            }
        } else {
            this.f18019y = motionEvent.getX();
            this.f18020z = motionEvent.getY();
            this.A = motionEvent.getRawX();
            this.B = motionEvent.getRawY();
            this.f18009o++;
        }
        this.D = true;
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final void c(StackTraceElement[] stackTraceElementArr) {
        vg vgVar;
        if (!((Boolean) k3.w.c().b(ir.f10057q2)).booleanValue() || (vgVar = this.F) == null) {
            return;
        }
        vgVar.b(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String d(Context context, View view, Activity activity) {
        return o(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String e(Context context) {
        if (hh.c()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return o(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final synchronized void f(int i10, int i11, int i12) {
        if (this.f18007m != null) {
            if (((Boolean) k3.w.c().b(ir.f9948g2)).booleanValue()) {
                n();
            } else {
                this.f18007m.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.E;
        if (displayMetrics != null) {
            float f5 = displayMetrics.density;
            this.f18007m = MotionEvent.obtain(0L, i12, 1, i10 * f5, i11 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f18007m = null;
        }
        this.D = false;
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String g(Context context, String str, View view) {
        return o(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.xf
    public final String h(Context context, String str, View view, Activity activity) {
        return o(context, str, 3, view, activity, null);
    }

    protected abstract long i(StackTraceElement[] stackTraceElementArr);

    protected abstract xc j(Context context, View view, Activity activity);

    protected abstract xc k(Context context, qc qcVar);

    protected abstract xc l(Context context, View view, Activity activity);

    protected abstract gh m(MotionEvent motionEvent);
}
