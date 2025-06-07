package m3;

import android.content.Context;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.db;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.kb;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.xa;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class y extends db {

    /* renamed from: d, reason: collision with root package name */
    private final Context f25350d;

    private y(Context context, cb cbVar) {
        super(cbVar);
        this.f25350d = context;
    }

    public static ra b(Context context) {
        ra raVar = new ra(new kb(new File(context.getCacheDir(), "admob_volley"), 20971520), new y(context, new qb(null, null)), 4);
        raVar.d();
        return raVar;
    }

    @Override // com.google.android.gms.internal.ads.db, com.google.android.gms.internal.ads.ga
    public final ja a(oa oaVar) throws xa {
        if (oaVar.a() == 0) {
            if (Pattern.matches((String) k3.w.c().b(ir.f9919d4), oaVar.p())) {
                k3.t.b();
                if (se0.u(this.f25350d, 13400000)) {
                    ja jaVarA = new sz(this.f25350d).a(oaVar);
                    if (jaVarA != null) {
                        n1.k("Got gmscore asset response: ".concat(String.valueOf(oaVar.p())));
                        return jaVarA;
                    }
                    n1.k("Failed to get gmscore asset response: ".concat(String.valueOf(oaVar.p())));
                }
            }
        }
        return super.a(oaVar);
    }
}
