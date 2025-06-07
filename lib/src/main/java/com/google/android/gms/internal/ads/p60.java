package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import r3.c;

/* loaded from: classes.dex */
public final class p60 extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f13597a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private String f13598b;

    public p60(ju juVar) {
        try {
            this.f13598b = juVar.h();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            this.f13598b = "";
        }
        try {
            for (Object obj : juVar.g()) {
                qu quVarL5 = obj instanceof IBinder ? pu.L5((IBinder) obj) : null;
                if (quVarL5 != null) {
                    this.f13597a.add(new q60(quVarL5));
                }
            }
        } catch (RemoteException e10) {
            ze0.e("", e10);
        }
    }
}
