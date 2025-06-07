package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import r3.c;

/* loaded from: classes.dex */
public final class q60 extends c.b {

    /* renamed from: a, reason: collision with root package name */
    private final qu f14160a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f14161b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f14162c;

    /* renamed from: d, reason: collision with root package name */
    private final double f14163d;

    public q60(qu quVar) {
        double dB;
        l4.a aVarE;
        this.f14160a = quVar;
        Uri uriC = null;
        try {
            aVarE = quVar.e();
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
        Drawable drawable = aVarE != null ? (Drawable) l4.b.L0(aVarE) : null;
        this.f14161b = drawable;
        try {
            uriC = this.f14160a.c();
        } catch (RemoteException e10) {
            ze0.e("", e10);
        }
        this.f14162c = uriC;
        try {
            dB = this.f14160a.b();
        } catch (RemoteException e11) {
            ze0.e("", e11);
            dB = 1.0d;
        }
        this.f14163d = dB;
        try {
            this.f14160a.f();
        } catch (RemoteException e12) {
            ze0.e("", e12);
        }
        try {
            this.f14160a.d();
        } catch (RemoteException e13) {
            ze0.e("", e13);
        }
    }
}
