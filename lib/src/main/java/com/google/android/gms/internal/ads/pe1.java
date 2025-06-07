package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pe1 {

    /* renamed from: k, reason: collision with root package name */
    static final ImageView.ScaleType f13718k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    private final m3.p1 f13719a;

    /* renamed from: b, reason: collision with root package name */
    private final do2 f13720b;

    /* renamed from: c, reason: collision with root package name */
    private final ud1 f13721c;

    /* renamed from: d, reason: collision with root package name */
    private final pd1 f13722d;

    /* renamed from: e, reason: collision with root package name */
    private final cf1 f13723e;

    /* renamed from: f, reason: collision with root package name */
    private final kf1 f13724f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f13725g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f13726h;

    /* renamed from: i, reason: collision with root package name */
    private final eu f13727i;

    /* renamed from: j, reason: collision with root package name */
    private final md1 f13728j;

    public pe1(m3.p1 p1Var, do2 do2Var, ud1 ud1Var, pd1 pd1Var, cf1 cf1Var, kf1 kf1Var, Executor executor, Executor executor2, md1 md1Var) {
        this.f13719a = p1Var;
        this.f13720b = do2Var;
        this.f13727i = do2Var.f7450i;
        this.f13721c = ud1Var;
        this.f13722d = pd1Var;
        this.f13723e = cf1Var;
        this.f13724f = kf1Var;
        this.f13725g = executor;
        this.f13726h = executor2;
        this.f13728j = md1Var;
    }

    private static void h(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean i(ViewGroup viewGroup, boolean z10) {
        View viewQ = z10 ? this.f13722d.Q() : this.f13722d.R();
        if (viewQ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewQ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewQ.getParent()).removeView(viewQ);
        }
        viewGroup.addView(viewQ, ((Boolean) k3.w.c().b(ir.f10124w3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(ViewGroup viewGroup) {
        pd1 pd1Var = this.f13722d;
        if (pd1Var.Q() != null) {
            boolean z10 = viewGroup != null;
            if (pd1Var.N() == 2 || pd1Var.N() == 1) {
                this.f13719a.E(this.f13720b.f7447f, String.valueOf(pd1Var.N()), z10);
            } else if (pd1Var.N() == 6) {
                this.f13719a.E(this.f13720b.f7447f, "2", z10);
                this.f13719a.E(this.f13720b.f7447f, "1", z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void b(com.google.android.gms.internal.ads.mf1 r10) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe1.b(com.google.android.gms.internal.ads.mf1):void");
    }

    public final void c(mf1 mf1Var) {
        if (mf1Var == null || this.f13723e == null || mf1Var.g() == null || !this.f13721c.g()) {
            return;
        }
        try {
            mf1Var.g().addView(this.f13723e.a());
        } catch (zk0 e5) {
            m3.n1.l("web view can not be obtained", e5);
        }
    }

    public final void d(mf1 mf1Var) {
        if (mf1Var == null) {
            return;
        }
        Context context = mf1Var.e().getContext();
        if (m3.z0.h(context, this.f13721c.f16293a)) {
            if (!(context instanceof Activity)) {
                ze0.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f13724f == null || mf1Var.g() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f13724f.a(mf1Var.g(), windowManager), m3.z0.b());
            } catch (zk0 e5) {
                m3.n1.l("web view can not be obtained", e5);
            }
        }
    }

    public final void e(final mf1 mf1Var) {
        this.f13725g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ne1
            @Override // java.lang.Runnable
            public final void run() {
                this.f12593m.b(mf1Var);
            }
        });
    }

    public final boolean f(ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    public final boolean g(ViewGroup viewGroup) {
        return i(viewGroup, true);
    }
}
