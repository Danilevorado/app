package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4241a = b1.j.i("Schedulers");

    static s a(Context context, e0 e0Var) {
        androidx.work.impl.background.systemjob.b bVar = new androidx.work.impl.background.systemjob.b(context, e0Var);
        h1.l.a(context, SystemJobService.class, true);
        b1.j.e().a(f4241a, "Created SystemJobScheduler and enabled SystemJobService");
        return bVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        g1.w wVarJ = workDatabase.J();
        workDatabase.e();
        try {
            List listK = wVarJ.k(aVar.h());
            List listT = wVarJ.t(200);
            if (listK != null && listK.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    wVarJ.f(((g1.v) it.next()).f23739a, jCurrentTimeMillis);
                }
            }
            workDatabase.B();
            if (listK != null && listK.size() > 0) {
                g1.v[] vVarArr = (g1.v[]) listK.toArray(new g1.v[listK.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    s sVar = (s) it2.next();
                    if (sVar.f()) {
                        sVar.b(vVarArr);
                    }
                }
            }
            if (listT == null || listT.size() <= 0) {
                return;
            }
            g1.v[] vVarArr2 = (g1.v[]) listT.toArray(new g1.v[listT.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                s sVar2 = (s) it3.next();
                if (!sVar2.f()) {
                    sVar2.b(vVarArr2);
                }
            }
        } finally {
            workDatabase.i();
        }
    }
}
