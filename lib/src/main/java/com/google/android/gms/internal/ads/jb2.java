package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class jb2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f10416a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f10417b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f10418c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f10419d;

    public jb2(bb3 bb3Var, ViewGroup viewGroup, Context context, Set set) {
        this.f10416a = bb3Var;
        this.f10419d = set;
        this.f10417b = viewGroup;
        this.f10418c = context;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f10416a.g(new Callable() { // from class: com.google.android.gms.internal.ads.ib2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9667a.c();
            }
        });
    }

    final /* synthetic */ kb2 c() {
        if (((Boolean) k3.w.c().b(ir.A5)).booleanValue() && this.f10417b != null && this.f10419d.contains("banner")) {
            return new kb2(Boolean.valueOf(this.f10417b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) k3.w.c().b(ir.B5)).booleanValue() && this.f10419d.contains("native")) {
            Context context = this.f10418c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new kb2(boolValueOf);
            }
        }
        return new kb2(null);
    }
}
