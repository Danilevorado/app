package l3;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.a13;
import com.google.android.gms.internal.ads.b13;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.k13;
import com.google.android.gms.internal.ads.k23;
import com.google.android.gms.internal.ads.m13;
import com.google.android.gms.internal.ads.n13;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.o13;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.p13;
import com.google.android.gms.internal.ads.y03;
import com.google.android.gms.internal.ads.z03;
import java.util.HashMap;
import java.util.Map;
import m3.n1;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: f, reason: collision with root package name */
    private n13 f25056f;

    /* renamed from: c, reason: collision with root package name */
    private nk0 f25053c = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25055e = false;

    /* renamed from: a, reason: collision with root package name */
    private String f25051a = null;

    /* renamed from: d, reason: collision with root package name */
    private a13 f25054d = null;

    /* renamed from: b, reason: collision with root package name */
    private String f25052b = null;

    private final p13 l() {
        o13 o13VarC = p13.c();
        if (!((Boolean) k3.w.c().b(ir.H9)).booleanValue() || TextUtils.isEmpty(this.f25052b)) {
            String str = this.f25051a;
            if (str != null) {
                o13VarC.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            o13VarC.a(this.f25052b);
        }
        return o13VarC.c();
    }

    private final void m() {
        if (this.f25056f == null) {
            this.f25056f = new a0(this);
        }
    }

    public final synchronized void a(nk0 nk0Var, Context context) {
        this.f25053c = nk0Var;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        e("on_play_store_bind", map);
    }

    public final void b() {
        a13 a13Var;
        if (!this.f25055e || (a13Var = this.f25054d) == null) {
            n1.k("LastMileDelivery not connected");
        } else {
            a13Var.a(l(), this.f25056f);
            d("onLMDOverlayCollapse");
        }
    }

    public final void c() {
        a13 a13Var;
        if (!this.f25055e || (a13Var = this.f25054d) == null) {
            n1.k("LastMileDelivery not connected");
            return;
        }
        y03 y03VarC = z03.c();
        if (!((Boolean) k3.w.c().b(ir.H9)).booleanValue() || TextUtils.isEmpty(this.f25052b)) {
            String str = this.f25051a;
            if (str != null) {
                y03VarC.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            y03VarC.a(this.f25052b);
        }
        a13Var.b(y03VarC.c(), this.f25056f);
    }

    final void d(String str) {
        e(str, new HashMap());
    }

    final void e(final String str, final Map map) {
        of0.f13190e.execute(new Runnable() { // from class: l3.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f25103m.h(str, map);
            }
        });
    }

    final void f(String str, String str2) {
        n1.k(str);
        if (this.f25053c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            e("onError", map);
        }
    }

    public final void g() {
        a13 a13Var;
        if (!this.f25055e || (a13Var = this.f25054d) == null) {
            n1.k("LastMileDelivery not connected");
        } else {
            a13Var.c(l(), this.f25056f);
            d("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void h(String str, Map map) {
        nk0 nk0Var = this.f25053c;
        if (nk0Var != null) {
            nk0Var.c(str, map);
        }
    }

    final void i(m13 m13Var) {
        if (!TextUtils.isEmpty(m13Var.b())) {
            if (!((Boolean) k3.w.c().b(ir.H9)).booleanValue()) {
                this.f25051a = m13Var.b();
            }
        }
        switch (m13Var.a()) {
            case 8152:
                d("onLMDOverlayOpened");
                break;
            case 8153:
                d("onLMDOverlayClicked");
                break;
            case 8155:
                d("onLMDOverlayClose");
                break;
            case 8157:
                this.f25051a = null;
                this.f25052b = null;
                this.f25055e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(m13Var.a()));
                e("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void j(nk0 nk0Var, k13 k13Var) {
        if (nk0Var == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.f25053c = nk0Var;
        if (!this.f25055e && !k(nk0Var.getContext())) {
            f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) k3.w.c().b(ir.H9)).booleanValue()) {
            this.f25052b = k13Var.g();
        }
        m();
        a13 a13Var = this.f25054d;
        if (a13Var != null) {
            a13Var.d(k13Var, this.f25056f);
        }
    }

    public final synchronized boolean k(Context context) {
        if (!k23.a(context)) {
            return false;
        }
        try {
            this.f25054d = b13.a(context);
        } catch (NullPointerException e5) {
            n1.k("Error connecting LMD Overlay service");
            j3.t.q().u(e5, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f25054d == null) {
            this.f25055e = false;
            return false;
        }
        m();
        this.f25055e = true;
        return true;
    }
}
