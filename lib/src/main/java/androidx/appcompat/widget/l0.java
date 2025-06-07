package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class l0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: m, reason: collision with root package name */
    private final float f1283m;

    /* renamed from: n, reason: collision with root package name */
    private final int f1284n;

    /* renamed from: o, reason: collision with root package name */
    private final int f1285o;

    /* renamed from: p, reason: collision with root package name */
    final View f1286p;

    /* renamed from: q, reason: collision with root package name */
    private Runnable f1287q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f1288r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1289s;

    /* renamed from: t, reason: collision with root package name */
    private int f1290t;

    /* renamed from: u, reason: collision with root package name */
    private final int[] f1291u = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = l0.this.f1286p.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.f();
        }
    }

    public l0(View view) {
        this.f1286p = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1283m = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1284n = tapTimeout;
        this.f1285o = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1288r;
        if (runnable != null) {
            this.f1286p.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1287q;
        if (runnable2 != null) {
            this.f1286p.removeCallbacks(runnable2);
        }
    }

    private boolean h(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        j0 j0Var;
        View view = this.f1286p;
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || !pVarB.b() || (j0Var = (j0) pVarB.f()) == null || !j0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        s(view, motionEventObtainNoHistory);
        t(j0Var, motionEventObtainNoHistory);
        boolean zE = j0Var.e(motionEventObtainNoHistory, this.f1290t);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1286p
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1290t
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1283m
            boolean r6 = r(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1290t = r6
            java.lang.Runnable r6 = r5.f1287q
            if (r6 != 0) goto L52
            androidx.appcompat.widget.l0$a r6 = new androidx.appcompat.widget.l0$a
            r6.<init>()
            r5.f1287q = r6
        L52:
            java.lang.Runnable r6 = r5.f1287q
            int r1 = r5.f1284n
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1288r
            if (r6 != 0) goto L65
            androidx.appcompat.widget.l0$b r6 = new androidx.appcompat.widget.l0$b
            r6.<init>()
            r5.f1288r = r6
        L65:
            java.lang.Runnable r6 = r5.f1288r
            int r1 = r5.f1285o
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.q(android.view.MotionEvent):boolean");
    }

    private static boolean r(View view, float f5, float f10, float f11) {
        float f12 = -f11;
        return f5 >= f12 && f10 >= f12 && f5 < ((float) (view.getRight() - view.getLeft())) + f11 && f10 < ((float) (view.getBottom() - view.getTop())) + f11;
    }

    private boolean s(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1291u);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean t(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1291u);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p b();

    protected abstract boolean c();

    protected boolean d() {
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || !pVarB.b()) {
            return true;
        }
        pVarB.dismiss();
        return true;
    }

    void f() {
        a();
        View view = this.f1286p;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f1289s = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1289s;
        if (z11) {
            z10 = h(motionEvent) || !d();
        } else {
            z10 = q(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1286p.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f1289s = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1289s = false;
        this.f1290t = -1;
        Runnable runnable = this.f1287q;
        if (runnable != null) {
            this.f1286p.removeCallbacks(runnable);
        }
    }
}
