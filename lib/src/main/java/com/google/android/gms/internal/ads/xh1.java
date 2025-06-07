package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class xh1 implements du {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f17558a = "_videoMediaView";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh1 f17559b;

    xh1(yh1 yh1Var, String str) {
        this.f17559b = yh1Var;
    }

    @Override // com.google.android.gms.internal.ads.du
    public final JSONObject a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.du
    public final JSONObject b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void c(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void d() {
        yh1 yh1Var = this.f17559b;
        if (yh1Var.f18050p != null) {
            yh1Var.f18050p.l(this.f17558a);
        }
    }
}
