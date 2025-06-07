package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y50 extends k50 {

    /* renamed from: m, reason: collision with root package name */
    private final RtbAdapter f17890m;

    /* renamed from: n, reason: collision with root package name */
    private o3.n f17891n;

    /* renamed from: o, reason: collision with root package name */
    private o3.s f17892o;

    /* renamed from: p, reason: collision with root package name */
    private o3.g f17893p;

    /* renamed from: q, reason: collision with root package name */
    private String f17894q = "";

    public y50(RtbAdapter rtbAdapter) {
        this.f17890m = rtbAdapter;
    }

    private final Bundle M5(k3.c4 c4Var) {
        Bundle bundle;
        Bundle bundle2 = c4Var.f24626y;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f17890m.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle N5(String str) throws RemoteException {
        ze0.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e5) {
            ze0.e("", e5);
            throw new RemoteException();
        }
    }

    private static final boolean O5(k3.c4 c4Var) {
        if (c4Var.f24619r) {
            return true;
        }
        k3.t.b();
        return se0.t();
    }

    private static final String P5(String str, k3.c4 c4Var) {
        String str2 = c4Var.G;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void G2(String str, String str2, k3.c4 c4Var, l4.a aVar, f50 f50Var, u30 u30Var, eu euVar) throws RemoteException {
        try {
            this.f17890m.loadRtbNativeAd(new o3.q((Context) l4.b.L0(aVar), str, N5(str2), M5(c4Var), O5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, P5(str2, c4Var), this.f17894q, euVar), new t50(this, f50Var, u30Var));
        } catch (Throwable th) {
            ze0.e("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final boolean H0(l4.a aVar) {
        o3.n nVar = this.f17891n;
        if (nVar == null) {
            return false;
        }
        try {
            nVar.a((Context) l4.b.L0(aVar));
            return true;
        } catch (Throwable th) {
            ze0.e("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void M3(String str, String str2, k3.c4 c4Var, l4.a aVar, z40 z40Var, u30 u30Var, k3.h4 h4Var) throws RemoteException {
        try {
            this.f17890m.loadRtbBannerAd(new o3.j((Context) l4.b.L0(aVar), str, N5(str2), M5(c4Var), O5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, P5(str2, c4Var), d3.z.c(h4Var.f24655q, h4Var.f24652n, h4Var.f24651m), this.f17894q), new q50(this, z40Var, u30Var));
        } catch (Throwable th) {
            ze0.e("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void P4(String str) {
        this.f17894q = str;
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void S4(String str, String str2, k3.c4 c4Var, l4.a aVar, c50 c50Var, u30 u30Var) throws RemoteException {
        try {
            this.f17890m.loadRtbInterstitialAd(new o3.o((Context) l4.b.L0(aVar), str, N5(str2), M5(c4Var), O5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, P5(str2, c4Var), this.f17894q), new s50(this, c50Var, u30Var));
        } catch (Throwable th) {
            ze0.e("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void Z2(String str, String str2, k3.c4 c4Var, l4.a aVar, i50 i50Var, u30 u30Var) throws RemoteException {
        try {
            this.f17890m.loadRtbRewardedAd(new o3.t((Context) l4.b.L0(aVar), str, N5(str2), M5(c4Var), O5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, P5(str2, c4Var), this.f17894q), new x50(this, i50Var, u30Var));
        } catch (Throwable th) {
            ze0.e("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final k3.m2 c() {
        Object obj = this.f17890m;
        if (obj instanceof o3.x) {
            try {
                return ((o3.x) obj).getVideoController();
            } catch (Throwable th) {
                ze0.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void c5(String str, String str2, k3.c4 c4Var, l4.a aVar, z40 z40Var, u30 u30Var, k3.h4 h4Var) throws RemoteException {
        try {
            this.f17890m.loadRtbInterscrollerAd(new o3.j((Context) l4.b.L0(aVar), str, N5(str2), M5(c4Var), O5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, P5(str2, c4Var), d3.z.c(h4Var.f24655q, h4Var.f24652n, h4Var.f24651m), this.f17894q), new r50(this, z40Var, u30Var));
        } catch (Throwable th) {
            ze0.e("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final z50 e() {
        this.f17890m.getVersionInfo();
        return z50.f(null);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final z50 h() {
        this.f17890m.getSDKVersionInfo();
        return z50.f(null);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void h4(String str, String str2, k3.c4 c4Var, l4.a aVar, i50 i50Var, u30 u30Var) throws RemoteException {
        try {
            this.f17890m.loadRtbRewardedInterstitialAd(new o3.t((Context) l4.b.L0(aVar), str, N5(str2), M5(c4Var), O5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, P5(str2, c4Var), this.f17894q), new x50(this, i50Var, u30Var));
        } catch (Throwable th) {
            ze0.e("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final boolean k0(l4.a aVar) {
        o3.g gVar = this.f17893p;
        if (gVar == null) {
            return false;
        }
        try {
            gVar.a((Context) l4.b.L0(aVar));
            return true;
        } catch (Throwable th) {
            ze0.e("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void l5(String str, String str2, k3.c4 c4Var, l4.a aVar, f50 f50Var, u30 u30Var) throws RemoteException {
        G2(str, str2, c4Var, aVar, f50Var, u30Var, null);
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final void m3(String str, String str2, k3.c4 c4Var, l4.a aVar, w40 w40Var, u30 u30Var) throws RemoteException {
        try {
            this.f17890m.loadRtbAppOpenAd(new o3.h((Context) l4.b.L0(aVar), str, N5(str2), M5(c4Var), O5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, P5(str2, c4Var), this.f17894q), new u50(this, w40Var, u30Var));
        } catch (Throwable th) {
            ze0.e("Adapter failed to render app open ad.", th);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // com.google.android.gms.internal.ads.l50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n3(l4.a r9, java.lang.String r10, android.os.Bundle r11, android.os.Bundle r12, k3.h4 r13, com.google.android.gms.internal.ads.o50 r14) throws android.os.RemoteException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.w50 r0 = new com.google.android.gms.internal.ads.w50     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r8, r14)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r14 = r8.f17890m     // Catch: java.lang.Throwable -> L9c
            o3.l r1 = new o3.l     // Catch: java.lang.Throwable -> L9c
            int r2 = r10.hashCode()     // Catch: java.lang.Throwable -> L9c
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -1396342996: goto L48;
                case -1052618729: goto L3e;
                case -239580146: goto L34;
                case 604727084: goto L2a;
                case 1167692200: goto L20;
                case 1911491517: goto L16;
                default: goto L15;
            }
        L15:
            goto L52
        L16:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L52
            r10 = r5
            goto L53
        L20:
            java.lang.String r2 = "app_open"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L52
            r10 = r3
            goto L53
        L2a:
            java.lang.String r2 = "interstitial"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L52
            r10 = r7
            goto L53
        L34:
            java.lang.String r2 = "rewarded"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L52
            r10 = r6
            goto L53
        L3e:
            java.lang.String r2 = "native"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L52
            r10 = r4
            goto L53
        L48:
            java.lang.String r2 = "banner"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L52
            r10 = 0
            goto L53
        L52:
            r10 = -1
        L53:
            if (r10 == 0) goto L76
            if (r10 == r7) goto L73
            if (r10 == r6) goto L70
            if (r10 == r5) goto L6d
            if (r10 == r4) goto L6a
            if (r10 != r3) goto L62
            d3.b r10 = d3.b.APP_OPEN_AD     // Catch: java.lang.Throwable -> L9c
            goto L78
        L62:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L9c
            java.lang.String r10 = "Internal Error"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L9c
            throw r9     // Catch: java.lang.Throwable -> L9c
        L6a:
            d3.b r10 = d3.b.NATIVE     // Catch: java.lang.Throwable -> L9c
            goto L78
        L6d:
            d3.b r10 = d3.b.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L9c
            goto L78
        L70:
            d3.b r10 = d3.b.REWARDED     // Catch: java.lang.Throwable -> L9c
            goto L78
        L73:
            d3.b r10 = d3.b.INTERSTITIAL     // Catch: java.lang.Throwable -> L9c
            goto L78
        L76:
            d3.b r10 = d3.b.BANNER     // Catch: java.lang.Throwable -> L9c
        L78:
            r1.<init>(r10, r12)     // Catch: java.lang.Throwable -> L9c
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9c
            r10.<init>()     // Catch: java.lang.Throwable -> L9c
            r10.add(r1)     // Catch: java.lang.Throwable -> L9c
            q3.a r12 = new q3.a     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r9 = l4.b.L0(r9)     // Catch: java.lang.Throwable -> L9c
            android.content.Context r9 = (android.content.Context) r9     // Catch: java.lang.Throwable -> L9c
            int r1 = r13.f24655q     // Catch: java.lang.Throwable -> L9c
            int r2 = r13.f24652n     // Catch: java.lang.Throwable -> L9c
            java.lang.String r13 = r13.f24651m     // Catch: java.lang.Throwable -> L9c
            d3.g r13 = d3.z.c(r1, r2, r13)     // Catch: java.lang.Throwable -> L9c
            r12.<init>(r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L9c
            r14.collectSignals(r12, r0)     // Catch: java.lang.Throwable -> L9c
            return
        L9c:
            r9 = move-exception
            java.lang.String r10 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.ze0.e(r10, r9)
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y50.n3(l4.a, java.lang.String, android.os.Bundle, android.os.Bundle, k3.h4, com.google.android.gms.internal.ads.o50):void");
    }

    @Override // com.google.android.gms.internal.ads.l50
    public final boolean q3(l4.a aVar) {
        o3.s sVar = this.f17892o;
        if (sVar == null) {
            return false;
        }
        try {
            sVar.a((Context) l4.b.L0(aVar));
            return true;
        } catch (Throwable th) {
            ze0.e("", th);
            return true;
        }
    }
}
