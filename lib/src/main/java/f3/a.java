package f3;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.at;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.oe0;
import com.google.android.gms.internal.ads.ql;
import d3.d;
import d3.f;
import d3.u;
import e4.p;
import k3.w;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: f3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0129a extends d {
    }

    public static void b(final Context context, final String str, final f fVar, final int i10, final AbstractC0129a abstractC0129a) {
        p.m(context, "Context cannot be null.");
        p.m(str, "adUnitId cannot be null.");
        p.m(fVar, "AdRequest cannot be null.");
        p.e("#008 Must be called on the main UI thread.");
        ir.a(context);
        if (((Boolean) at.f6231d.e()).booleanValue()) {
            if (((Boolean) w.c().b(ir.A9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: f3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        f fVar2 = fVar;
                        try {
                            new ql(context2, str2, fVar2.a(), i10, abstractC0129a).a();
                        } catch (IllegalStateException e5) {
                            b80.c(context2).a(e5, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new ql(context, str, fVar.a(), i10, abstractC0129a).a();
    }

    public abstract u a();

    public abstract void c(Activity activity);
}
