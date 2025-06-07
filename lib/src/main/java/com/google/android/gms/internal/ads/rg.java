package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class rg {

    /* renamed from: a, reason: collision with root package name */
    private String f14770a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f14771b;

    /* renamed from: c, reason: collision with root package name */
    private final ti f14772c = new ti();

    /* renamed from: d, reason: collision with root package name */
    private final zo f14773d = new zo(null);

    /* renamed from: e, reason: collision with root package name */
    private final List f14774e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    private final c63 f14775f = c63.u();

    /* renamed from: g, reason: collision with root package name */
    private final ds f14776g = new ds();

    /* renamed from: h, reason: collision with root package name */
    private final t00 f14777h = t00.f15623c;

    public final rg a(String str) {
        this.f14770a = str;
        return this;
    }

    public final rg b(Uri uri) {
        this.f14771b = uri;
        return this;
    }

    public final v30 c() {
        Uri uri = this.f14771b;
        cy cyVar = uri != null ? new cy(uri, null, null, null, this.f14774e, null, this.f14775f, null, null) : null;
        String str = this.f14770a;
        if (str == null) {
            str = "";
        }
        return new v30(str, new xm(this.f14772c, null), cyVar, new fu(this.f14776g), i90.f9626y, this.f14777h, null);
    }
}
