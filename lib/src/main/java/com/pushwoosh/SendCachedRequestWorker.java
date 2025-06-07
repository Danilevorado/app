package com.pushwoosh;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import b9.e;
import b9.g;
import va.b;

/* loaded from: classes.dex */
public class SendCachedRequestWorker extends Worker {
    public SendCachedRequestWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private c.a a() {
        return getRunAttemptCount() >= 3 ? c.a.c() : c.a.b();
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        b bVarG;
        g gVarC;
        e eVarA;
        long jK = getInputData().k("data_cached_request_id", -1L);
        if (jK != -1 && (gVarC = (bVarG = ka.e.g()).c(jK)) != null && (eVarA = b9.b.a()) != null) {
            o8.b bVarD = eVarA.d(gVarC);
            if (!bVarD.f() && (bVarD.e() instanceof va.a)) {
                return a();
            }
            bVarG.g(gVarC.k());
            return c.a.c();
        }
        return a();
    }
}
