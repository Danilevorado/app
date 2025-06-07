package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* loaded from: classes.dex */
public final class p40 implements o3.k, o3.p, o3.r {

    /* renamed from: a, reason: collision with root package name */
    private final u30 f13575a;

    /* renamed from: b, reason: collision with root package name */
    private o3.w f13576b;

    /* renamed from: c, reason: collision with root package name */
    private g3.f f13577c;

    public p40(u30 u30Var) {
        this.f13575a = u30Var;
    }

    @Override // o3.k
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdClosed.");
        try {
            this.f13575a.e();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.r
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdOpened.");
        try {
            this.f13575a.o();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.p
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter, int i10) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdFailedToLoad with error " + i10 + ".");
        try {
            this.f13575a.w(i10);
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.p
    public final void d(MediationInterstitialAdapter mediationInterstitialAdapter, d3.a aVar) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f13575a.I1(aVar.d());
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.k
    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdClicked.");
        try {
            this.f13575a.c();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.r
    public final void f(MediationNativeAdapter mediationNativeAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdClosed.");
        try {
            this.f13575a.e();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.k
    public final void g(MediationBannerAdapter mediationBannerAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdLoaded.");
        try {
            this.f13575a.p();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.r
    public final void h(MediationNativeAdapter mediationNativeAdapter, g3.f fVar, String str) {
        if (!(fVar instanceof kv)) {
            ze0.g("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.f13575a.w1(((kv) fVar).b(), str);
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.r
    public final void i(MediationNativeAdapter mediationNativeAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        o3.w wVar = this.f13576b;
        if (this.f13577c == null) {
            if (wVar == null) {
                ze0.i("#007 Could not call remote method.", null);
                return;
            } else if (!wVar.l()) {
                ze0.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        ze0.b("Adapter called onAdClicked.");
        try {
            this.f13575a.c();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.p
    public final void j(MediationInterstitialAdapter mediationInterstitialAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdLoaded.");
        try {
            this.f13575a.p();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.r
    public final void k(MediationNativeAdapter mediationNativeAdapter, o3.w wVar) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdLoaded.");
        this.f13576b = wVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            d3.w wVar2 = new d3.w();
            wVar2.c(new e40());
            if (wVar != null && wVar.r()) {
                wVar.K(wVar2);
            }
        }
        try {
            this.f13575a.p();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.k
    public final void l(MediationBannerAdapter mediationBannerAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdOpened.");
        try {
            this.f13575a.o();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.p
    public final void m(MediationInterstitialAdapter mediationInterstitialAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdClosed.");
        try {
            this.f13575a.e();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.r
    public final void n(MediationNativeAdapter mediationNativeAdapter, d3.a aVar) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f13575a.I1(aVar.d());
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.k
    public final void o(MediationBannerAdapter mediationBannerAdapter, d3.a aVar) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdFailedToLoad with error. ErrorCode: " + aVar.a() + ". ErrorMessage: " + aVar.c() + ". ErrorDomain: " + aVar.b());
        try {
            this.f13575a.I1(aVar.d());
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.r
    public final void p(MediationNativeAdapter mediationNativeAdapter, g3.f fVar) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdLoaded with template id ".concat(String.valueOf(fVar.a())));
        this.f13577c = fVar;
        try {
            this.f13575a.p();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.k
    public final void q(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAppEvent.");
        try {
            this.f13575a.f3(str, str2);
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.r
    public final void r(MediationNativeAdapter mediationNativeAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        o3.w wVar = this.f13576b;
        if (this.f13577c == null) {
            if (wVar == null) {
                ze0.i("#007 Could not call remote method.", null);
                return;
            } else if (!wVar.m()) {
                ze0.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        ze0.b("Adapter called onAdImpression.");
        try {
            this.f13575a.n();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // o3.p
    public final void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        e4.p.e("#008 Must be called on the main UI thread.");
        ze0.b("Adapter called onAdOpened.");
        try {
            this.f13575a.o();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final g3.f t() {
        return this.f13577c;
    }

    public final o3.w u() {
        return this.f13576b;
    }
}
