package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ob2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13132a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13133b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13134c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f13135d;

    public ob2(String str, boolean z10, boolean z11, boolean z12) {
        this.f13132a = str;
        this.f13133b = z10;
        this.f13134c = z11;
        this.f13135d = z12;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f13132a.isEmpty()) {
            bundle.putString("inspector_extras", this.f13132a);
        }
        bundle.putInt("test_mode", this.f13133b ? 1 : 0);
        bundle.putInt("linked_device", this.f13134c ? 1 : 0);
        if (((Boolean) k3.w.c().b(ir.B8)).booleanValue()) {
            if (this.f13133b || this.f13134c) {
                bundle.putInt("risd", !this.f13135d ? 1 : 0);
            }
        }
    }
}
