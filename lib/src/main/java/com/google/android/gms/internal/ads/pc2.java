package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class pc2 implements ke2, je2 {

    /* renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f13686a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f13687b;

    pc2(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f13686a = applicationInfo;
        this.f13687b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.h(this);
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f13686a.packageName;
        PackageInfo packageInfo = this.f13687b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f13687b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }
}
