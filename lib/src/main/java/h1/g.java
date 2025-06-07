package h1;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f24007a;

    public g(WorkDatabase workDatabase) {
        rb.h.e(workDatabase, "workDatabase");
        this.f24007a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(g gVar) {
        rb.h.e(gVar, "this$0");
        return Integer.valueOf(h.d(gVar.f24007a, "next_alarm_manager_id"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(g gVar, int i10, int i11) {
        rb.h.e(gVar, "this$0");
        int iD = h.d(gVar.f24007a, "next_job_scheduler_id");
        boolean z10 = false;
        if (i10 <= iD && iD <= i11) {
            z10 = true;
        }
        if (z10) {
            i10 = iD;
        } else {
            h.e(gVar.f24007a, "next_job_scheduler_id", i10 + 1);
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object objA = this.f24007a.A(new Callable() { // from class: h1.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.d(this.f24003a);
            }
        });
        rb.h.d(objA, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) objA).intValue();
    }

    public final int e(final int i10, final int i11) {
        Object objA = this.f24007a.A(new Callable() { // from class: h1.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.f(this.f24004a, i10, i11);
            }
        });
        rb.h.d(objA, "workDatabase.runInTransa…            id\n        })");
        return ((Number) objA).intValue();
    }
}
