package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class kv implements g3.f {

    /* renamed from: a, reason: collision with root package name */
    private final jv f11242a;

    /* renamed from: b, reason: collision with root package name */
    private final g3.b f11243b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.w f11244c = new d3.w();

    public kv(jv jvVar) {
        Context context;
        this.f11242a = jvVar;
        g3.b bVar = null;
        try {
            context = (Context) l4.b.L0(jvVar.g());
        } catch (RemoteException | NullPointerException e5) {
            ze0.e("", e5);
            context = null;
        }
        if (context != null) {
            g3.b bVar2 = new g3.b(context);
            try {
                if (true == this.f11242a.H0(l4.b.p1(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e10) {
                ze0.e("", e10);
            }
        }
        this.f11243b = bVar;
    }

    @Override // g3.f
    public final String a() {
        try {
            return this.f11242a.i();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    public final jv b() {
        return this.f11242a;
    }
}
