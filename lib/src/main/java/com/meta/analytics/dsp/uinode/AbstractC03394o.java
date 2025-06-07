package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC03394o {
    public static byte[] A0I;
    public static String[] A0J = {"NGwI4w5wjKKwr8vIXUEBgcadgt82Mvhc", "UEWVJJvMFTFlt7hH7ERCIJOXwkHPD", "VrTEPZjwbsMyuvHOm", "2WwBzOWctlsBfaK16SO", "SN9IkStz5", "kDHla2kaeJhueA2usdy0jZceB2KGO", "Oz8ehwpCKAgd43CqPtwSSE9zN5", "pRsAYaXPUkY6EiG3qKZOmbtQ8"};
    public int A00;
    public C4C A01;
    public AnonymousClass51 A02;
    public C0556Eb A03;
    public C5B A04;
    public C5B A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass59 A0G;
    public final AnonymousClass59 A0H;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        byte[] bArr = {-2, 33, 33, 34, 33, -35, 19, 38, 34, 52, -35, 37, 30, 48, -35, 15, 34, 32, 54, 32, 41, 34, 47, 19, 38, 34, 52, -35, 30, 48, -35, 45, 30, 47, 34, 43, 49, -35, 31, 50, 49, -35, 51, 38, 34, 52, -35, 38, 48, -35, 43, 44, 49, -35, 30, -35, 47, 34, 30, 41, -35, 32, 37, 38, 41, 33, -21, -35, 18, 43, 35, 38, 41, 49, 34, 47, 34, 33, -35, 38, 43, 33, 34, 53, -9, -35, -5, 8, 8, 9, 14, -70, 7, 9, 16, -1, -70, -5, -70, -3, 2, 3, 6, -2, -70, 0, 12, 9, 7, -70, 8, 9, 8, -57, -1, 18, 3, 13, 14, 3, 8, 1, -70, 3, 8, -2, -1, 18, -44};
        String[] strArr = A0J;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0J[6] = "kyP20liVKsmkdJ";
        A0I = bArr;
    }

    public abstract int A1d(int i10, C03464w c03464w, AnonymousClass53 anonymousClass53);

    public abstract int A1e(int i10, C03464w c03464w, AnonymousClass53 anonymousClass53);

    public abstract int A1f(AnonymousClass53 anonymousClass53);

    public abstract int A1g(AnonymousClass53 anonymousClass53);

    public abstract int A1h(AnonymousClass53 anonymousClass53);

    public abstract int A1i(AnonymousClass53 anonymousClass53);

    public abstract int A1j(AnonymousClass53 anonymousClass53);

    public abstract int A1k(AnonymousClass53 anonymousClass53);

    public abstract Parcelable A1l();

    public abstract View A1n(View view, int i10, C03464w c03464w, AnonymousClass53 anonymousClass53);

    public abstract C03404p A1o();

    public abstract void A1p(int i10);

    public abstract void A1q(int i10, int i11, AnonymousClass53 anonymousClass53, InterfaceC03374m interfaceC03374m);

    public abstract void A1r(int i10, InterfaceC03374m interfaceC03374m);

    public abstract void A1s(Parcelable parcelable);

    public abstract void A1u(C03464w c03464w, AnonymousClass53 anonymousClass53);

    public abstract void A1x(C0556Eb c0556Eb, AnonymousClass53 anonymousClass53, int i10);

    public abstract boolean A1z();

    public abstract boolean A20();

    public abstract boolean A21();

    public abstract boolean A22();

    static {
        A08();
    }

    public AbstractC03394o() {
        C1091Zg c1091Zg = new C1091Zg(this);
        this.A0G = c1091Zg;
        C1090Zf c1090Zf = new C1090Zf(this);
        this.A0H = c1090Zf;
        this.A04 = new C5B(c1091Zg);
        this.A05 = new C5B(c1090Zf);
        this.A09 = false;
        this.A07 = false;
        this.A06 = false;
        this.A0F = true;
        this.A0E = true;
    }

    public static int A00(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        switch (mode) {
            case Integer.MIN_VALUE:
                int mode2 = Math.max(i11, i12);
                return Math.min(size, mode2);
            case 1073741824:
                return size;
            default:
                int mode3 = Math.max(i11, i12);
                return mode3;
        }
    }

    public static int A01(int i10, int i11, int i12, int i13, boolean z10) {
        int iMax = Math.max(0, i10 - i12);
        int i14 = 0;
        int resultMode = 0;
        if (z10) {
            if (i13 >= 0) {
                i14 = i13;
                String[] strArr = A0J;
                String str = strArr[5];
                String str2 = strArr[1];
                int resultSize = str.length();
                int size = str2.length();
                if (resultSize != size) {
                    throw new RuntimeException();
                }
                A0J[6] = "ru0BYCJI67FO4KgBABZqajada";
                resultMode = 1073741824;
            } else if (i13 == -1) {
                switch (i11) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i14 = iMax;
                        resultMode = i11;
                        break;
                    case 0:
                        i14 = 0;
                        int resultSize2 = A0J[3].length();
                        if (resultSize2 == 28) {
                            resultMode = 0;
                            break;
                        } else {
                            A0J[7] = "Nw";
                            resultMode = 0;
                            break;
                        }
                }
            } else if (i13 == -2) {
                i14 = 0;
                resultMode = 0;
            }
        } else if (i13 >= 0) {
            i14 = i13;
            resultMode = 1073741824;
        } else if (i13 == -1) {
            i14 = iMax;
            resultMode = i11;
        } else if (i13 == -2) {
            i14 = iMax;
            resultMode = (i11 == Integer.MIN_VALUE || i11 == 1073741824) ? Integer.MIN_VALUE : 0;
        }
        int size2 = View.MeasureSpec.makeMeasureSpec(i14, resultMode);
        return size2;
    }

    private final int A02(View view) {
        return ((C03404p) view.getLayoutParams()).A03.bottom;
    }

    private final int A03(View view) {
        return ((C03404p) view.getLayoutParams()).A03.left;
    }

    private final int A04(View view) {
        return ((C03404p) view.getLayoutParams()).A03.right;
    }

    private final int A05(View view) {
        return ((C03404p) view.getLayoutParams()).A03.top;
    }

    private final int A06(C03464w c03464w, AnonymousClass53 anonymousClass53) {
        return 0;
    }

    private final void A09(int i10) {
        A0C(i10, A0t(i10));
    }

    private final void A0A(int i10) {
        View child = A0t(i10);
        if (child != null) {
            this.A01.A0D(i10);
        }
    }

    private final void A0B(int i10, int i11) {
        View view = A0t(i10);
        if (view != null) {
            A09(i10);
            A0E(view, i11);
            return;
        }
        throw new IllegalArgumentException(A07(85, 44, 79) + i10 + this.A03.toString());
    }

    private void A0C(int i10, View view) {
        this.A01.A0C(i10);
    }

    private final void A0D(View view) {
        this.A01.A0F(view);
    }

    private final void A0E(View view, int i10) {
        A0F(view, i10, (C03404p) view.getLayoutParams());
    }

    private final void A0F(View view, int i10, C03404p c03404p) {
        AnonymousClass56 anonymousClass56A0F = C0556Eb.A0F(view);
        if (anonymousClass56A0F.A0a()) {
            this.A03.A0t.A09(anonymousClass56A0F);
        } else {
            C5E c5e = this.A03.A0t;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[0] = "mtQ3Ck4zhf6OC1ISSa3eadAcnNcPftbe";
            c5e.A0A(anonymousClass56A0F);
        }
        this.A01.A0H(view, i10, c03404p, anonymousClass56A0F.A0a());
    }

    private void A0G(View view, int i10, boolean z10) {
        AnonymousClass56 anonymousClass56A0F = C0556Eb.A0F(view);
        if (z10 || anonymousClass56A0F.A0a()) {
            this.A03.A0t.A09(anonymousClass56A0F);
        } else {
            this.A03.A0t.A0A(anonymousClass56A0F);
        }
        C03404p c03404p = (C03404p) view.getLayoutParams();
        if (anonymousClass56A0F.A0g() || anonymousClass56A0F.A0b()) {
            if (anonymousClass56A0F.A0b()) {
                anonymousClass56A0F.A0S();
            } else {
                anonymousClass56A0F.A0O();
            }
            this.A01.A0H(view, i10, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            C0556Eb c0556Eb = this.A03;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "5ABI9jSeQ";
            if (parent == c0556Eb) {
                int currentIndex = this.A01.A07(view);
                if (i10 == -1) {
                    i10 = this.A01.A05();
                }
                if (currentIndex != -1) {
                    if (currentIndex != i10) {
                        this.A03.A06.A0B(currentIndex, i10);
                    }
                } else {
                    throw new IllegalStateException(A07(0, 85, 114) + this.A03.indexOfChild(view) + this.A03.A1H());
                }
            } else {
                this.A01.A0I(view, i10, false);
                c03404p.A01 = true;
                AnonymousClass51 anonymousClass51 = this.A02;
                if (anonymousClass51 != null && anonymousClass51.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c03404p.A02) {
            anonymousClass56A0F.A0H.invalidate();
            c03404p.A02 = false;
        }
    }

    private final void A0H(View view, Rect rect) {
        C0556Eb.A0o(view, rect);
    }

    private void A0J(C03464w c03464w, int i10, View view) {
        AnonymousClass56 anonymousClass56A0F = C0556Eb.A0F(view);
        if (anonymousClass56A0F.A0f()) {
            return;
        }
        if (anonymousClass56A0F.A0Z() && !anonymousClass56A0F.A0a() && !this.A03.A04.A0A()) {
            A0A(i10);
            c03464w.A0X(anonymousClass56A0F);
        } else {
            A09(i10);
            c03464w.A0S(view);
            this.A03.A0t.A0C(anonymousClass56A0F);
        }
    }

    private final void A0K(C03464w c03464w, AnonymousClass53 anonymousClass53, AccessibilityEvent accessibilityEvent) {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb == null || accessibilityEvent == null) {
            return;
        }
        boolean z10 = true;
        if (A0J[6].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A0J;
        strArr[2] = "A1LbQwkKC8kdEmdjm";
        strArr[4] = "mpAFCzQjd";
        if (!c0556Eb.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z10 = false;
        }
        accessibilityEvent.setScrollable(z10);
        if (A0J[7].length() != 8) {
            A0J[0] = "LKoEdNrfwYhRE769hHSL4lsoF7TmWWKx";
            if (this.A03.A04 == null) {
                return;
            }
        } else if (this.A03.A04 == null) {
            return;
        }
        accessibilityEvent.setItemCount(this.A03.A04.A0E());
    }

    private final void A0L(C03464w c03464w, AnonymousClass53 anonymousClass53, C03183s c03183s) {
        if (this.A03.canScrollVertically(-1) || this.A03.canScrollHorizontally(-1)) {
            c03183s.A0N(8192);
            c03183s.A0R(true);
        }
        if (this.A03.canScrollVertically(1) || this.A03.canScrollHorizontally(1)) {
            c03183s.A0N(4096);
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[2] = "WKK7ZU1nOyoZ4isR3";
            strArr2[4] = "S1xUaVTVF";
            c03183s.A0R(true);
        }
        C03153p collectionInfo = C03153p.A00(A0r(c03464w, anonymousClass53), A0q(c03464w, anonymousClass53), A0P(c03464w, anonymousClass53), A06(c03464w, anonymousClass53));
        c03183s.A0P(collectionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(AnonymousClass51 anonymousClass51) {
        if (this.A02 == anonymousClass51) {
            this.A02 = null;
        }
    }

    private final boolean A0N() {
        AnonymousClass51 anonymousClass51 = this.A02;
        return anonymousClass51 != null && anonymousClass51.A0F();
    }

    public static boolean A0O(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                if (size >= i10) {
                }
                break;
            case 0:
                break;
            case 1073741824:
                if (size == i10) {
                }
                break;
        }
        return false;
    }

    private final boolean A0P(C03464w c03464w, AnonymousClass53 anonymousClass53) {
        return false;
    }

    private final boolean A0Q(C03464w c03464w, AnonymousClass53 anonymousClass53, int i10, Bundle bundle) {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb == null) {
            return false;
        }
        int iA0X = 0;
        int iA0h = 0;
        switch (i10) {
            case 4096:
                if (c0556Eb.canScrollVertically(1)) {
                    iA0X = (A0X() - A0g()) - A0d();
                }
                if (this.A03.canScrollHorizontally(1)) {
                    iA0h = (A0h() - A0e()) - A0f();
                    break;
                }
                break;
            case 8192:
                if (c0556Eb.canScrollVertically(-1)) {
                    iA0X = -((A0X() - A0g()) - A0d());
                }
                if (this.A03.canScrollHorizontally(-1)) {
                    iA0h = -((A0h() - A0e()) - A0f());
                    break;
                }
                break;
        }
        if (iA0X == 0 && iA0h == 0) {
            return false;
        }
        C0556Eb c0556Eb2 = this.A03;
        if (A0J[7].length() == 8) {
            throw new RuntimeException();
        }
        A0J[7] = "6TTpYbQ6a4";
        c0556Eb2.scrollBy(iA0h, iA0X);
        return true;
    }

    private final boolean A0R(C03464w c03464w, AnonymousClass53 anonymousClass53, View view, int i10, Bundle bundle) {
        return false;
    }

    private boolean A0S(C0556Eb c0556Eb, int i10, int i11) {
        View focusedChild = c0556Eb.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0e();
        int parentRight = A0g();
        int parentTop = A0h();
        int parentTop2 = parentTop - A0f();
        int parentLeft = A0X();
        int parentLeft2 = parentLeft - A0d();
        Rect rect = this.A03.A0p;
        A0H(focusedChild, rect);
        if (rect.left - i10 >= parentTop2 || rect.right - i10 <= parentBottom || rect.top - i11 >= parentLeft2 || rect.bottom - i11 <= parentRight) {
            return false;
        }
        if (A0J[3].length() == 28) {
            throw new RuntimeException();
        }
        A0J[0] = "D1nd79aIos3YYe4Hq7EzCaafqnQh2NEe";
        return true;
    }

    @Deprecated
    private final boolean A0T(C0556Eb c0556Eb, View view, View view2) {
        return A0N() || c0556Eb.A1q();
    }

    private int[] A0U(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0e();
        int offScreenTop = A0g();
        int dy = A0h() - A0f();
        int offScreenLeft = A0X() - A0d();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childTop = rect.width() + childBottom;
        int parentLeft = rect.height();
        int childLeft = Math.min(0, childBottom - offScreenRight);
        int parentBottom = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childTop - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0a() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(childLeft, childTop - dy);
            }
        } else {
            parentTop = childLeft != 0 ? childLeft : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentBottom == 0) {
            parentBottom = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentBottom;
        if (A0J[0].charAt(31) == 'p') {
            throw new RuntimeException();
        }
        A0J[0] = "97vXAXgJ0WxvI5IvBZpOR2Ky1DZNuVnu";
        return iArr;
    }

    public final int A0V() {
        return -1;
    }

    public final int A0W() {
        C4C c4c = this.A01;
        if (c4c != null) {
            return c4c.A05();
        }
        return 0;
    }

    public final int A0X() {
        return this.A0A;
    }

    public final int A0Y() {
        return this.A0B;
    }

    public final int A0Z() {
        C0556Eb c0556Eb = this.A03;
        AbstractC03274c a10 = c0556Eb != null ? c0556Eb.getAdapter() : null;
        if (a10 != null) {
            return a10.A0E();
        }
        return 0;
    }

    public final int A0a() {
        return C3T.A01(this.A03);
    }

    public final int A0b() {
        return C3T.A02(this.A03);
    }

    public final int A0c() {
        return C3T.A03(this.A03);
    }

    public final int A0d() {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb != null) {
            return c0556Eb.getPaddingBottom();
        }
        return 0;
    }

    public final int A0e() {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb != null) {
            return c0556Eb.getPaddingLeft();
        }
        return 0;
    }

    public final int A0f() {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb != null) {
            return c0556Eb.getPaddingRight();
        }
        return 0;
    }

    public final int A0g() {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb != null) {
            return c0556Eb.getPaddingTop();
        }
        return 0;
    }

    public final int A0h() {
        return this.A0C;
    }

    public final int A0i() {
        return this.A0D;
    }

    public final int A0j(View view) {
        return view.getBottom() + A02(view);
    }

    public final int A0k(View view) {
        return view.getLeft() - A03(view);
    }

    public final int A0l(View view) {
        Rect rect = ((C03404p) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0m(View view) {
        Rect rect = ((C03404p) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0n(View view) {
        return view.getRight() + A04(view);
    }

    public final int A0o(View view) {
        return view.getTop() - A05(view);
    }

    public final int A0p(View view) {
        return ((C03404p) view.getLayoutParams()).A00();
    }

    public int A0q(C03464w c03464w, AnonymousClass53 anonymousClass53) {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb == null || c0556Eb.A04 == null || !A20()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    public int A0r(C03464w c03464w, AnonymousClass53 anonymousClass53) {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb == null || c0556Eb.A04 == null || !A21()) {
            return 1;
        }
        return this.A03.A04.A0E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View A0s() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Eb r0 = r6.A03
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            android.view.View r3 = r0.getFocusedChild()
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC03394o.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC03394o.A0J
            java.lang.String r1 = "iiKud1wfkCloFGZ1U"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L4c
            com.facebook.ads.redexgen.X.4C r4 = r6.A01
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC03394o.A0J
            r0 = 5
            r1 = r2[r0]
            r0 = 1
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4d
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC03394o.A0J
            java.lang.String r1 = "7ET4ZuKdeEmot2qkcvXky1gJdqYIXUUX"
            r0 = 0
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
        L4c:
            return r5
        L4d:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.AbstractC03394o.A0J
            java.lang.String r1 = "xPYIlKgRfeB9qWlMIQGlIgoODb"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r4.A0K(r3)
            if (r0 == 0) goto L5b
            goto L4c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC03394o.A0s():android.view.View");
    }

    public final View A0t(int i10) {
        C4C c4c = this.A01;
        if (c4c != null) {
            return c4c.A09(i10);
        }
        return null;
    }

    public final View A0u(View view, int i10) {
        return null;
    }

    public C03404p A0v(Context context, AttributeSet attributeSet) {
        return new C03404p(context, attributeSet);
    }

    public C03404p A0w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C03404p) {
            return new C03404p((C03404p) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C03404p((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C03404p(layoutParams);
    }

    public final void A0x() {
        AnonymousClass51 anonymousClass51 = this.A02;
        if (anonymousClass51 != null) {
            anonymousClass51.A09();
        }
    }

    public final void A0y() {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb != null) {
            c0556Eb.requestLayout();
        }
    }

    public final void A0z(int i10) {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb != null) {
            c0556Eb.A1T(i10);
        }
    }

    public final void A10(int i10) {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb != null) {
            c0556Eb.A1U(i10);
        }
    }

    public final void A11(int i10, int i11) {
        this.A0C = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.A0D = mode;
        if (mode == 0 && !C0556Eb.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.A0B = mode2;
        if (mode2 == 0 && !C0556Eb.A1B) {
            this.A0A = 0;
        }
    }

    public final void A12(int i10, int i11) {
        int iA0W = A0W();
        if (iA0W == 0) {
            this.A03.A1a(i10, i11);
            return;
        }
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i14 = 0; i14 < iA0W; i14++) {
            View viewA0t = A0t(i14);
            Rect rect = this.A03.A0p;
            A0H(viewA0t, rect);
            int count = rect.left;
            if (count < i12) {
                i12 = rect.left;
            }
            int count2 = rect.right;
            if (count2 > maxY) {
                maxY = rect.right;
            }
            int count3 = rect.top;
            if (count3 < i13) {
                i13 = rect.top;
            }
            int count4 = rect.bottom;
            if (count4 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i12, i13, maxY, maxX);
        String[] strArr = A0J;
        String str = strArr[2];
        String str2 = strArr[4];
        int minX = str.length();
        int count5 = str2.length();
        if (minX == count5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[2] = "hT857kPIBtMq0qM94";
        strArr2[4] = "qfhhOTku3";
        A15(this.A03.A0p, i10, i11);
    }

    public final void A13(int i10, int i11) {
        this.A03.setMeasuredDimension(i10, i11);
    }

    public final void A14(int i10, C03464w c03464w) {
        View view = A0t(i10);
        A0A(i10);
        c03464w.A0T(view);
    }

    public void A15(Rect rect, int i10, int i11) {
        int usedHeight = rect.width() + A0e() + A0f();
        int iHeight = rect.height();
        int usedWidth = A0g();
        int i12 = iHeight + usedWidth;
        int usedWidth2 = A0d();
        int width = i12 + usedWidth2;
        int usedWidth3 = A0c();
        int usedHeight2 = A00(i10, usedHeight, usedWidth3);
        int usedWidth4 = A0b();
        A13(usedHeight2, A00(i11, width, usedWidth4));
    }

    public final void A16(View view) {
        A18(view, -1);
    }

    public final void A17(View view) {
        A19(view, -1);
    }

    public final void A18(View view, int i10) {
        A0G(view, i10, true);
    }

    public final void A19(View view, int i10) {
        A0G(view, i10, false);
    }

    public final void A1A(View view, int i10, int i11) {
        C03404p c03404p = (C03404p) view.getLayoutParams();
        Rect rectA1D = this.A03.A1D(view);
        int i12 = i10 + rectA1D.left + rectA1D.right;
        int i13 = i11 + rectA1D.top + rectA1D.bottom;
        int iA01 = A01(A0h(), A0i(), A0e() + A0f() + c03404p.leftMargin + c03404p.rightMargin + i12, c03404p.width, A20());
        int iA0X = A0X();
        int iA0Y = A0Y();
        int widthSpec = A0g();
        int iA012 = A01(iA0X, iA0Y, widthSpec + A0d() + c03404p.topMargin + c03404p.bottomMargin + i13, c03404p.height, A21());
        if (A1W(view, iA01, iA012, c03404p)) {
            view.measure(iA01, iA012);
        }
    }

    public final void A1B(View view, int i10, int i11, int i12, int i13) {
        C03404p c03404p = (C03404p) view.getLayoutParams();
        Rect rect = c03404p.A03;
        view.layout(rect.left + i10 + c03404p.leftMargin, rect.top + i11 + c03404p.topMargin, (i12 - rect.right) - c03404p.rightMargin, (i13 - rect.bottom) - c03404p.bottomMargin);
    }

    public final void A1C(View view, C03183s c03183s) {
        AnonymousClass56 anonymousClass56A0F = C0556Eb.A0F(view);
        if (anonymousClass56A0F != null && !anonymousClass56A0F.A0a() && !this.A01.A0K(anonymousClass56A0F.A0H)) {
            A1K(this.A03.A0r, this.A03.A0s, view, c03183s);
        }
    }

    public final void A1D(View view, C03464w c03464w) {
        A0D(view);
        c03464w.A0T(view);
    }

    public final void A1E(View view, boolean z10, Rect rect) {
        Matrix matrix;
        if (z10) {
            Rect rect2 = ((C03404p) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.A03 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(rectF.top);
            float f5 = rectF.right;
            String[] strArr = A0J;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0J[7] = "WbBFuKAltYM";
            rect.set(iFloor, iFloor2, (int) Math.ceil(f5), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1F(C03183s c03183s) {
        A0L(this.A03.A0r, this.A03.A0s, c03183s);
    }

    public final void A1G(C03464w c03464w) {
        int iA0E = c03464w.A0E();
        for (int i10 = iA0E - 1; i10 >= 0; i10--) {
            View viewA0F = c03464w.A0F(i10);
            AnonymousClass56 anonymousClass56A0F = C0556Eb.A0F(viewA0F);
            if (!anonymousClass56A0F.A0f()) {
                anonymousClass56A0F.A0X(false);
                if (anonymousClass56A0F.A0c()) {
                    this.A03.removeDetachedView(viewA0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0K(anonymousClass56A0F);
                }
                anonymousClass56A0F.A0X(true);
                c03464w.A0R(viewA0F);
            }
        }
        c03464w.A0L();
        if (iA0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1H(C03464w c03464w) {
        int childCount = A0W();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            A0J(c03464w, i10, A0t(i10));
        }
    }

    public final void A1I(C03464w c03464w) {
        for (int iA0W = A0W() - 1; iA0W >= 0; iA0W--) {
            if (!C0556Eb.A0F(A0t(iA0W)).A0f()) {
                A14(iA0W, c03464w);
            }
        }
    }

    public void A1J(C03464w c03464w, AnonymousClass53 anonymousClass53, int i10, int i11) {
        this.A03.A1a(i10, i11);
    }

    public void A1K(C03464w c03464w, AnonymousClass53 anonymousClass53, View view, C03183s c03183s) {
        int iA0p = A21() ? A0p(view) : 0;
        int iA0p2 = A20() ? A0p(view) : 0;
        String[] strArr = A0J;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0J[3] = "h476R5jl";
        C03163q itemInfo = C03163q.A00(iA0p, 1, iA0p2, 1, false, false);
        c03183s.A0Q(itemInfo);
    }

    public final void A1L(AnonymousClass51 anonymousClass51) {
        AnonymousClass51 anonymousClass512 = this.A02;
        if (anonymousClass512 != null && anonymousClass51 != anonymousClass512 && anonymousClass512.A0F()) {
            this.A02.A09();
        }
        this.A02 = anonymousClass51;
        anonymousClass51.A0D(this.A03, this);
    }

    public void A1M(C0556Eb c0556Eb) {
    }

    public final void A1N(C0556Eb c0556Eb) {
        this.A07 = true;
    }

    public final void A1O(C0556Eb c0556Eb) {
        A11(View.MeasureSpec.makeMeasureSpec(c0556Eb.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c0556Eb.getHeight(), 1073741824));
    }

    public final void A1P(C0556Eb c0556Eb) {
        if (c0556Eb == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = c0556Eb;
            this.A01 = c0556Eb.A01;
            this.A0C = c0556Eb.getWidth();
            this.A0A = c0556Eb.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public final void A1Q(C0556Eb c0556Eb, C03464w c03464w) {
        this.A07 = false;
        A1w(c0556Eb, c03464w);
    }

    public final void A1R(boolean z10) {
        this.A06 = z10;
    }

    public final boolean A1S() {
        int iA0W = A0W();
        for (int i10 = 0; i10 < iA0W; i10++) {
            ViewGroup.LayoutParams layoutParams = A0t(i10).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A1T() {
        C0556Eb c0556Eb = this.A03;
        return c0556Eb != null && c0556Eb.A0B;
    }

    public final boolean A1U() {
        return this.A0E;
    }

    public final boolean A1V(int i10, Bundle bundle) {
        return A0Q(this.A03.A0r, this.A03.A0s, i10, bundle);
    }

    public final boolean A1W(View view, int i10, int i11, C03404p c03404p) {
        return (!view.isLayoutRequested() && this.A0F && A0O(view.getWidth(), i10, c03404p.width) && A0O(view.getHeight(), i11, c03404p.height)) ? false : true;
    }

    public final boolean A1X(View view, int i10, Bundle bundle) {
        return A0R(this.A03.A0r, this.A03.A0s, view, i10, bundle);
    }

    public boolean A1Y(C03404p c03404p) {
        return c03404p != null;
    }

    public final boolean A1Z(C0556Eb c0556Eb, View view, Rect rect, boolean z10) {
        return A1a(c0556Eb, view, rect, z10, false);
    }

    public final boolean A1a(C0556Eb c0556Eb, View view, Rect rect, boolean z10, boolean z11) {
        int[] scrollAmount = A0U(view, rect);
        int i10 = scrollAmount[0];
        int i11 = scrollAmount[1];
        if ((z11 && !A0S(c0556Eb, i10, i11)) || (i10 == 0 && i11 == 0)) {
            return false;
        }
        if (z10) {
            c0556Eb.scrollBy(i10, i11);
        } else {
            c0556Eb.A1c(i10, i11);
        }
        return true;
    }

    public final boolean A1b(C0556Eb c0556Eb, AnonymousClass53 anonymousClass53, View view, View view2) {
        return A0T(c0556Eb, view, view2);
    }

    public final boolean A1c(C0556Eb c0556Eb, ArrayList<View> views, int i10, int i11) {
        return false;
    }

    public View A1m(int i10) {
        int iA0W = A0W();
        for (int i11 = 0; i11 < iA0W; i11++) {
            View child = A0t(i11);
            AnonymousClass56 anonymousClass56A0F = C0556Eb.A0F(child);
            if (anonymousClass56A0F != null) {
                int childCount = anonymousClass56A0F.A0I();
                if (childCount == i10 && !anonymousClass56A0F.A0f() && (this.A03.A0s.A07() || !anonymousClass56A0F.A0a())) {
                    return child;
                }
            }
        }
        return null;
    }

    public void A1t(AccessibilityEvent accessibilityEvent) {
        A0K(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1v(AnonymousClass53 anonymousClass53) {
    }

    public void A1w(C0556Eb c0556Eb, C03464w c03464w) {
    }

    public void A1y(String str) {
        C0556Eb c0556Eb = this.A03;
        if (c0556Eb != null) {
            c0556Eb.A1l(str);
        }
    }
}
