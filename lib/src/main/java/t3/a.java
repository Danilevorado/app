package t3;

import android.content.Context;
import com.google.android.gms.internal.ads.at;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.oe0;
import com.google.android.gms.internal.ads.v70;
import d3.f;
import k3.b3;
import k3.w;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final b3 f27336a;

    public a(b3 b3Var) {
        this.f27336a = b3Var;
    }

    public static void a(final Context context, final d3.b bVar, final f fVar, final b bVar2) {
        ir.a(context);
        if (((Boolean) at.f6238k.e()).booleanValue()) {
            if (((Boolean) w.c().b(ir.A9)).booleanValue()) {
                oe0.f13173b.execute(new Runnable() { // from class: t3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        d3.b bVar3 = bVar;
                        f fVar2 = fVar;
                        new v70(context2, bVar3, fVar2 == null ? null : fVar2.a()).b(bVar2);
                    }
                });
                return;
            }
        }
        new v70(context, bVar, fVar == null ? null : fVar.a()).b(bVar2);
    }

    public String b() {
        return this.f27336a.a();
    }
}
