package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03525c {
    public static C0S A00(Context context, InterfaceC04027h interfaceC04027h) {
        return A01(context, interfaceC04027h, null);
    }

    public static C0S A01(Context context, InterfaceC04027h interfaceC04027h, String str) {
        C1072Ym sdkContext = A09(context);
        C0W c0wA77 = interfaceC04027h.A77(sdkContext);
        if (c0wA77 != null) {
            return str != null ? c0wA77.AAJ(str) : c0wA77.AAI();
        }
        return new C1208bb();
    }

    public static C1073Yn A02(Activity activity) {
        return new C1073Yn(activity, (InterfaceC04027h) A0A(), A00(activity, A0A()));
    }

    public static C1073Yn A03(Context context) {
        return new C1073Yn(context, A0A(), new C1208bb());
    }

    public static C1073Yn A04(Context context) {
        if (C0662Ih.A0r(context)) {
            return new C1073Yn(context, A0A(), A00(context, A0A()));
        }
        return A03(context);
    }

    public static C1073Yn A05(Context context, String str) {
        return new C1073Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1073Yn A06(Context context, String str) {
        return new C1073Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1073Yn A07(Context context, String str) {
        return new C1073Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static EQ A08(Context context) {
        return new EQ(context, A0A(), A0A().A77(A09(context)));
    }

    public static C1072Ym A09(Context context) {
        return new C1072Ym(context, A0A());
    }

    public static synchronized YL A0A() {
        return YL.A02();
    }
}
