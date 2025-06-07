package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class v70 {

    /* renamed from: d, reason: collision with root package name */
    private static rd0 f16620d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16621a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.b f16622b;

    /* renamed from: c, reason: collision with root package name */
    private final k3.t2 f16623c;

    public v70(Context context, d3.b bVar, k3.t2 t2Var) {
        this.f16621a = context;
        this.f16622b = bVar;
        this.f16623c = t2Var;
    }

    public static rd0 a(Context context) {
        rd0 rd0Var;
        synchronized (v70.class) {
            if (f16620d == null) {
                f16620d = k3.t.a().n(context, new l30());
            }
            rd0Var = f16620d;
        }
        return rd0Var;
    }

    public final void b(t3.b bVar) {
        String str;
        rd0 rd0VarA = a(this.f16621a);
        if (rd0VarA == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            l4.a aVarP1 = l4.b.p1(this.f16621a);
            k3.t2 t2Var = this.f16623c;
            try {
                rd0VarA.b5(aVarP1, new vd0(null, this.f16622b.name(), null, t2Var == null ? new k3.d4().a() : k3.g4.f24647a.a(this.f16621a, t2Var)), new u70(this, bVar));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        bVar.a(str);
    }
}
