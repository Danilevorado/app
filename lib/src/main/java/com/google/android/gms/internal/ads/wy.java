package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class wy implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final vy f17292a;

    public wy(vy vyVar) {
        this.f17292a = vyVar;
    }

    public static void b(nk0 nk0Var, vy vyVar) {
        nk0Var.O0("/reward", new wy(vyVar));
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f17292a.d();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f17292a.b();
                    return;
                }
                return;
            }
        }
        na0 na0Var = null;
        try {
            int i10 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                na0Var = new na0(str2, i10);
            }
        } catch (NumberFormatException e5) {
            ze0.h("Unable to parse reward amount.", e5);
        }
        this.f17292a.M(na0Var);
    }
}
