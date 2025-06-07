package h1;

import android.os.Build;
import androidx.work.b;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {
    public static final g1.v a(g1.v vVar) throws Throwable {
        rb.h.e(vVar, "workSpec");
        b1.b bVar = vVar.f23748j;
        String str = vVar.f23741c;
        if (rb.h.a(str, ConstraintTrackingWorker.class.getName())) {
            return vVar;
        }
        if (!bVar.f() && !bVar.i()) {
            return vVar;
        }
        androidx.work.b bVarA = new b.a().c(vVar.f23743e).h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        rb.h.d(bVarA, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        rb.h.d(name, "name");
        return vVar.d((1048555 & 1) != 0 ? vVar.f23739a : null, (1048555 & 2) != 0 ? vVar.f23740b : null, (1048555 & 4) != 0 ? vVar.f23741c : name, (1048555 & 8) != 0 ? vVar.f23742d : null, (1048555 & 16) != 0 ? vVar.f23743e : bVarA, (1048555 & 32) != 0 ? vVar.f23744f : null, (1048555 & 64) != 0 ? vVar.f23745g : 0L, (1048555 & 128) != 0 ? vVar.f23746h : 0L, (1048555 & 256) != 0 ? vVar.f23747i : 0L, (1048555 & 512) != 0 ? vVar.f23748j : null, (1048555 & 1024) != 0 ? vVar.f23749k : 0, (1048555 & 2048) != 0 ? vVar.f23750l : null, (1048555 & 4096) != 0 ? vVar.f23751m : 0L, (1048555 & 8192) != 0 ? vVar.f23752n : 0L, (1048555 & 16384) != 0 ? vVar.f23753o : 0L, (1048555 & 32768) != 0 ? vVar.f23754p : 0L, (1048555 & 65536) != 0 ? vVar.f23755q : false, (131072 & 1048555) != 0 ? vVar.f23756r : null, (1048555 & 262144) != 0 ? vVar.f23757s : 0, (1048555 & 524288) != 0 ? vVar.f23758t : 0);
    }

    public static final g1.v b(List list, g1.v vVar) {
        rb.h.e(list, "schedulers");
        rb.h.e(vVar, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? a(vVar) : vVar;
    }
}
