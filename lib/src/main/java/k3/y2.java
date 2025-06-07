package k3;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.ze0;
import d3.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: i, reason: collision with root package name */
    private static y2 f24811i;

    /* renamed from: f, reason: collision with root package name */
    private k1 f24817f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f24812a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f24814c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24815d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Object f24816e = new Object();

    /* renamed from: g, reason: collision with root package name */
    private d3.n f24818g = null;

    /* renamed from: h, reason: collision with root package name */
    private d3.t f24819h = new t.a().a();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f24813b = new ArrayList();

    private y2() {
    }

    public static y2 b() {
        y2 y2Var;
        synchronized (y2.class) {
            if (f24811i == null) {
                f24811i = new y2();
            }
            y2Var = f24811i;
        }
        return y2Var;
    }

    public final d3.t a() {
        return this.f24819h;
    }

    public final void c(String str) {
        synchronized (this.f24816e) {
            e4.p.p(this.f24817f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f24817f.m0(str);
            } catch (RemoteException e5) {
                ze0.e("Unable to set plugin.", e5);
            }
        }
    }
}
