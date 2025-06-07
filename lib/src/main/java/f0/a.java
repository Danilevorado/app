package f0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.e;
import androidx.core.view.accessibility.f;
import androidx.core.view.w;
import com.facebook.ads.NativeAdScrollView;
import f0.b;
import java.util.ArrayList;
import java.util.List;
import q.h;

/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n, reason: collision with root package name */
    private static final Rect f23554n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    private static final b.a f23555o = new C0126a();

    /* renamed from: p, reason: collision with root package name */
    private static final b.InterfaceC0127b f23556p = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f23561h;

    /* renamed from: i, reason: collision with root package name */
    private final View f23562i;

    /* renamed from: j, reason: collision with root package name */
    private c f23563j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f23557d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f23558e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f23559f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f23560g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f23564k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    int f23565l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private int f23566m = Integer.MIN_VALUE;

    /* renamed from: f0.a$a, reason: collision with other inner class name */
    class C0126a implements b.a {
        C0126a() {
        }

        @Override // f0.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, Rect rect) {
            dVar.l(rect);
        }
    }

    class b implements b.InterfaceC0127b {
        b() {
        }

        @Override // f0.b.InterfaceC0127b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(h hVar, int i10) {
            return (d) hVar.r(i10);
        }

        @Override // f0.b.InterfaceC0127b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(h hVar) {
            return hVar.m();
        }
    }

    private class c extends e {
        c() {
        }

        @Override // androidx.core.view.accessibility.e
        public d b(int i10) {
            return d.N(a.this.H(i10));
        }

        @Override // androidx.core.view.accessibility.e
        public d d(int i10) {
            int i11 = i10 == 2 ? a.this.f23564k : a.this.f23565l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // androidx.core.view.accessibility.e
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f23562i = view;
        this.f23561h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (w.z(view) == 0) {
            w.y0(view, 1);
        }
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f23562i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.f23562i;
        do {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        Object objD;
        h hVarY = y();
        int i11 = this.f23565l;
        d dVar = i11 == Integer.MIN_VALUE ? null : (d) hVarY.f(i11);
        if (i10 == 1 || i10 == 2) {
            objD = f0.b.d(hVarY, f23556p, f23555o, dVar, i10, w.B(this.f23562i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f23565l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f23562i, i10, rect2);
            }
            objD = f0.b.c(hVarY, f23556p, f23555o, dVar, rect2, i10);
        }
        d dVar2 = (d) objD;
        return T(dVar2 != null ? hVarY.j(hVarY.i(dVar2)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return w.d0(this.f23562i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f23561h.isEnabled() || !this.f23561h.isTouchExplorationEnabled() || (i11 = this.f23564k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f23564k = i10;
        this.f23562i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f23566m;
        if (i11 == i10) {
            return;
        }
        this.f23566m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    private boolean n(int i10) {
        if (this.f23564k != i10) {
            return false;
        }
        this.f23564k = Integer.MIN_VALUE;
        this.f23562i.invalidate();
        U(i10, 65536);
        return true;
    }

    private boolean p() {
        int i10 = this.f23565l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        d dVarH = H(i10);
        accessibilityEventObtain.getText().add(dVarH.v());
        accessibilityEventObtain.setContentDescription(dVarH.q());
        accessibilityEventObtain.setScrollable(dVarH.I());
        accessibilityEventObtain.setPassword(dVarH.H());
        accessibilityEventObtain.setEnabled(dVarH.D());
        accessibilityEventObtain.setChecked(dVarH.B());
        L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(dVarH.o());
        f.c(accessibilityEventObtain, this.f23562i, i10);
        accessibilityEventObtain.setPackageName(this.f23562i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f23562i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private d t(int i10) {
        d dVarL = d.L();
        dVarL.c0(true);
        dVarL.e0(true);
        dVarL.X("android.view.View");
        Rect rect = f23554n;
        dVarL.T(rect);
        dVarL.U(rect);
        dVarL.m0(this.f23562i);
        N(i10, dVarL);
        if (dVarL.v() == null && dVarL.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        dVarL.l(this.f23558e);
        if (this.f23558e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iJ = dVarL.j();
        if ((iJ & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iJ & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        dVarL.k0(this.f23562i.getContext().getPackageName());
        dVarL.r0(this.f23562i, i10);
        if (this.f23564k == i10) {
            dVarL.R(true);
            dVarL.a(128);
        } else {
            dVarL.R(false);
            dVarL.a(64);
        }
        boolean z10 = this.f23565l == i10;
        if (z10) {
            dVarL.a(2);
        } else if (dVarL.E()) {
            dVarL.a(1);
        }
        dVarL.f0(z10);
        this.f23562i.getLocationOnScreen(this.f23560g);
        dVarL.m(this.f23557d);
        if (this.f23557d.equals(rect)) {
            dVarL.l(this.f23557d);
            if (dVarL.f2378b != -1) {
                d dVarL2 = d.L();
                for (int i11 = dVarL.f2378b; i11 != -1; i11 = dVarL2.f2378b) {
                    dVarL2.n0(this.f23562i, -1);
                    dVarL2.T(f23554n);
                    N(i11, dVarL2);
                    dVarL2.l(this.f23558e);
                    Rect rect2 = this.f23557d;
                    Rect rect3 = this.f23558e;
                    rect2.offset(rect3.left, rect3.top);
                }
                dVarL2.P();
            }
            this.f23557d.offset(this.f23560g[0] - this.f23562i.getScrollX(), this.f23560g[1] - this.f23562i.getScrollY());
        }
        if (this.f23562i.getLocalVisibleRect(this.f23559f)) {
            this.f23559f.offset(this.f23560g[0] - this.f23562i.getScrollX(), this.f23560g[1] - this.f23562i.getScrollY());
            if (this.f23557d.intersect(this.f23559f)) {
                dVarL.U(this.f23557d);
                if (E(this.f23557d)) {
                    dVarL.v0(true);
                }
            }
        }
        return dVarL;
    }

    private d u() {
        d dVarM = d.M(this.f23562i);
        w.b0(this.f23562i, dVarM);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (dVarM.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            dVarM.c(this.f23562i, ((Integer) arrayList.get(i10)).intValue());
        }
        return dVarM;
    }

    private h y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h hVar = new h();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hVar.k(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return hVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).l(rect);
    }

    public final int A() {
        return this.f23565l;
    }

    protected abstract int B(float f5, float f10);

    protected abstract void C(List list);

    d H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f23565l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(d dVar);

    protected abstract void N(int i10, d dVar);

    protected abstract void O(int i10, boolean z10);

    boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f23562i.isFocused() && !this.f23562i.requestFocus()) || (i11 = this.f23565l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f23565l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f23561h.isEnabled() || (parent = this.f23562i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f23562i, q(i10, i11));
    }

    @Override // androidx.core.view.a
    public e b(View view) {
        if (this.f23563j == null) {
            this.f23563j = new c();
        }
        return this.f23563j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, d dVar) {
        super.g(view, dVar);
        M(dVar);
    }

    public final boolean o(int i10) {
        if (this.f23565l != i10) {
            return false;
        }
        this.f23565l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f23561h.isEnabled() || !this.f23561h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f23566m == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z10 = false;
                    while (i10 < repeatCount && G(iF, null)) {
                        i10++;
                        z10 = true;
                    }
                    return z10;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f23564k;
    }
}
