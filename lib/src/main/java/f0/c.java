package f0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.w;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    private static final Interpolator f23572x = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f23573a;

    /* renamed from: b, reason: collision with root package name */
    private int f23574b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f23576d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f23577e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f23578f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f23579g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f23580h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f23581i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f23582j;

    /* renamed from: k, reason: collision with root package name */
    private int f23583k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f23584l;

    /* renamed from: m, reason: collision with root package name */
    private float f23585m;

    /* renamed from: n, reason: collision with root package name */
    private float f23586n;

    /* renamed from: o, reason: collision with root package name */
    private int f23587o;

    /* renamed from: p, reason: collision with root package name */
    private final int f23588p;

    /* renamed from: q, reason: collision with root package name */
    private int f23589q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f23590r;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0128c f23591s;

    /* renamed from: t, reason: collision with root package name */
    private View f23592t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f23593u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f23594v;

    /* renamed from: c, reason: collision with root package name */
    private int f23575c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f23595w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f10 = f5 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* renamed from: f0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0128c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public void j(int i10) {
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
        }

        public abstract void l(View view, float f5, float f10);

        public abstract boolean m(View view, int i10);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0128c abstractC0128c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0128c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f23594v = viewGroup;
        this.f23591s = abstractC0128c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f23588p = i10;
        this.f23587o = i10;
        this.f23574b = viewConfiguration.getScaledTouchSlop();
        this.f23585m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23586n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23590r = new OverScroller(context, f23572x);
    }

    private void A() {
        this.f23584l.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.f23585m);
        n(e(this.f23584l.getXVelocity(this.f23575c), this.f23586n, this.f23585m), e(this.f23584l.getYVelocity(this.f23575c), this.f23586n, this.f23585m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [f0.c$c] */
    private void B(float f5, float f10, int i10) {
        boolean zC = c(f5, f10, i10, 1);
        boolean z10 = zC;
        if (c(f10, f5, i10, 4)) {
            z10 = (zC ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f5, f10, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f10, f5, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f23581i;
            iArr[i10] = iArr[i10] | r02;
            this.f23591s.f(r02, i10);
        }
    }

    private void C(float f5, float f10, int i10) {
        q(i10);
        float[] fArr = this.f23576d;
        this.f23578f[i10] = f5;
        fArr[i10] = f5;
        float[] fArr2 = this.f23577e;
        this.f23579g[i10] = f10;
        fArr2[i10] = f10;
        this.f23580h[i10] = t((int) f5, (int) f10);
        this.f23583k |= 1 << i10;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f23578f[pointerId] = x10;
                this.f23579g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f5, float f10, int i10, int i11) {
        float fAbs = Math.abs(f5);
        float fAbs2 = Math.abs(f10);
        if ((this.f23580h[i10] & i11) != i11 || (this.f23589q & i11) == 0 || (this.f23582j[i10] & i11) == i11 || (this.f23581i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f23574b;
        if (fAbs <= i12 && fAbs2 <= i12) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f23591s.g(i11)) {
            return (this.f23581i[i10] & i11) == 0 && fAbs > ((float) this.f23574b);
        }
        int[] iArr = this.f23582j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean d(View view, float f5, float f10) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f23591s.d(view) > 0;
        boolean z11 = this.f23591s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f5) > ((float) this.f23574b) : z11 && Math.abs(f10) > ((float) this.f23574b);
        }
        float f11 = (f5 * f5) + (f10 * f10);
        int i10 = this.f23574b;
        return f11 > ((float) (i10 * i10));
    }

    private float e(float f5, float f10, float f11) {
        float fAbs = Math.abs(f5);
        if (fAbs < f10) {
            return 0.0f;
        }
        return fAbs > f11 ? f5 > 0.0f ? f11 : -f11 : f5;
    }

    private int f(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        return iAbs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void g() {
        float[] fArr = this.f23576d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f23577e, 0.0f);
        Arrays.fill(this.f23578f, 0.0f);
        Arrays.fill(this.f23579g, 0.0f);
        Arrays.fill(this.f23580h, 0);
        Arrays.fill(this.f23581i, 0);
        Arrays.fill(this.f23582j, 0);
        this.f23583k = 0;
    }

    private void h(int i10) {
        if (this.f23576d == null || !w(i10)) {
            return;
        }
        this.f23576d[i10] = 0.0f;
        this.f23577e[i10] = 0.0f;
        this.f23578f[i10] = 0.0f;
        this.f23579g[i10] = 0.0f;
        this.f23580h[i10] = 0;
        this.f23581i[i10] = 0;
        this.f23582j[i10] = 0;
        this.f23583k = (~(1 << i10)) & this.f23583k;
    }

    private int i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f23594v.getWidth();
        float f5 = width / 2;
        float fO = f5 + (o(Math.min(1.0f, Math.abs(i10) / width)) * f5);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i10, int i11, int i12, int i13) {
        float f5;
        float f10;
        float f11;
        float f12;
        int iF = f(i12, (int) this.f23586n, (int) this.f23585m);
        int iF2 = f(i13, (int) this.f23586n, (int) this.f23585m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iF != 0) {
            f5 = iAbs3;
            f10 = i14;
        } else {
            f5 = iAbs;
            f10 = i15;
        }
        float f13 = f5 / f10;
        if (iF2 != 0) {
            f11 = iAbs4;
            f12 = i14;
        } else {
            f11 = iAbs2;
            f12 = i15;
        }
        return (int) ((i(i10, iF, this.f23591s.d(view)) * f13) + (i(i11, iF2, this.f23591s.e(view)) * (f11 / f12)));
    }

    public static c l(ViewGroup viewGroup, float f5, AbstractC0128c abstractC0128c) {
        c cVarM = m(viewGroup, abstractC0128c);
        cVarM.f23574b = (int) (cVarM.f23574b * (1.0f / f5));
        return cVarM;
    }

    public static c m(ViewGroup viewGroup, AbstractC0128c abstractC0128c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0128c);
    }

    private void n(float f5, float f10) {
        this.f23593u = true;
        this.f23591s.l(this.f23592t, f5, f10);
        this.f23593u = false;
        if (this.f23573a == 1) {
            E(0);
        }
    }

    private float o(float f5) {
        return (float) Math.sin((f5 - 0.5f) * 0.47123894f);
    }

    private void p(int i10, int i11, int i12, int i13) {
        int left = this.f23592t.getLeft();
        int top = this.f23592t.getTop();
        if (i12 != 0) {
            i10 = this.f23591s.a(this.f23592t, i10, i12);
            w.Y(this.f23592t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f23591s.b(this.f23592t, i11, i13);
            w.Z(this.f23592t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f23591s.k(this.f23592t, i14, i15, i14 - left, i15 - top);
    }

    private void q(int i10) {
        float[] fArr = this.f23576d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f23577e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f23578f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f23579g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f23580h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f23581i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f23582j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f23576d = fArr2;
            this.f23577e = fArr3;
            this.f23578f = fArr4;
            this.f23579g = fArr5;
            this.f23580h = iArr;
            this.f23581i = iArr2;
            this.f23582j = iArr3;
        }
    }

    private boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f23592t.getLeft();
        int top = this.f23592t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f23590r.abortAnimation();
            E(0);
            return false;
        }
        this.f23590r.startScroll(left, top, i14, i15, j(this.f23592t, i14, i15, i12, i13));
        E(2);
        return true;
    }

    private int t(int i10, int i11) {
        int i12 = i10 < this.f23594v.getLeft() + this.f23587o ? 1 : 0;
        if (i11 < this.f23594v.getTop() + this.f23587o) {
            i12 |= 4;
        }
        if (i10 > this.f23594v.getRight() - this.f23587o) {
            i12 |= 2;
        }
        return i11 > this.f23594v.getBottom() - this.f23587o ? i12 | 8 : i12;
    }

    private boolean x(int i10) {
        if (w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i10) {
        this.f23594v.removeCallbacks(this.f23595w);
        if (this.f23573a != i10) {
            this.f23573a = i10;
            this.f23591s.j(i10);
            if (this.f23573a == 0) {
                this.f23592t = null;
            }
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f23593u) {
            return s(i10, i11, (int) this.f23584l.getXVelocity(this.f23575c), (int) this.f23584l.getYVelocity(this.f23575c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i10, int i11) {
        this.f23592t = view;
        this.f23575c = -1;
        boolean zS = s(i10, i11, 0, 0);
        if (!zS && this.f23573a == 0 && this.f23592t != null) {
            this.f23592t = null;
        }
        return zS;
    }

    boolean I(View view, int i10) {
        if (view == this.f23592t && this.f23575c == i10) {
            return true;
        }
        if (view == null || !this.f23591s.m(view, i10)) {
            return false;
        }
        this.f23575c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f23575c = -1;
        g();
        VelocityTracker velocityTracker = this.f23584l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23584l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f23594v) {
            this.f23592t = view;
            this.f23575c = i10;
            this.f23591s.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f23594v + ")");
    }

    public boolean k(boolean z10) {
        if (this.f23573a == 2) {
            boolean zComputeScrollOffset = this.f23590r.computeScrollOffset();
            int currX = this.f23590r.getCurrX();
            int currY = this.f23590r.getCurrY();
            int left = currX - this.f23592t.getLeft();
            int top = currY - this.f23592t.getTop();
            if (left != 0) {
                w.Y(this.f23592t, left);
            }
            if (top != 0) {
                w.Z(this.f23592t, top);
            }
            if (left != 0 || top != 0) {
                this.f23591s.k(this.f23592t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f23590r.getFinalX() && currY == this.f23590r.getFinalY()) {
                this.f23590r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f23594v.post(this.f23595w);
                } else {
                    E(0);
                }
            }
        }
        return this.f23573a == 2;
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f23594v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f23594v.getChildAt(this.f23591s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f23574b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f23592t, i10, i11);
    }

    public boolean w(int i10) {
        return ((1 << i10) & this.f23583k) != 0;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f23584l == null) {
            this.f23584l = VelocityTracker.obtain();
        }
        this.f23584l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x10, (int) y10);
            C(x10, y10, pointerId);
            I(viewR, pointerId);
            int i12 = this.f23580h[pointerId];
            int i13 = this.f23589q;
            if ((i12 & i13) != 0) {
                this.f23591s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f23573a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i11 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i11);
                        if (x(pointerId2)) {
                            float x11 = motionEvent.getX(i11);
                            float y11 = motionEvent.getY(i11);
                            float f5 = x11 - this.f23576d[pointerId2];
                            float f10 = y11 - this.f23577e[pointerId2];
                            B(f5, f10, pointerId2);
                            if (this.f23573a != 1) {
                                View viewR2 = r((int) x11, (int) y11);
                                if (d(viewR2, f5, f10) && I(viewR2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i11++;
                    }
                } else {
                    if (!x(this.f23575c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f23575c);
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float y12 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f23578f;
                    int i14 = this.f23575c;
                    int i15 = (int) (x12 - fArr[i14]);
                    int i16 = (int) (y12 - this.f23579g[i14]);
                    p(this.f23592t.getLeft() + i15, this.f23592t.getTop() + i16, i15, i16);
                }
                D(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x13 = motionEvent.getX(actionIndex);
                    float y13 = motionEvent.getY(actionIndex);
                    C(x13, y13, pointerId3);
                    if (this.f23573a != 0) {
                        if (v((int) x13, (int) y13)) {
                            I(this.f23592t, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        I(r((int) x13, (int) y13), pointerId3);
                        int i17 = this.f23580h[pointerId3];
                        int i18 = this.f23589q;
                        if ((i17 & i18) != 0) {
                            this.f23591s.h(i17 & i18, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f23573a == 1 && pointerId4 == this.f23575c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount2) {
                            i10 = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i11);
                        if (pointerId5 != this.f23575c) {
                            View viewR3 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view = this.f23592t;
                            if (viewR3 == view && I(view, pointerId5)) {
                                i10 = this.f23575c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        A();
                    }
                }
                h(pointerId4);
                return;
            }
            if (this.f23573a == 1) {
                n(0.0f, 0.0f);
            }
        } else if (this.f23573a == 1) {
            A();
        }
        a();
    }
}
