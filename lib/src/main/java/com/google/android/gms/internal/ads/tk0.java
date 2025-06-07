package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class tk0 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f15877a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f15878b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f15879c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ vk0 f15880d;

    tk0(vk0 vk0Var, List list, String str, Uri uri) {
        this.f15880d = vk0Var;
        this.f15877a = list;
        this.f15878b = str;
        this.f15879c = uri;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        ze0.g("Failed to parse gmsg params for: ".concat(String.valueOf(this.f15879c)));
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f15880d.o((Map) obj, this.f15877a, this.f15878b);
    }
}
