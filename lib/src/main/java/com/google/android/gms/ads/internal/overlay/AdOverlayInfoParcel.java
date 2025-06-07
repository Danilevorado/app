package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.f91;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.jy1;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.ws2;
import com.google.android.gms.internal.ads.xm1;
import com.google.android.gms.internal.ads.xw;
import com.google.android.gms.internal.ads.y11;
import com.google.android.gms.internal.ads.zw;
import f4.c;
import j3.j;
import k3.w;
import l3.e0;
import l3.i;
import l3.t;
import l4.a;
import l4.b;
import m3.t0;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends f4.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();
    public final j A;
    public final xw B;
    public final String C;
    public final jy1 D;
    public final xm1 E;
    public final ws2 F;
    public final t0 G;
    public final String H;
    public final String I;
    public final y11 J;
    public final f91 K;

    /* renamed from: m, reason: collision with root package name */
    public final i f5529m;

    /* renamed from: n, reason: collision with root package name */
    public final k3.a f5530n;

    /* renamed from: o, reason: collision with root package name */
    public final t f5531o;

    /* renamed from: p, reason: collision with root package name */
    public final nk0 f5532p;

    /* renamed from: q, reason: collision with root package name */
    public final zw f5533q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5534r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5535s;

    /* renamed from: t, reason: collision with root package name */
    public final String f5536t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f5537u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5538v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5539w;

    /* renamed from: x, reason: collision with root package name */
    public final String f5540x;

    /* renamed from: y, reason: collision with root package name */
    public final ff0 f5541y;

    /* renamed from: z, reason: collision with root package name */
    public final String f5542z;

    public AdOverlayInfoParcel(nk0 nk0Var, ff0 ff0Var, t0 t0Var, jy1 jy1Var, xm1 xm1Var, ws2 ws2Var, String str, String str2, int i10) {
        this.f5529m = null;
        this.f5530n = null;
        this.f5531o = null;
        this.f5532p = nk0Var;
        this.B = null;
        this.f5533q = null;
        this.f5534r = null;
        this.f5535s = false;
        this.f5536t = null;
        this.f5537u = null;
        this.f5538v = 14;
        this.f5539w = 5;
        this.f5540x = null;
        this.f5541y = ff0Var;
        this.f5542z = null;
        this.A = null;
        this.C = str;
        this.H = str2;
        this.D = jy1Var;
        this.E = xm1Var;
        this.F = ws2Var;
        this.G = t0Var;
        this.I = null;
        this.J = null;
        this.K = null;
    }

    public AdOverlayInfoParcel(k3.a aVar, t tVar, xw xwVar, zw zwVar, e0 e0Var, nk0 nk0Var, boolean z10, int i10, String str, ff0 ff0Var, f91 f91Var) {
        this.f5529m = null;
        this.f5530n = aVar;
        this.f5531o = tVar;
        this.f5532p = nk0Var;
        this.B = xwVar;
        this.f5533q = zwVar;
        this.f5534r = null;
        this.f5535s = z10;
        this.f5536t = null;
        this.f5537u = e0Var;
        this.f5538v = i10;
        this.f5539w = 3;
        this.f5540x = str;
        this.f5541y = ff0Var;
        this.f5542z = null;
        this.A = null;
        this.C = null;
        this.H = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = null;
        this.J = null;
        this.K = f91Var;
    }

    public AdOverlayInfoParcel(k3.a aVar, t tVar, xw xwVar, zw zwVar, e0 e0Var, nk0 nk0Var, boolean z10, int i10, String str, String str2, ff0 ff0Var, f91 f91Var) {
        this.f5529m = null;
        this.f5530n = aVar;
        this.f5531o = tVar;
        this.f5532p = nk0Var;
        this.B = xwVar;
        this.f5533q = zwVar;
        this.f5534r = str2;
        this.f5535s = z10;
        this.f5536t = str;
        this.f5537u = e0Var;
        this.f5538v = i10;
        this.f5539w = 3;
        this.f5540x = null;
        this.f5541y = ff0Var;
        this.f5542z = null;
        this.A = null;
        this.C = null;
        this.H = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = null;
        this.J = null;
        this.K = f91Var;
    }

    public AdOverlayInfoParcel(k3.a aVar, t tVar, e0 e0Var, nk0 nk0Var, int i10, ff0 ff0Var, String str, j jVar, String str2, String str3, String str4, y11 y11Var) {
        this.f5529m = null;
        this.f5530n = null;
        this.f5531o = tVar;
        this.f5532p = nk0Var;
        this.B = null;
        this.f5533q = null;
        this.f5535s = false;
        if (((Boolean) w.c().b(ir.E0)).booleanValue()) {
            this.f5534r = null;
            this.f5536t = null;
        } else {
            this.f5534r = str2;
            this.f5536t = str3;
        }
        this.f5537u = null;
        this.f5538v = i10;
        this.f5539w = 1;
        this.f5540x = null;
        this.f5541y = ff0Var;
        this.f5542z = str;
        this.A = jVar;
        this.C = null;
        this.H = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = str4;
        this.J = y11Var;
        this.K = null;
    }

    public AdOverlayInfoParcel(k3.a aVar, t tVar, e0 e0Var, nk0 nk0Var, boolean z10, int i10, ff0 ff0Var, f91 f91Var) {
        this.f5529m = null;
        this.f5530n = aVar;
        this.f5531o = tVar;
        this.f5532p = nk0Var;
        this.B = null;
        this.f5533q = null;
        this.f5534r = null;
        this.f5535s = z10;
        this.f5536t = null;
        this.f5537u = e0Var;
        this.f5538v = i10;
        this.f5539w = 2;
        this.f5540x = null;
        this.f5541y = ff0Var;
        this.f5542z = null;
        this.A = null;
        this.C = null;
        this.H = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = null;
        this.J = null;
        this.K = f91Var;
    }

    AdOverlayInfoParcel(i iVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, ff0 ff0Var, String str4, j jVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.f5529m = iVar;
        this.f5530n = (k3.a) b.L0(a.AbstractBinderC0158a.w0(iBinder));
        this.f5531o = (t) b.L0(a.AbstractBinderC0158a.w0(iBinder2));
        this.f5532p = (nk0) b.L0(a.AbstractBinderC0158a.w0(iBinder3));
        this.B = (xw) b.L0(a.AbstractBinderC0158a.w0(iBinder6));
        this.f5533q = (zw) b.L0(a.AbstractBinderC0158a.w0(iBinder4));
        this.f5534r = str;
        this.f5535s = z10;
        this.f5536t = str2;
        this.f5537u = (e0) b.L0(a.AbstractBinderC0158a.w0(iBinder5));
        this.f5538v = i10;
        this.f5539w = i11;
        this.f5540x = str3;
        this.f5541y = ff0Var;
        this.f5542z = str4;
        this.A = jVar;
        this.C = str5;
        this.H = str6;
        this.D = (jy1) b.L0(a.AbstractBinderC0158a.w0(iBinder7));
        this.E = (xm1) b.L0(a.AbstractBinderC0158a.w0(iBinder8));
        this.F = (ws2) b.L0(a.AbstractBinderC0158a.w0(iBinder9));
        this.G = (t0) b.L0(a.AbstractBinderC0158a.w0(iBinder10));
        this.I = str7;
        this.J = (y11) b.L0(a.AbstractBinderC0158a.w0(iBinder11));
        this.K = (f91) b.L0(a.AbstractBinderC0158a.w0(iBinder12));
    }

    public AdOverlayInfoParcel(i iVar, k3.a aVar, t tVar, e0 e0Var, ff0 ff0Var, nk0 nk0Var, f91 f91Var) {
        this.f5529m = iVar;
        this.f5530n = aVar;
        this.f5531o = tVar;
        this.f5532p = nk0Var;
        this.B = null;
        this.f5533q = null;
        this.f5534r = null;
        this.f5535s = false;
        this.f5536t = null;
        this.f5537u = e0Var;
        this.f5538v = -1;
        this.f5539w = 4;
        this.f5540x = null;
        this.f5541y = ff0Var;
        this.f5542z = null;
        this.A = null;
        this.C = null;
        this.H = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = null;
        this.J = null;
        this.K = f91Var;
    }

    public AdOverlayInfoParcel(t tVar, nk0 nk0Var, int i10, ff0 ff0Var) {
        this.f5531o = tVar;
        this.f5532p = nk0Var;
        this.f5538v = 1;
        this.f5541y = ff0Var;
        this.f5529m = null;
        this.f5530n = null;
        this.B = null;
        this.f5533q = null;
        this.f5534r = null;
        this.f5535s = false;
        this.f5536t = null;
        this.f5537u = null;
        this.f5539w = 1;
        this.f5540x = null;
        this.f5542z = null;
        this.A = null;
        this.C = null;
        this.H = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.I = null;
        this.J = null;
        this.K = null;
    }

    public static AdOverlayInfoParcel f(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.p(parcel, 2, this.f5529m, i10, false);
        c.j(parcel, 3, b.p1(this.f5530n).asBinder(), false);
        c.j(parcel, 4, b.p1(this.f5531o).asBinder(), false);
        c.j(parcel, 5, b.p1(this.f5532p).asBinder(), false);
        c.j(parcel, 6, b.p1(this.f5533q).asBinder(), false);
        c.q(parcel, 7, this.f5534r, false);
        c.c(parcel, 8, this.f5535s);
        c.q(parcel, 9, this.f5536t, false);
        c.j(parcel, 10, b.p1(this.f5537u).asBinder(), false);
        c.k(parcel, 11, this.f5538v);
        c.k(parcel, 12, this.f5539w);
        c.q(parcel, 13, this.f5540x, false);
        c.p(parcel, 14, this.f5541y, i10, false);
        c.q(parcel, 16, this.f5542z, false);
        c.p(parcel, 17, this.A, i10, false);
        c.j(parcel, 18, b.p1(this.B).asBinder(), false);
        c.q(parcel, 19, this.C, false);
        c.j(parcel, 20, b.p1(this.D).asBinder(), false);
        c.j(parcel, 21, b.p1(this.E).asBinder(), false);
        c.j(parcel, 22, b.p1(this.F).asBinder(), false);
        c.j(parcel, 23, b.p1(this.G).asBinder(), false);
        c.q(parcel, 24, this.H, false);
        c.q(parcel, 25, this.I, false);
        c.j(parcel, 26, b.p1(this.J).asBinder(), false);
        c.j(parcel, 27, b.p1(this.K).asBinder(), false);
        c.b(parcel, iA);
    }
}
