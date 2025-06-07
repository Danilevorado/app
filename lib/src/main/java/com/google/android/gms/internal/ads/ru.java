package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ru extends g3.d {

    /* renamed from: a, reason: collision with root package name */
    private final qu f14965a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f14966b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f14967c;

    /* renamed from: d, reason: collision with root package name */
    private final double f14968d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14969e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14970f;

    public ru(qu quVar) {
        double dB;
        int iF;
        l4.a aVarE;
        this.f14965a = quVar;
        Uri uriC = null;
        try {
            aVarE = quVar.e();
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
        Drawable drawable = aVarE != null ? (Drawable) l4.b.L0(aVarE) : null;
        this.f14966b = drawable;
        try {
            uriC = this.f14965a.c();
        } catch (RemoteException e10) {
            ze0.e("", e10);
        }
        this.f14967c = uriC;
        try {
            dB = this.f14965a.b();
        } catch (RemoteException e11) {
            ze0.e("", e11);
            dB = 1.0d;
        }
        this.f14968d = dB;
        int iD = -1;
        try {
            iF = this.f14965a.f();
        } catch (RemoteException e12) {
            ze0.e("", e12);
            iF = -1;
        }
        this.f14969e = iF;
        try {
            iD = this.f14965a.d();
        } catch (RemoteException e13) {
            ze0.e("", e13);
        }
        this.f14970f = iD;
    }

    @Override // g3.d
    public final Drawable a() {
        return this.f14966b;
    }

    @Override // g3.d
    public final double b() {
        return this.f14968d;
    }

    @Override // g3.d
    public final Uri c() {
        return this.f14967c;
    }

    @Override // g3.d
    public final int d() {
        return this.f14970f;
    }

    @Override // g3.d
    public final int e() {
        return this.f14969e;
    }
}
