package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class fl0 implements gy {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hl0 f8318a;

    fl0(hl0 hl0Var) {
        this.f8318a = hl0Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i10 = Integer.parseInt(str);
                synchronized (this.f8318a) {
                    hl0 hl0Var = this.f8318a;
                    if (hl0Var.R != i10) {
                        hl0Var.R = i10;
                        this.f8318a.requestLayout();
                    }
                }
            } catch (Exception e5) {
                ze0.h("Exception occurred while getting webview content height", e5);
            }
        }
    }
}
