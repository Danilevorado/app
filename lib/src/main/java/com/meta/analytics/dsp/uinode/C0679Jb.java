package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0679Jb {
    public final AdErrorType A00;
    public final String A01;

    public C0679Jb(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public C0679Jb(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C0679Jb A00(AdErrorType adErrorType) {
        return new C0679Jb(adErrorType, (String) null);
    }

    public static C0679Jb A01(AdErrorType adErrorType, String str) {
        return new C0679Jb(adErrorType, str);
    }

    public static C0679Jb A02(C0680Jc c0680Jc) {
        return new C0679Jb(c0680Jc.A00(), c0680Jc.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
