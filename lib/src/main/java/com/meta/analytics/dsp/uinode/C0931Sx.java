package com.meta.analytics.dsp.uinode;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Sx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0931Sx extends PQ {
    public static byte[] A0k;
    public static String[] A0l = {"b5G1zrconZ3ixGT2ifmSYAvyf5qvuioM", "E7ePxMRKQj8Nsj11XAZX", "RYnvJIfy7H", "sKG7dsg9roBnaoP9H0Iom", "yy1EwMPcWWjeWCkN0IqWpK5f1Ty7r3W9", "FDFB", "dmJ0BH5on1aQmIo20RUb8HXj8gaX6ja3", "K5zlHDBh8uRMDNRgQaLPbhL7f5pOjpiq"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C1P A0D;
    public NJ A0E;
    public NK A0F;
    public U1 A0G;
    public C0818Oo A0H;
    public QM A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final AbstractC02300h A0T;
    public final C1073Yn A0U;
    public final JA A0V;
    public final FullScreenAdToolbar A0W;
    public final InterfaceC0833Pd A0X;
    public final SF A0Y;
    public final SA A0Z;
    public final C9I A0a;
    public final AbstractC0850Pu A0b;
    public final AbstractC0848Ps A0c;
    public final AbstractC0817On A0d;
    public final O7 A0e;
    public final NX A0f;
    public final NQ A0g;
    public final C0722Kw A0h;
    public final KP A0i;
    public final Runnable A0j;

    public static String A0M(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0k, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0Y() {
        A0k = new byte[]{-28, -19, -22, -28, -20, -32, -12, -16, -10, -13, -28, -26, -65, -67, -52, -86, -71, -49, -96, -67, -63, -65, -64, -52, -50, -45, -43, -38, -39, -60, -46, -54, -39, -51, -44, -55, 23, 21, 7, 20, 5, 14, 11, 5, 13, 1, 8, 11, 14, 22, 7, 20, 7, 6, 1, -13, -8, -18, -7, 1, 14};
    }

    static {
        A0Y();
        A0m = (int) (LD.A02 * 4.0f);
        A0n = (int) (LD.A02 * 8.0f);
        A0o = AbstractC02892p.A01(-1, 77);
        A0s = (int) (LD.A02 * 26.0f);
        A0t = (int) (LD.A02 * 12.0f);
        A0q = (int) (LD.A02 * 12.0f);
        A0r = (int) (LD.A02 * 44.0f);
        A0p = (int) (LD.A02 * 8.0f);
    }

    public C0931Sx(C1073Yn c1073Yn, J2 j22, FullScreenAdToolbar fullScreenAdToolbar, AbstractC1176b5 abstractC1176b5, C03786c c03786c, InterfaceC0761Mj interfaceC0761Mj, int i10, MC mc, JA ja2, int i11, boolean z10, boolean z11, InterfaceC0833Pd interfaceC0833Pd) {
        C1P c1pA00;
        super(c1073Yn, interfaceC0761Mj, j22, abstractC1176b5, i10, z10, z11, mc);
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0j = new PZ(this);
        this.A0L = false;
        this.A0S = false;
        this.A01 = 0.0f;
        A1 a12 = new A1(this);
        this.A0f = a12;
        O7 o72 = new O7() { // from class: com.facebook.ads.redexgen.X.9z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o82) {
                if (!((PQ) this.A00).A08.A07()) {
                    this.A00.A03();
                }
            }
        };
        this.A0e = o72;
        AbstractC0817On abstractC0817On = new AbstractC0817On() { // from class: com.facebook.ads.redexgen.X.9y
            @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
            public final /* bridge */ /* synthetic */ void A03(C04338q c04338q) {
            }
        };
        this.A0d = abstractC0817On;
        NQ nq = new NQ() { // from class: com.facebook.ads.redexgen.X.9d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass93 anonymousClass93) {
                this.A00.A0g(anonymousClass93);
                this.A00.A0X.ABY((this.A00.A01 * this.A00.A0Z.getDuration()) + anonymousClass93.A00());
            }
        };
        this.A0g = nq;
        AbstractC0850Pu abstractC0850Pu = new AbstractC0850Pu() { // from class: com.facebook.ads.redexgen.X.9b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC04358s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                this.A00.A0X.ABH(this.A00.A0Z.getDuration());
                C0931Sx.A06(this.A00, 1.0f);
                this.A00.A0Z.A0b(QM.A02, 28);
            }
        };
        this.A0b = abstractC0850Pu;
        C04429a c04429a = new C04429a(this);
        this.A0c = c04429a;
        this.A0W = fullScreenAdToolbar;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c1073Yn.getSystemService(A0M(24, 12, 53));
        this.A0T = C02310i.A01(c1073Yn, j22, abstractC1176b5.A12(), AbstractC0724Ky.A00(abstractC1176b5.A0x().A0F().A05()), new HashMap(), false, true, abstractC1176b5.A0y());
        this.A0U = c1073Yn;
        this.A0V = ja2;
        this.A0h = new C0722Kw(c1073Yn, ja2);
        this.A0i = new KP(c1073Yn);
        this.A0X = interfaceC0833Pd;
        if (i11 == 1) {
            c1pA00 = super.A05.A0w().A01();
        } else {
            c1pA00 = super.A05.A0w().A00();
        }
        this.A0D = c1pA00;
        SA sa2 = new SA(c1073Yn);
        this.A0Z = sa2;
        sa2.getEventBus().A03(a12, o72, abstractC0817On, nq, abstractC0850Pu, c04429a);
        C9I c9i = new C9I(c1073Yn, j22, sa2, abstractC1176b5.A12());
        this.A0a = c9i;
        A0V();
        sa2.setVideoURI(c03786c.A0S(super.A05.A0x().A0D().A08()));
        A0S();
        A0P();
        A0O();
        OA.A00(c1073Yn, this, abstractC1176b5.A0x().A0D().A07());
        setupLayoutConfiguration(false);
        A0U();
        A0T();
        postDelayed(new C0932Sy(this), 1000L);
        if (C0662Ih.A1W(c1073Yn)) {
            c1073Yn.A0A().AGv(sa2, super.A05.A12(), true);
        }
        if (C0662Ih.A1X(c1073Yn)) {
            this.A0Y = new SF(c1073Yn, j22, sa2, super.A05.A12(), c9i, null);
        } else {
            this.A0Y = null;
        }
        A0Z(abstractC1176b5.A0x());
    }

    public static /* synthetic */ float A06(C0931Sx c0931Sx, float f5) {
        float f10 = c0931Sx.A01 + f5;
        c0931Sx.A01 = f10;
        return f10;
    }

    public static /* synthetic */ int A08(C0931Sx c0931Sx) {
        int i10 = c0931Sx.A02;
        c0931Sx.A02 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A0A(C0931Sx c0931Sx) {
        int i10 = c0931Sx.A07;
        c0931Sx.A07 = i10 + 1;
        return i10;
    }

    private void A0N() {
        int i10;
        AbstractC0740Lo.A0J(this.A0B);
        LinearLayout linearLayout = new LinearLayout(this.A0U);
        this.A0B = linearLayout;
        AbstractC0740Lo.A0R(linearLayout, this.A0U);
        if (this.A0J) {
            int i11 = this.A04;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0l;
            strArr2[3] = "eARj3wLLoGbDJmJ7QaGG8";
            strArr2[2] = "iGp5YEz0aP";
            i10 = i11 / 4;
        } else {
            i10 = this.A04 / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i10);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0O() {
        this.A0i.A06(-1, A0o);
        KP kp = this.A0i;
        int i10 = A0t;
        kp.setPadding(i10, i10, i10, i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0s);
        layoutParams.addRule(12);
        addView(this.A0i, layoutParams);
    }

    private void A0P() {
        C0722Kw c0722Kw = this.A0h;
        int i10 = A0q;
        c0722Kw.setPadding(i10, i10, i10, i10);
        int i11 = A0r;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams.setMargins(0, MB.A00, A0p, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0Z, videoViewParams);
        addView(this.A0h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q() {
        if (super.A05.A0l() && this.A0L) {
            this.A0L = false;
            A0i(A0M(36, 18, 114));
        }
    }

    private void A0R() {
        if (super.A05.A0l()) {
            boolean z10 = this.A0L;
            String[] strArr = A0l;
            if (strArr[3].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A0l[1] = "kkPn6UZbIf4yuCbsGSZ";
            if (z10) {
                this.A0L = false;
                Map<String, String> mapA05 = new C0786Ni().A03(null).A02(null).A05();
                mapA05.put(A0M(0, 12, 81), A0M(36, 18, 114));
                super.A07.A9W(super.A05.A12(), mapA05);
            }
        }
    }

    private void A0S() {
        postDelayed(new T0(this), C0662Ih.A0L(this.A0U));
    }

    private void A0T() {
        AbstractC0740Lo.A0J(this.A0A);
        LinearLayout linearLayout = new LinearLayout(this.A0U);
        this.A0A = linearLayout;
        linearLayout.setOrientation(1);
        AbstractC0740Lo.A0K(this.A0A);
        A0W();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0U() {
        View view = this.A0Z;
        if (super.A05.A0l()) {
            view.setOnClickListener(new ViewOnClickListenerC0831Pb(this));
        }
        AbstractC0740Lo.A0J(view);
        AbstractC0740Lo.A0K(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        TextView textView = new TextView(this.A0U);
        this.A0C = textView;
        AbstractC0740Lo.A0K(textView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A05(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i10 = A0n;
        layoutParams.setMargins(i10, i10 / 2, i10, A0s);
        View mMediaView = this.A0C;
        addView(mMediaView, layoutParams);
        View mMediaView2 = this.A0C;
        AbstractC0740Lo.A0K(mMediaView2);
        C0818Oo c0818Oo = new C0818Oo(this.A0U, super.A05, super.A07, super.A09, super.A0B, super.A08, getColors(), new T3(this));
        this.A0H = c0818Oo;
        AbstractC0740Lo.A0G(AdError.NO_FILL_ERROR_CODE, c0818Oo);
        View mMediaView3 = this.A0H;
        addView(mMediaView3);
        A0X();
        A0N();
        if (C0662Ih.A0y(this.A0U)) {
            this.A0B.setOnClickListener(new PT(this));
            View mMediaView4 = this.A0W;
            if (mMediaView4 != null) {
                this.A0W.setCTAClickListener(new PU(this));
            }
        }
    }

    private void A0V() {
        this.A0Z.A0c(this.A0i);
        this.A0Z.A0c(this.A0h);
        if (!TextUtils.isEmpty(super.A05.A0x().A0D().A07())) {
            C7R c7r = new C7R(this.A0U);
            this.A0Z.A0c(c7r);
            c7r.setImage(super.A05.A0x().A0D().A07());
        }
        this.A0Z.A0c(new C7H(this.A0U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            int i10 = this.A05;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            A0l[5] = "KzfN";
            layoutParams.setMargins(0, i10 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        this.A0A.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0X() {
        int i10;
        if (this.A0J) {
            i10 = this.A04 / 4;
        } else {
            int i11 = this.A04;
            String[] strArr = A0l;
            if (strArr[7].charAt(25) != strArr[0].charAt(25)) {
                throw new RuntimeException();
            }
            A0l[5] = "tQDw";
            i10 = i11 / 5;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i10);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0Z(C1G c1g) {
        double dA00 = OI.A00(c1g);
        String strA05 = c1g.A0E().A05();
        if (strA05 == null || strA05.trim().length() == 0) {
            AbstractC0740Lo.A0N(this.A0B, 8);
            if (C0662Ih.A0y(this.A0U)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(strA05);
            if (C0662Ih.A0y(this.A0U)) {
                this.A0B.setClickable(true);
            }
        }
        if (dA00 > 0.0d) {
            this.A03 = (int) (this.A06 / dA00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(AnonymousClass93 anonymousClass93) {
        if (this.A0Z.getState() == RB.A02 && C0662Ih.A1D(this.A0U)) {
            postDelayed(new C0933Sz(this, anonymousClass93), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(String str) {
        U1 u12;
        AbstractC0740Lo.A0J(this.A0G);
        T2 t22 = new T2(this);
        if (this.A0U.A0D() == null) {
            this.A0U.A0E().A8e();
        }
        if (AbstractC0663Ii.A02(this.A0U) || this.A0U.A0D() == null) {
            u12 = new U1(this.A0U, t22);
        } else {
            C1073Yn c1073Yn = this.A0U;
            u12 = new U1(c1073Yn, c1073Yn.A0D(), t22);
        }
        this.A0G = u12;
        u12.setOnTouchListener(new PV(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0i(String str) {
        Map<String, String> mapA05 = new C0786Ni().A03(null).A02(null).A05();
        mapA05.put(A0M(0, 12, 81), str);
        this.A0V.A04(J9.A0J, mapA05);
        super.A09.A43(super.A05.A0L());
        super.A07.A9j(super.A05.A12(), mapA05);
        if (C0662Ih.A20(this.A0U)) {
            HashMap map = new HashMap();
            map.put(AbstractC1206bZ.A03, Boolean.TRUE.toString());
            map.put(AbstractC1206bZ.A04, Boolean.TRUE.toString());
            map.put(AbstractC1206bZ.A05, Boolean.TRUE.toString());
            super.A07.A9s(super.A05.A12(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0j(String str) {
        if (super.A05.A0u() > 0) {
            if (super.A05.A19() && this.A0M) {
                return;
            }
            this.A0M = true;
            A0i(str);
            return;
        }
        if (super.A05.A0k()) {
            A0Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0k(boolean z10) {
        this.A0K = z10;
        ObjectAnimator objectAnimatorOfFloat = null;
        if (!z10) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        String strA0M = A0M(60, 1, 101);
        if (z10) {
            C0818Oo c0818Oo = this.A0H;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(c0818Oo, strA0M, c0818Oo.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        fArr[1] = i10;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, strA0M, fArr);
        objectAnimatorOfFloat2.setDuration(500L);
        SA sa2 = this.A0Z;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(sa2, strA0M, sa2.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int[] iArr = new int[2];
        iArr[0] = this.A0Z.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        iArr[1] = i11;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new PX(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, browserTransAnim, duration);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(500L);
            animatorSet.playTogether(objectAnimatorOfFloat);
        }
        animatorSet.addListener(new PY(this, z10));
        animatorSet.start();
    }

    private void A0l(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        AbstractC0740Lo.A0J(this.A0Z);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0T();
        }
        this.A0Z.setTranslationY(0.0f);
        addView(this.A0Z, 1, layoutParams);
        A0N();
        A0X();
    }

    private final boolean A0m() {
        return this.A0K;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A0z() {
        A0R();
        if (C0662Ih.A1W(this.A0U)) {
            this.A0U.A0A().AGk(this.A0Z);
        }
        SF sf = this.A0Y;
        if (sf != null) {
            sf.A0C();
        }
        SA sa2 = this.A0Z;
        if (sa2 != null) {
            C04348r<AbstractC04358s, C04338q> eventBus = sa2.getEventBus();
            AbstractC04358s[] abstractC04358sArr = new AbstractC04358s[6];
            abstractC04358sArr[0] = this.A0f;
            abstractC04358sArr[1] = this.A0e;
            abstractC04358sArr[2] = this.A0d;
            NQ nq = this.A0g;
            String[] strArr = A0l;
            if (strArr[6].charAt(10) == strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            A0l[5] = "F6CS";
            abstractC04358sArr[3] = nq;
            abstractC04358sArr[4] = this.A0b;
            abstractC04358sArr[5] = this.A0c;
            eventBus.A04(abstractC04358sArr);
            AbstractC0740Lo.A0H(this.A0Z);
            this.A0Z.A0V();
        }
        this.A0a.A0i();
        AbstractC0740Lo.A0a(this.A0Z, this.A0i, this.A0h);
        super.A0B.A0V();
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A10() {
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A11() {
        this.A0Z.setVolume(super.A05.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0Z.A0b(QM.A02, 20);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A12(boolean z10) {
        if (this.A0Z.A0i()) {
            return;
        }
        this.A0I = this.A0Z.getVideoStartReason();
        this.A0R = z10;
        this.A0Z.A0e(false, 13);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A13(boolean z10) {
        QM qm;
        if (this.A0Z.getState() == RB.A06 || (qm = this.A0I) == null) {
            return;
        }
        if (!this.A0R || z10) {
            this.A0Z.A0b(qm, 19);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A14() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A15() {
        return false;
    }

    public C1P getColors() {
        return this.A0D;
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
        super.onConfigurationChanged(configuration);
        A0l(A0m());
        setupLayoutConfiguration(A0m());
        A0W();
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

    private void setUpBrowserControls(U1 u12) {
        AbstractC0740Lo.A0J(this.A0E);
        NJ nj = new NJ(this.A0U, u12);
        this.A0E = nj;
        u12.setBrowserNavigationListener(nj.getBrowserNavigationListener());
        AbstractC0740Lo.A0K(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new T1(this));
        this.A0E.setOnTouchListener(new PW(this));
        this.A0A.addView(this.A0E, layoutParams);
        AbstractC0740Lo.A0J(this.A0F);
        this.A0F = new NK(this.A0U, null, R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0m));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0U.getSystemService(A0M(54, 6, 90));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    try {
                        Integer num = (Integer) Display.class.getMethod(A0M(12, 12, 40), new Class[0]).invoke(defaultDisplay, new Object[0]);
                        point.y = num != null ? num.intValue() : 0;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
