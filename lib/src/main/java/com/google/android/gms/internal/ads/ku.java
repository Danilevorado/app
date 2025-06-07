package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ku extends g3.c {

    /* renamed from: a, reason: collision with root package name */
    private final ju f11236a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11237b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f11238c;

    public ku(ju juVar) {
        IBinder iBinder;
        this.f11236a = juVar;
        try {
            this.f11238c = juVar.h();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            this.f11238c = "";
        }
        try {
            for (Object obj : juVar.g()) {
                qu ouVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    ouVar = iInterfaceQueryLocalInterface instanceof qu ? (qu) iInterfaceQueryLocalInterface : new ou(iBinder);
                }
                if (ouVar != null) {
                    this.f11237b.add(new ru(ouVar));
                }
            }
        } catch (RemoteException e10) {
            ze0.e("", e10);
        }
    }
}
