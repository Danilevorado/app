package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class b60 implements l3.t {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ zzbqi f6357m;

    b60(zzbqi zzbqiVar) {
        this.f6357m = zzbqiVar;
    }

    @Override // l3.t
    public final void C(int i10) {
        ze0.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbqi zzbqiVar = this.f6357m;
        zzbqiVar.f18821b.m(zzbqiVar);
    }

    @Override // l3.t
    public final void L0() {
        ze0.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // l3.t
    public final void b() {
        ze0.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbqi zzbqiVar = this.f6357m;
        zzbqiVar.f18821b.s(zzbqiVar);
    }

    @Override // l3.t
    public final void c() {
    }

    @Override // l3.t
    public final void w0() {
        ze0.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // l3.t
    public final void x4() {
        ze0.b("Delay close AdMobCustomTabsAdapter overlay.");
    }
}
