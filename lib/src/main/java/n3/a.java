package n3;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.at;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.o00;
import com.google.android.gms.internal.ads.oe0;
import d3.f;
import d3.k;
import d3.u;
import e4.p;
import k3.w;

/* loaded from: classes.dex */
public abstract class a {
    public static void b(final Context context, final String str, final f fVar, final b bVar) {
        p.m(context, "Context cannot be null.");
        p.m(str, "AdUnitId cannot be null.");
        p.m(fVar, "AdRequest cannot be null.");
        p.m(bVar, "LoadCallback cannot be null.");
        p.e("#008 Must be called on the main UI thread.");
        ir.a(context);
        if (((Boolean) at.f6236i.e()).booleanValue()) {
            if (((Boolean) w.c().b(ir.A9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: n3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        f fVar2 = fVar;
                        try {
                            new o00(context2, str2).f(fVar2.a(), bVar);
                        } catch (IllegalStateException e5) {
                            b80.c(context2).a(e5, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new o00(context, str).f(fVar.a(), bVar);
    }

    public abstract u a();

    public abstract void c(k kVar);

    public abstract void d(boolean z10);

    public abstract void e(Activity activity);
}
