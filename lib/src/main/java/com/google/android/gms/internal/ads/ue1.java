package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ue1 implements View.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    private final qi1 f16298m;

    /* renamed from: n, reason: collision with root package name */
    private final i4.e f16299n;

    /* renamed from: o, reason: collision with root package name */
    private jw f16300o;

    /* renamed from: p, reason: collision with root package name */
    private gy f16301p;

    /* renamed from: q, reason: collision with root package name */
    String f16302q;

    /* renamed from: r, reason: collision with root package name */
    Long f16303r;

    /* renamed from: s, reason: collision with root package name */
    WeakReference f16304s;

    public ue1(qi1 qi1Var, i4.e eVar) {
        this.f16298m = qi1Var;
        this.f16299n = eVar;
    }

    private final void d() {
        View view;
        this.f16302q = null;
        this.f16303r = null;
        WeakReference weakReference = this.f16304s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f16304s = null;
    }

    public final jw a() {
        return this.f16300o;
    }

    public final void b() {
        if (this.f16300o == null || this.f16303r == null) {
            return;
        }
        d();
        try {
            this.f16300o.c();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final void c(final jw jwVar) {
        this.f16300o = jwVar;
        gy gyVar = this.f16301p;
        if (gyVar != null) {
            this.f16298m.k("/unconfirmedClick", gyVar);
        }
        gy gyVar2 = new gy() { // from class: com.google.android.gms.internal.ads.te1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                ue1 ue1Var = this.f15797a;
                jw jwVar2 = jwVar;
                try {
                    ue1Var.f16303r = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    ze0.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                ue1Var.f16302q = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (jwVar2 == null) {
                    ze0.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    jwVar2.J(str);
                } catch (RemoteException e5) {
                    ze0.i("#007 Could not call remote method.", e5);
                }
            }
        };
        this.f16301p = gyVar2;
        this.f16298m.i("/unconfirmedClick", gyVar2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f16304s;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f16302q != null && this.f16303r != null) {
            HashMap map = new HashMap();
            map.put("id", this.f16302q);
            map.put("time_interval", String.valueOf(this.f16299n.a() - this.f16303r.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f16298m.g("sendMessageToNativeJs", map);
        }
        d();
    }
}
