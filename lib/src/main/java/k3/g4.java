package k3;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.se0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static final g4 f24647a = new g4();

    protected g4() {
    }

    public final c4 a(Context context, t2 t2Var) {
        Context context2;
        List listUnmodifiableList;
        String strS;
        Date dateL = t2Var.l();
        long time = dateL != null ? dateL.getTime() : -1L;
        String strI = t2Var.i();
        int iA = t2Var.a();
        Set setO = t2Var.o();
        if (setO.isEmpty()) {
            context2 = context;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(setO));
            context2 = context;
        }
        boolean zQ = t2Var.q(context2);
        Bundle bundleE = t2Var.e(AdMobAdapter.class);
        String strJ = t2Var.j();
        t2Var.g();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            t.b();
            strS = se0.s(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strS = null;
        }
        boolean zP = t2Var.p();
        d3.t tVarA = y2.b().a();
        return new c4(8, time, bundleE, iA, listUnmodifiableList, zQ, Math.max(t2Var.c(), tVarA.b()), false, strJ, null, null, strI, t2Var.f(), t2Var.d(), Collections.unmodifiableList(new ArrayList(t2Var.n())), t2Var.k(), strS, zP, null, Math.max(-1, tVarA.c()), (String) Collections.max(Arrays.asList(null, tVarA.a()), new Comparator() { // from class: k3.f4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = d3.t.f22869e;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), t2Var.m(), t2Var.b(), t2Var.h());
    }
}
