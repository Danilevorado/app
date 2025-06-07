package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lm0 {

    /* renamed from: a, reason: collision with root package name */
    private ff0 f11658a;

    /* renamed from: b, reason: collision with root package name */
    private Context f11659b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f11660c;

    public final lm0 c(Context context) {
        this.f11660c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f11659b = context;
        return this;
    }

    public final lm0 d(ff0 ff0Var) {
        this.f11658a = ff0Var;
        return this;
    }
}
