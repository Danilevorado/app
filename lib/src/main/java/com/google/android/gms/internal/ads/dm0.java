package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* loaded from: classes.dex */
public final class dm0 extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private Activity f7406a;

    /* renamed from: b, reason: collision with root package name */
    private Context f7407b;

    /* renamed from: c, reason: collision with root package name */
    private Context f7408c;

    public dm0(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity a() {
        return this.f7406a;
    }

    public final Context b() {
        return this.f7408c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f7408c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7407b = applicationContext;
        this.f7406a = context instanceof Activity ? (Activity) context : null;
        this.f7408c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f7406a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f7407b.startActivity(intent);
        }
    }
}
