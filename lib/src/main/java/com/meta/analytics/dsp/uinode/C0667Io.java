package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Io, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0667Io {
    public final View A00;
    public final C1072Ym A01;
    public final J2 A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C0667Io(C1072Ym c1072Ym, View view, String str, boolean z10, boolean z11) {
        this.A03 = str;
        this.A01 = c1072Ym;
        this.A02 = c1072Ym.A09();
        this.A00 = view;
        this.A05 = z11;
        this.A06 = z10;
    }

    public final View A00() {
        return this.A00;
    }

    public final C1072Ym A01() {
        return this.A01;
    }

    public final J2 A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
