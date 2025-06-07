package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class vd2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16658a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16659b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16660c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16661d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f16662e;

    public vd2(String str, String str2, String str3, String str4, Long l10) {
        this.f16658a = str;
        this.f16659b = str2;
        this.f16660c = str3;
        this.f16661d = str4;
        this.f16662e = l10;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        qo2.c(bundle, "gmp_app_id", this.f16658a);
        qo2.c(bundle, "fbs_aiid", this.f16659b);
        qo2.c(bundle, "fbs_aeid", this.f16660c);
        qo2.c(bundle, "apm_id_origin", this.f16661d);
        Long l10 = this.f16662e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
