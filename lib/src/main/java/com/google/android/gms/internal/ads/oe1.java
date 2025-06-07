package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class oe1 implements du {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mf1 f13174a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f13175b;

    oe1(mf1 mf1Var, ViewGroup viewGroup) {
        this.f13174a = mf1Var;
        this.f13175b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.du
    public final JSONObject a() {
        return this.f13174a.p();
    }

    @Override // com.google.android.gms.internal.ads.du
    public final JSONObject b() {
        return this.f13174a.o();
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void c(MotionEvent motionEvent) {
        this.f13174a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.du
    public final void d() {
        mf1 mf1Var = this.f13174a;
        c63 c63Var = le1.A;
        Map mapN = mf1Var.n();
        if (mapN == null) {
            return;
        }
        int size = c63Var.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = mapN.get((String) c63Var.get(i10));
            i10++;
            if (obj != null) {
                this.f13174a.onClick(this.f13175b);
                return;
            }
        }
    }
}
