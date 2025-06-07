package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class h81 extends z61 implements j81 {
    public h81(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void W(final String str) {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.f81
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((j81) obj).W(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void Y(final String str) {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.d81
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((j81) obj).Y(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void c() {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.c81
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((j81) obj).c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void e() {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.b81
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((j81) obj).e();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void o(String str) {
        final String str2 = "MalformedJson";
        q0(new y61(str2) { // from class: com.google.android.gms.internal.ads.g81

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f8638a = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((j81) obj).o(this.f8638a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final void v(final String str, final String str2) {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.e81
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((j81) obj).v(str, str2);
            }
        });
    }
}
