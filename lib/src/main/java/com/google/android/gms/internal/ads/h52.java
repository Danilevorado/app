package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h52 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f9007a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final qk1 f9008b;

    public h52(qk1 qk1Var) {
        this.f9008b = qk1Var;
    }

    public final l50 a(String str) {
        if (this.f9007a.containsKey(str)) {
            return (l50) this.f9007a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.f9007a.put(str, this.f9008b.b(str));
        } catch (RemoteException e5) {
            ze0.e("Couldn't create RTB adapter : ", e5);
        }
    }
}
