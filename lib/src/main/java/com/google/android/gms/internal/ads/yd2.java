package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class yd2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f17979a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f17980b;

    /* renamed from: c, reason: collision with root package name */
    private final ff0 f17981c;

    yd2(bb3 bb3Var, Context context, ff0 ff0Var) {
        this.f17979a = bb3Var;
        this.f17980b = context;
        this.f17981c = ff0Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f17979a.g(new Callable() { // from class: com.google.android.gms.internal.ads.xd2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f17517a.c();
            }
        });
    }

    final /* synthetic */ zd2 c() {
        boolean zG = k4.c.a(this.f17980b).g();
        j3.t.r();
        boolean zW = m3.b2.W(this.f17980b);
        String str = this.f17981c.f8252m;
        j3.t.r();
        boolean zA = m3.b2.a();
        j3.t.r();
        ApplicationInfo applicationInfo = this.f17980b.getApplicationInfo();
        return new zd2(zG, zW, str, zA, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.c(this.f17980b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f17980b, ModuleDescriptor.MODULE_ID));
    }
}
