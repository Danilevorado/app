package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n40 extends q30 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f12397m;

    /* renamed from: n, reason: collision with root package name */
    private p40 f12398n;

    /* renamed from: o, reason: collision with root package name */
    private ma0 f12399o;

    /* renamed from: p, reason: collision with root package name */
    private l4.a f12400p;

    /* renamed from: q, reason: collision with root package name */
    private View f12401q;

    /* renamed from: r, reason: collision with root package name */
    private o3.n f12402r;

    /* renamed from: s, reason: collision with root package name */
    private o3.w f12403s;

    /* renamed from: t, reason: collision with root package name */
    private o3.s f12404t;

    /* renamed from: u, reason: collision with root package name */
    private o3.m f12405u;

    /* renamed from: v, reason: collision with root package name */
    private o3.g f12406v;

    /* renamed from: w, reason: collision with root package name */
    private final String f12407w = "";

    public n40(o3.a aVar) {
        this.f12397m = aVar;
    }

    public n40(o3.f fVar) {
        this.f12397m = fVar;
    }

    private final Bundle L5(k3.c4 c4Var) {
        Bundle bundle;
        Bundle bundle2 = c4Var.f24626y;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f12397m.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle M5(String str, k3.c4 c4Var, String str2) throws RemoteException {
        ze0.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f12397m instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (c4Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", c4Var.f24620s);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            ze0.e("", th);
            throw new RemoteException();
        }
    }

    private static final boolean N5(k3.c4 c4Var) {
        if (c4Var.f24619r) {
            return true;
        }
        k3.t.b();
        return se0.t();
    }

    private static final String O5(String str, k3.c4 c4Var) {
        String str2 = c4Var.G;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void A4(l4.a aVar, k3.c4 c4Var, String str, u30 u30Var) throws RemoteException {
        if (this.f12397m instanceof o3.a) {
            ze0.b("Requesting rewarded ad from adapter.");
            try {
                ((o3.a) this.f12397m).loadRewardedAd(new o3.t((Context) l4.b.L0(aVar), "", M5(str, c4Var, null), L5(c4Var), N5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, O5(str, c4Var), ""), new l40(this, u30Var));
                return;
            } catch (Exception e5) {
                ze0.e("", e5);
                throw new RemoteException();
            }
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void B5(l4.a aVar, k3.c4 c4Var, String str, ma0 ma0Var, String str2) throws RemoteException {
        Object obj = this.f12397m;
        if (obj instanceof o3.a) {
            this.f12400p = aVar;
            this.f12399o = ma0Var;
            ma0Var.F1(l4.b.p1(obj));
            return;
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void E() throws RemoteException {
        Object obj = this.f12397m;
        if (obj instanceof o3.f) {
            try {
                ((o3.f) obj).onPause();
            } catch (Throwable th) {
                ze0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void E2(boolean z10) {
        Object obj = this.f12397m;
        if (obj instanceof o3.v) {
            try {
                ((o3.v) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th) {
                ze0.e("", th);
                return;
            }
        }
        ze0.b(o3.v.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final boolean G() throws RemoteException {
        if (this.f12397m instanceof o3.a) {
            return this.f12399o != null;
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void G3(l4.a aVar, k3.c4 c4Var, String str, u30 u30Var) throws RemoteException {
        if (this.f12397m instanceof o3.a) {
            ze0.b("Requesting app open ad from adapter.");
            try {
                ((o3.a) this.f12397m).loadAppOpenAd(new o3.h((Context) l4.b.L0(aVar), "", M5(str, c4Var, null), L5(c4Var), N5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, O5(str, c4Var), ""), new m40(this, u30Var));
                return;
            } catch (Exception e5) {
                ze0.e("", e5);
                throw new RemoteException();
            }
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final z30 I() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void J5(l4.a aVar, k3.c4 c4Var, String str, String str2, u30 u30Var) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f12397m;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof o3.a)) {
            ze0.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
            throw new RemoteException();
        }
        ze0.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.f12397m;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof o3.a) {
                try {
                    ((o3.a) obj2).loadInterstitialAd(new o3.o((Context) l4.b.L0(aVar), "", M5(str, c4Var, str2), L5(c4Var), N5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, O5(str, c4Var), this.f12407w), new j40(this, u30Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = c4Var.f24618q;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = c4Var.f24615n;
            f40 f40Var = new f40(j10 == -1 ? null : new Date(j10), c4Var.f24617p, hashSet, c4Var.f24624w, N5(c4Var), c4Var.f24620s, c4Var.D, c4Var.F, O5(str, c4Var));
            Bundle bundle = c4Var.f24626y;
            mediationInterstitialAdapter.requestInterstitialAd((Context) l4.b.L0(aVar), new p40(u30Var), M5(str, c4Var, str2), f40Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void K4(l4.a aVar, k3.h4 h4Var, k3.c4 c4Var, String str, String str2, u30 u30Var) throws RemoteException {
        if (this.f12397m instanceof o3.a) {
            ze0.b("Requesting interscroller ad from adapter.");
            try {
                o3.a aVar2 = (o3.a) this.f12397m;
                aVar2.loadInterscrollerAd(new o3.j((Context) l4.b.L0(aVar), "", M5(str, c4Var, str2), L5(c4Var), N5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, O5(str, c4Var), d3.z.e(h4Var.f24655q, h4Var.f24652n), ""), new g40(this, u30Var, aVar2));
                return;
            } catch (Exception e5) {
                ze0.e("", e5);
                throw new RemoteException();
            }
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void L() throws RemoteException {
        if (this.f12397m instanceof MediationInterstitialAdapter) {
            ze0.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f12397m).showInterstitial();
                return;
            } catch (Throwable th) {
                ze0.e("", th);
                throw new RemoteException();
            }
        }
        ze0.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    @Override // com.google.android.gms.internal.ads.r30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N2(l4.a r10, com.google.android.gms.internal.ads.yz r11, java.util.List r12) throws android.os.RemoteException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12397m
            boolean r0 = r0 instanceof o3.a
            if (r0 == 0) goto La7
            com.google.android.gms.internal.ads.h40 r0 = new com.google.android.gms.internal.ads.h40
            r0.<init>(r9, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
        L14:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r12.next()
            com.google.android.gms.internal.ads.c00 r1 = (com.google.android.gms.internal.ads.c00) r1
            java.lang.String r2 = r1.f6735m
            int r3 = r2.hashCode()
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r3) {
                case -1396342996: goto L61;
                case -1052618729: goto L57;
                case -239580146: goto L4d;
                case 604727084: goto L43;
                case 1167692200: goto L39;
                case 1911491517: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L6b
        L2f:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6b
            r2 = r6
            goto L6c
        L39:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6b
            r2 = r4
            goto L6c
        L43:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6b
            r2 = r8
            goto L6c
        L4d:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6b
            r2 = r7
            goto L6c
        L57:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6b
            r2 = r5
            goto L6c
        L61:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6b
            r2 = 0
            goto L6c
        L6b:
            r2 = -1
        L6c:
            if (r2 == 0) goto L89
            if (r2 == r8) goto L86
            if (r2 == r7) goto L83
            if (r2 == r6) goto L80
            if (r2 == r5) goto L7d
            if (r2 == r4) goto L7a
            r2 = 0
            goto L8b
        L7a:
            d3.b r2 = d3.b.APP_OPEN_AD
            goto L8b
        L7d:
            d3.b r2 = d3.b.NATIVE
            goto L8b
        L80:
            d3.b r2 = d3.b.REWARDED_INTERSTITIAL
            goto L8b
        L83:
            d3.b r2 = d3.b.REWARDED
            goto L8b
        L86:
            d3.b r2 = d3.b.INTERSTITIAL
            goto L8b
        L89:
            d3.b r2 = d3.b.BANNER
        L8b:
            if (r2 == 0) goto L14
            o3.l r3 = new o3.l
            android.os.Bundle r1 = r1.f6736n
            r3.<init>(r2, r1)
            r11.add(r3)
            goto L14
        L99:
            java.lang.Object r12 = r9.f12397m
            o3.a r12 = (o3.a) r12
            java.lang.Object r10 = l4.b.L0(r10)
            android.content.Context r10 = (android.content.Context) r10
            r12.initialize(r10, r0, r11)
            return
        La7:
            android.os.RemoteException r10 = new android.os.RemoteException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n40.N2(l4.a, com.google.android.gms.internal.ads.yz, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final a40 S() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void T3(l4.a aVar, k3.c4 c4Var, String str, u30 u30Var) throws RemoteException {
        J5(aVar, c4Var, str, null, u30Var);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void U3(l4.a aVar, k3.c4 c4Var, String str, String str2, u30 u30Var, eu euVar, List list) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f12397m;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof o3.a)) {
            ze0.g(MediationNativeAdapter.class.getCanonicalName() + " or " + o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
            throw new RemoteException();
        }
        ze0.b("Requesting native ad from adapter.");
        Object obj2 = this.f12397m;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof o3.a) {
                try {
                    ((o3.a) obj2).loadNativeAd(new o3.q((Context) l4.b.L0(aVar), "", M5(str, c4Var, str2), L5(c4Var), N5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, O5(str, c4Var), this.f12407w, euVar), new k40(this, u30Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List list2 = c4Var.f24618q;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j10 = c4Var.f24615n;
            r40 r40Var = new r40(j10 == -1 ? null : new Date(j10), c4Var.f24617p, hashSet, c4Var.f24624w, N5(c4Var), c4Var.f24620s, euVar, list, c4Var.D, c4Var.F, O5(str, c4Var));
            Bundle bundle = c4Var.f24626y;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f12398n = new p40(u30Var);
            mediationNativeAdapter.requestNativeAd((Context) l4.b.L0(aVar), this.f12398n, M5(str, c4Var, str2), r40Var, bundle2);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final boolean V() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void V0(l4.a aVar, k3.c4 c4Var, String str, u30 u30Var) throws RemoteException {
        if (this.f12397m instanceof o3.a) {
            ze0.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((o3.a) this.f12397m).loadRewardedInterstitialAd(new o3.t((Context) l4.b.L0(aVar), "", M5(str, c4Var, null), L5(c4Var), N5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, O5(str, c4Var), ""), new l40(this, u30Var));
                return;
            } catch (Exception e5) {
                ze0.e("", e5);
                throw new RemoteException();
            }
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void Y2(k3.c4 c4Var, String str) throws RemoteException {
        q1(c4Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final Bundle c() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final Bundle e() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final k3.m2 g() {
        Object obj = this.f12397m;
        if (obj instanceof o3.x) {
            try {
                return ((o3.x) obj).getVideoController();
            } catch (Throwable th) {
                ze0.e("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void g0() throws RemoteException {
        if (this.f12397m instanceof o3.a) {
            o3.s sVar = this.f12404t;
            if (sVar != null) {
                sVar.a((Context) l4.b.L0(this.f12400p));
                return;
            } else {
                ze0.d("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final Bundle h() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void h5(l4.a aVar) throws RemoteException {
        if (this.f12397m instanceof o3.a) {
            ze0.b("Show rewarded ad from adapter.");
            o3.s sVar = this.f12404t;
            if (sVar != null) {
                sVar.a((Context) l4.b.L0(aVar));
                return;
            } else {
                ze0.d("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final jv i() {
        p40 p40Var = this.f12398n;
        if (p40Var == null) {
            return null;
        }
        g3.f fVarT = p40Var.t();
        if (fVarT instanceof kv) {
            return ((kv) fVarT).b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final y30 j() {
        o3.m mVar = this.f12405u;
        if (mVar != null) {
            return new o40(mVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final d40 k() {
        o3.w wVar;
        o3.w wVarU;
        Object obj = this.f12397m;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof o3.a) || (wVar = this.f12403s) == null) {
                return null;
            }
            return new s40(wVar);
        }
        p40 p40Var = this.f12398n;
        if (p40Var == null || (wVarU = p40Var.u()) == null) {
            return null;
        }
        return new s40(wVarU);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final z50 l() {
        Object obj = this.f12397m;
        if (!(obj instanceof o3.a)) {
            return null;
        }
        ((o3.a) obj).getVersionInfo();
        return z50.f(null);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final l4.a m() throws RemoteException {
        Object obj = this.f12397m;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return l4.b.p1(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                ze0.e("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof o3.a) {
            return l4.b.p1(this.f12401q);
        }
        ze0.g(MediationBannerAdapter.class.getCanonicalName() + " or " + o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final z50 n() {
        Object obj = this.f12397m;
        if (!(obj instanceof o3.a)) {
            return null;
        }
        ((o3.a) obj).getSDKVersionInfo();
        return z50.f(null);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void o4(l4.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void p() throws RemoteException {
        Object obj = this.f12397m;
        if (obj instanceof o3.f) {
            try {
                ((o3.f) obj).onDestroy();
            } catch (Throwable th) {
                ze0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void q1(k3.c4 c4Var, String str, String str2) throws RemoteException {
        Object obj = this.f12397m;
        if (obj instanceof o3.a) {
            A4(this.f12400p, c4Var, str, new q40((o3.a) obj, this.f12399o));
            return;
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void t3(l4.a aVar) throws RemoteException {
        if (this.f12397m instanceof o3.a) {
            ze0.b("Show app open ad from adapter.");
            o3.g gVar = this.f12406v;
            if (gVar != null) {
                gVar.a((Context) l4.b.L0(aVar));
                return;
            } else {
                ze0.d("Can not show null mediation app open ad.");
                throw new RemoteException();
            }
        }
        ze0.g(o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void t4(l4.a aVar, ma0 ma0Var, List list) throws RemoteException {
        ze0.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void u1(l4.a aVar, k3.h4 h4Var, k3.c4 c4Var, String str, u30 u30Var) throws RemoteException {
        u3(aVar, h4Var, c4Var, str, null, u30Var);
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void u3(l4.a aVar, k3.h4 h4Var, k3.c4 c4Var, String str, String str2, u30 u30Var) throws RemoteException {
        RemoteException remoteException;
        Object obj = this.f12397m;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof o3.a)) {
            ze0.g(MediationBannerAdapter.class.getCanonicalName() + " or " + o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
            throw new RemoteException();
        }
        ze0.b("Requesting banner ad from adapter.");
        d3.g gVarD = h4Var.f24664z ? d3.z.d(h4Var.f24655q, h4Var.f24652n) : d3.z.c(h4Var.f24655q, h4Var.f24652n, h4Var.f24651m);
        Object obj2 = this.f12397m;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof o3.a) {
                try {
                    ((o3.a) obj2).loadBannerAd(new o3.j((Context) l4.b.L0(aVar), "", M5(str, c4Var, str2), L5(c4Var), N5(c4Var), c4Var.f24624w, c4Var.f24620s, c4Var.F, O5(str, c4Var), gVarD, this.f12407w), new i40(this, u30Var));
                    return;
                } finally {
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = c4Var.f24618q;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = c4Var.f24615n;
            f40 f40Var = new f40(j10 == -1 ? null : new Date(j10), c4Var.f24617p, hashSet, c4Var.f24624w, N5(c4Var), c4Var.f24620s, c4Var.D, c4Var.F, O5(str, c4Var));
            Bundle bundle = c4Var.f24626y;
            mediationBannerAdapter.requestBannerAd((Context) l4.b.L0(aVar), new p40(u30Var), M5(str, c4Var, str2), gVarD, f40Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void z() throws RemoteException {
        Object obj = this.f12397m;
        if (obj instanceof o3.f) {
            try {
                ((o3.f) obj).onResume();
            } catch (Throwable th) {
                ze0.e("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r30
    public final void z1(l4.a aVar) throws RemoteException {
        Object obj = this.f12397m;
        if ((obj instanceof o3.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                L();
                return;
            }
            ze0.b("Show interstitial ad from adapter.");
            o3.n nVar = this.f12402r;
            if (nVar != null) {
                nVar.a((Context) l4.b.L0(aVar));
                return;
            } else {
                ze0.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        ze0.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + o3.a.class.getCanonicalName() + " #009 Class mismatch: " + this.f12397m.getClass().getCanonicalName());
        throw new RemoteException();
    }
}
