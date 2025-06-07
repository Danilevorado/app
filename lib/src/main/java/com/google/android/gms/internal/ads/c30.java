package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class c30 extends ef0 {

    /* renamed from: b, reason: collision with root package name */
    private final b30 f6765b;

    public c30(b30 b30Var, String str) {
        super(str);
        this.f6765b = b30Var;
    }

    @Override // com.google.android.gms.internal.ads.ef0, com.google.android.gms.internal.ads.re0
    public final boolean o(String str) {
        ze0.b("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        ze0.b("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.o(str);
    }
}
