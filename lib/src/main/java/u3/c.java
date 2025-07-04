package u3;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.at;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.db0;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.oe0;
import com.google.android.gms.internal.ads.ze0;
import d3.f;
import d3.u;
import e4.p;
import k3.w;

/* loaded from: classes.dex */
public abstract class c {
    public static void b(final Context context, final String str, final f fVar, final d dVar) {
        p.m(context, "Context cannot be null.");
        p.m(str, "AdUnitId cannot be null.");
        p.m(fVar, "AdRequest cannot be null.");
        p.m(dVar, "LoadCallback cannot be null.");
        p.e("#008 Must be called on the main UI thread.");
        ir.a(context);
        if (((Boolean) at.f6239l.e()).booleanValue()) {
            if (((Boolean) w.c().b(ir.A9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: u3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        f fVar2 = fVar;
                        try {
                            new db0(context2, str2).d(fVar2.a(), dVar);
                        } catch (IllegalStateException e5) {
                            b80.c(context2).a(e5, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        ze0.b("Loading on UI thread");
        new db0(context, str).d(fVar.a(), dVar);
    }

    public abstract u a();

    public abstract void c(Activity activity, d3.p pVar);
}
