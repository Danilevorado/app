package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class xu2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17815a;

    final void a(Context context) {
        fw2.b(context, "Application Context cannot be null");
        if (this.f17815a) {
            return;
        }
        this.f17815a = true;
        tv2.b().c(context);
        nv2 nv2VarA = nv2.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(nv2VarA);
        }
        dw2.d(context);
        pv2.b().c(context);
    }

    final boolean b() {
        return this.f17815a;
    }
}
