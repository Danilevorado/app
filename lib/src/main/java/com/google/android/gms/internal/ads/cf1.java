package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class cf1 {

    /* renamed from: a, reason: collision with root package name */
    private final dk1 f6899a;

    /* renamed from: b, reason: collision with root package name */
    private final qi1 f6900b;

    /* renamed from: c, reason: collision with root package name */
    private final fu0 f6901c;

    /* renamed from: d, reason: collision with root package name */
    private final xd1 f6902d;

    public cf1(dk1 dk1Var, qi1 qi1Var, fu0 fu0Var, xd1 xd1Var) {
        this.f6899a = dk1Var;
        this.f6900b = qi1Var;
        this.f6901c = fu0Var;
        this.f6902d = xd1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        nk0 nk0VarA = this.f6899a.a(k3.h4.v(), null, null);
        ((View) nk0VarA).setVisibility(8);
        nk0VarA.O0("/sendMessageToSdk", new gy() { // from class: com.google.android.gms.internal.ads.we1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f17093a.b((nk0) obj, map);
            }
        });
        nk0VarA.O0("/adMuted", new gy() { // from class: com.google.android.gms.internal.ads.xe1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f17525a.c((nk0) obj, map);
            }
        });
        this.f6900b.j(new WeakReference(nk0VarA), "/loadHtml", new gy() { // from class: com.google.android.gms.internal.ads.ye1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, final Map map) {
                final cf1 cf1Var = this.f18001a;
                nk0 nk0Var = (nk0) obj;
                nk0Var.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.bf1
                    @Override // com.google.android.gms.internal.ads.am0
                    public final void a(boolean z10) {
                        cf1Var.d(map, z10);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    nk0Var.loadData(str, "text/html", "UTF-8");
                } else {
                    nk0Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f6900b.j(new WeakReference(nk0VarA), "/showOverlay", new gy() { // from class: com.google.android.gms.internal.ads.ze1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f18535a.e((nk0) obj, map);
            }
        });
        this.f6900b.j(new WeakReference(nk0VarA), "/hideOverlay", new gy() { // from class: com.google.android.gms.internal.ads.af1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f6063a.f((nk0) obj, map);
            }
        });
        return (View) nk0VarA;
    }

    final /* synthetic */ void b(nk0 nk0Var, Map map) {
        this.f6900b.g("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(nk0 nk0Var, Map map) {
        this.f6902d.h();
    }

    final /* synthetic */ void d(Map map, boolean z10) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f6900b.g("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void e(nk0 nk0Var, Map map) {
        ze0.f("Showing native ads overlay.");
        nk0Var.z().setVisibility(0);
        this.f6901c.d(true);
    }

    final /* synthetic */ void f(nk0 nk0Var, Map map) {
        ze0.f("Hiding native ads overlay.");
        nk0Var.z().setVisibility(8);
        this.f6901c.d(false);
    }
}
