package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.w;

/* loaded from: classes.dex */
abstract class a extends c {

    /* renamed from: d, reason: collision with root package name */
    private Runnable f20678d;

    /* renamed from: e, reason: collision with root package name */
    OverScroller f20679e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20680f;

    /* renamed from: g, reason: collision with root package name */
    private int f20681g;

    /* renamed from: h, reason: collision with root package name */
    private int f20682h;

    /* renamed from: i, reason: collision with root package name */
    private int f20683i;

    /* renamed from: j, reason: collision with root package name */
    private VelocityTracker f20684j;

    /* renamed from: com.google.android.material.appbar.a$a, reason: collision with other inner class name */
    private class RunnableC0096a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final CoordinatorLayout f20685m;

        /* renamed from: n, reason: collision with root package name */
        private final View f20686n;

        RunnableC0096a(CoordinatorLayout coordinatorLayout, View view) {
            this.f20685m = coordinatorLayout;
            this.f20686n = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f20686n == null || (overScroller = a.this.f20679e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                a.this.N(this.f20685m, this.f20686n);
                return;
            }
            a aVar = a.this;
            aVar.P(this.f20685m, this.f20686n, aVar.f20679e.getCurrY());
            w.g0(this.f20686n, this);
        }
    }

    public a() {
        this.f20681g = -1;
        this.f20683i = -1;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20681g = -1;
        this.f20683i = -1;
    }

    private void I() {
        if (this.f20684j == null) {
            this.f20684j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = r2
            goto L1c
        L1b:
            r12 = r3
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f20681g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f20682h = r12
            goto L4c
        L2d:
            int r0 = r11.f20681g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f20682h
            int r7 = r1 - r0
            r11.f20682h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = r3
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f20684j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f20684j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f20684j
            int r4 = r11.f20681g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = r2
            goto L73
        L72:
            r12 = r3
        L73:
            r11.f20680f = r3
            r11.f20681g = r1
            android.view.VelocityTracker r13 = r11.f20684j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f20684j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f20684j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f20680f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    abstract boolean H(View view);

    final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f5) {
        Runnable runnable = this.f20678d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f20678d = null;
        }
        if (this.f20679e == null) {
            this.f20679e = new OverScroller(view.getContext());
        }
        this.f20679e.fling(0, E(), 0, Math.round(f5), 0, 0, i10, i11);
        if (!this.f20679e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        RunnableC0096a runnableC0096a = new RunnableC0096a(coordinatorLayout, view);
        this.f20678d = runnableC0096a;
        w.g0(view, runnableC0096a);
        return true;
    }

    abstract int K(View view);

    abstract int L(View view);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, View view);

    final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f20683i < 0) {
            this.f20683i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f20680f) {
            int i10 = this.f20681g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f20682h) > this.f20683i) {
                this.f20682h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f20681g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(view) && coordinatorLayout.B(view, x10, y11);
            this.f20680f = z10;
            if (z10) {
                this.f20682h = y11;
                this.f20681g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f20679e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f20679e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f20684j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
