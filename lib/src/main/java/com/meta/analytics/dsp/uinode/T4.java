package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class T4 extends PQ {
    public static byte[] A0W;
    public static String[] A0X = {"zF", "YuhgBsbCJ4GENG72FYuTSQ3UxVCmrs0t", "RSfzcHToFNO8jc1tX2m0S0AZ0vbf9kKl", "p", "lGjhRdALEILVIUsiuWCm6MXJK2R8L6Co", "wXQvDYR5huLQKlTsBS5mG0rN7ygrQvR2", "AYgBJnzxyMi9rrwHO3oB8yOhTSWVLxNu", "3k2Jytm7iEKA6X2jmmGhgFSNDYaf4AHR"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public C1P A00;
    public L9 A01;
    public QM A02;
    public KI A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final C1073Yn A0C;
    public final AbstractC0792No A0D;
    public final ViewOnClickListenerC0945Tl A0E;
    public final InterfaceC0833Pd A0F;
    public final Q5 A0G;
    public final SF A0H;
    public final SA A0I;
    public final C9I A0J;
    public final AbstractC0850Pu A0K;
    public final AbstractC0848Ps A0L;
    public final AbstractC0817On A0M;
    public final O7 A0N;
    public final NX A0O;
    public final NQ A0P;
    public final LX A0Q;
    public final C0722Kw A0R;
    public final KP A0S;
    public final KA A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0W, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0W = new byte[]{-55, -43, -45, -108, -52, -57, -55, -53, -56, -43, -43, -47, -108, -57, -54, -39, -108, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, -108, -55, -46, -49, -55, -47, -53, -54, 27, 14, 32, 10, 27, 13, 14, 13, 8, 31, 18, 13, 14, 24};
    }

    static {
        A0D();
        A0b = (int) (LD.A02 * 48.0f);
        int iA01 = AbstractC02892p.A01(-1, 77);
        A0Z = iA01;
        A0g = (int) (LD.A02 * 26.0f);
        A0h = (int) (LD.A02 * 12.0f);
        A0d = (int) (LD.A02 * 12.0f);
        A0e = (int) (LD.A02 * 44.0f);
        A0c = (int) (LD.A02 * 8.0f);
        A0f = (int) (LD.A02 * 16.0f);
        A0a = AbstractC02892p.A01(iA01, 90);
        A0Y = (int) (LD.A02 * 4.0f);
    }

    public T4(C1073Yn c1073Yn, J2 j22, AbstractC1176b5 abstractC1176b5, C03786c c03786c, InterfaceC0761Mj interfaceC0761Mj, int i10, MC mc, JA ja2, int i11, int i12, int i13, boolean z10, int i14, boolean z11, boolean z12, boolean z13, InterfaceC0833Pd interfaceC0833Pd) {
        C1P c1pA00;
        super(c1073Yn, interfaceC0761Mj, j22, abstractC1176b5, i10, z12, z13, mc);
        this.A04 = false;
        this.A05 = false;
        this.A07 = false;
        AV av = new AV(this);
        this.A0O = av;
        AO ao = new AO(this);
        this.A0N = ao;
        A9 a92 = new A9(this);
        this.A0M = a92;
        A4 a42 = new A4(this);
        this.A0P = a42;
        A3 a32 = new A3(this);
        this.A0K = a32;
        A2 a22 = new A2(this);
        this.A0L = a22;
        this.A0C = c1073Yn;
        this.A0R = new C0722Kw(c1073Yn, ja2);
        this.A0S = new KP(c1073Yn);
        this.A0A = i14;
        this.A0V = z11;
        this.A09 = i11;
        this.A0B = i12;
        this.A0F = interfaceC0833Pd;
        this.A08 = i13;
        this.A0U = z10;
        this.A0G = new Q5(c1073Yn, j22, super.A05);
        if (i12 == 1) {
            c1pA00 = super.A05.A0w().A01();
        } else {
            c1pA00 = super.A05.A0w().A00();
        }
        this.A00 = c1pA00;
        SA sa2 = new SA(c1073Yn);
        this.A0I = sa2;
        sa2.getEventBus().A03(av, ao, a92, a42, a32, a22);
        C9I c9i = new C9I(c1073Yn, j22, sa2, abstractC1176b5.A12());
        this.A0J = c9i;
        A0C();
        sa2.setVideoURI(c03786c.A0S(super.A05.A0x().A0D().A08()));
        A0B();
        C0941Th c0941ThA05 = A05();
        this.A0D = c0941ThA05;
        KA ka2 = new KA(c0941ThA05, 400, 100, 0);
        this.A0T = ka2;
        ka2.A3Y(true, false);
        this.A0Q = new LX(true);
        A0E();
        ViewOnClickListenerC0945Tl cTAButton = c0941ThA05.getCTAButton();
        this.A0E = cTAButton;
        AbstractC0740Lo.A0G(AdError.NO_FILL_ERROR_CODE, cTAButton);
        A0A();
        A09();
        c0941ThA05.bringToFront();
        if (C0662Ih.A1W(c1073Yn)) {
            c1073Yn.A0A().AGv(sa2, super.A05.A12(), true);
        }
        if (C0662Ih.A1X(c1073Yn)) {
            this.A0H = new SF(c1073Yn, j22, sa2, super.A05.A12(), c9i, null);
        } else {
            this.A0H = null;
        }
    }

    private C0941Th A05() {
        String strA08;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (super.A05.A0P().equals(A08(37, 14, 125))) {
            strA08 = QP.A04.A02();
        } else {
            strA08 = A08(0, 37, 58);
        }
        C0941Th c0941Th = new C0941Th(this.A0C, A0b, super.A05.A0x().A0E().A00() == C1L.A05, getColors(), super.A05.A0x().A0F().A06(), strA08, super.A07, super.A09, super.A0B, super.A08, super.A05.A0y());
        AbstractC0740Lo.A0G(1008, c0941Th);
        c0941Th.A0A(this.A0B);
        addView(c0941Th, layoutParams);
        c0941Th.setInfo(super.A05.A0x().A0E(), super.A05.A0x().A0F(), super.A05.A12(), super.A05.A10().A01(), null);
        return c0941Th;
    }

    private void A09() {
        this.A0S.A06(-1, A0Z);
        KP kp = this.A0S;
        int i10 = A0h;
        kp.setPadding(i10, i10, i10, i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0g);
        layoutParams.addRule(12);
        addView(this.A0S, layoutParams);
    }

    private void A0A() {
        C0722Kw c0722Kw = this.A0R;
        int i10 = A0d;
        c0722Kw.setPadding(i10, i10, i10, i10);
        int i11 = A0e;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams.setMargins(0, MB.A00, A0c, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0I, videoViewParams);
        addView(this.A0R, layoutParams);
    }

    private void A0B() {
        postDelayed(new T7(this), C0662Ih.A0L(this.A0C));
    }

    private void A0C() {
        this.A0I.A0c(this.A0S);
        this.A0I.A0c(this.A0R);
        if (!TextUtils.isEmpty(super.A05.A0x().A0D().A07())) {
            C7R c7r = new C7R(this.A0C);
            this.A0I.A0c(c7r);
            c7r.setImage(super.A05.A0x().A0D().A07());
        }
        this.A0I.A0c(new C7H(this.A0C));
    }

    private final void A0E() {
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null) {
            KI ki = this.A03;
            if (ki != null) {
                this.A0Q.A0I(ki);
            }
            C1P c1pA01 = super.A05.A0w().A01();
            this.A0Q.A0I(new KC(this.A0D.getCTAButton(), 300, -1, c1pA01.A09(true)));
            int i10 = A0Z;
            int i11 = A0a;
            int i12 = A0Y;
            Drawable drawableA08 = AbstractC0740Lo.A08(i10, i11, i12);
            Drawable endDrawable = AbstractC0740Lo.A05(c1pA01.A08(true), i12);
            this.A0Q.A0I(new KM(this.A0D.getCTAButton(), 300, drawableA08, endDrawable));
            this.A0Q.A0I(new KF(expandableLayout, 150, false));
            this.A0Q.A9R(this.A0I);
            this.A0Q.A0H(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(AnonymousClass93 anonymousClass93) {
        if (this.A0I.getState() == RB.A02 && C0662Ih.A1D(this.A0C)) {
            postDelayed(new T6(this, anonymousClass93), 5000L);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A0z() {
        L9 l92 = this.A01;
        if (l92 != null) {
            l92.A06();
        }
        if (C0662Ih.A1W(this.A0C)) {
            this.A0C.A0A().AGk(this.A0I);
        }
        SF sf = this.A0H;
        if (sf != null) {
            sf.A0C();
        }
        SA sa2 = this.A0I;
        if (sa2 != null) {
            sa2.getEventBus().A04(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
            AbstractC0740Lo.A0H(this.A0I);
            this.A0I.A0V();
        }
        this.A0J.A0i();
        View[] viewArr = new View[3];
        viewArr[0] = this.A0I;
        KP kp = this.A0S;
        String[] strArr = A0X;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A0X[2] = "4e1dr9g4n9kT22ZIdoKy0n8REVoGbgbF";
        viewArr[1] = kp;
        viewArr[2] = this.A0R;
        AbstractC0740Lo.A0a(viewArr);
        super.A0B.A0V();
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A10() {
        this.A0C.A0E().A4F();
        this.A04 = true;
        AbstractC0740Lo.A0T(this);
        AbstractC0740Lo.A0H(this.A0I);
        AbstractC0740Lo.A0a(this.A0I, this.A0S, this.A0R);
        Pair<Q4, View> pairA03 = this.A0G.A03(this.A0E);
        View view = (View) pairA03.second;
        AbstractC0740Lo.A0G(1101, view);
        switch (PR.A00[((Q4) pairA03.first).ordinal()]) {
            case 1:
                this.A0D.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, MB.A00, 0, 0);
                layoutParams.addRule(2, this.A0D.getId());
                addView(view, layoutParams);
                break;
            case 2:
                AbstractC0740Lo.A0a(this.A0D);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                int i10 = A0f;
                layoutParams2.setMargins(i10, i10, i10, i10);
                addView(view, layoutParams2);
                break;
        }
        if (this.A08 == 0 && this.A0U) {
            if (this.A0V) {
                this.A0F.AGq();
            }
            L9 l92 = new L9(this.A0A, 100.0f, 100L, new Handler(Looper.getMainLooper()), new T5(this));
            this.A01 = l92;
            l92.A07();
            return;
        }
        this.A05 = true;
        this.A0F.AD7(true);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A11() {
        this.A0I.setVolume(super.A05.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0I.A0b(QM.A02, 20);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A12(boolean z10) {
        L9 l92 = this.A01;
        if (l92 != null) {
            l92.A06();
        }
        if (this.A0I.A0i()) {
            return;
        }
        this.A02 = this.A0I.getVideoStartReason();
        this.A06 = z10;
        this.A0I.A0e(false, 13);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A13(boolean z10) {
        QM qm;
        L9 l92 = this.A01;
        if (l92 != null && !l92.A05()) {
            L9 l93 = this.A01;
            if (A0X[5].charAt(17) != 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[7] = "pObqmm4LdTsqTcUgL7kozPbufRCkwYZC";
            strArr[6] = "5szeP9lNqMFVM0rzjOQcuK8NUDwg7u3G";
            l93.A07();
        }
        if (this.A04 || this.A0I.getState() == RB.A06 || (qm = this.A02) == null) {
            return;
        }
        if (!this.A06 || z10) {
            this.A0I.A0b(qm, 19);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A14() {
        if (this.A08 != 2 && super.A05.A0x().A0O() && !this.A04) {
            return true;
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A15() {
        return this.A04;
    }

    public C1P getColors() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public C0832Pc getFullScreenAdStyle() {
        return new C0832Pc(true, C0832Pc.A06, super.A05.A0w().A01(), ViewOnClickListenerC0945Tl.A08(super.A05), super.A05.A0w().A01().A07(true), super.A05.A0x().A0D().A07());
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public C0732Lg getTouchDataRecorder() {
        return super.A08;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1P c1pA00;
        super.onConfigurationChanged(configuration);
        if (!this.A04) {
            if (configuration.orientation == 1) {
                c1pA00 = super.A05.A0w().A01();
            } else {
                C1C c1cA0w = super.A05.A0w();
                if (A0X[4].charAt(4) != 'R') {
                    throw new RuntimeException();
                }
                A0X[1] = "uYIsd2DhsQ91Wp0xmXJ9348eeMLtSRMf";
                c1pA00 = c1cA0w.A00();
            }
            this.A00 = c1pA00;
            this.A0E.setViewShowsOverMedia(true);
            this.A0E.setUpButtonColors(this.A00);
            this.A0D.A0A(configuration.orientation);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null && z10 && this.A03 == null) {
            KI ki = new KI(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A03 = ki;
            this.A0Q.A0I(ki);
            this.A0Q.A0G();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A13(false);
        } else {
            A12(false);
        }
    }
}
