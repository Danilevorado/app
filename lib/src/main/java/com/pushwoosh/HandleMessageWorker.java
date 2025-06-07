package com.pushwoosh;

import android.content.Context;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import k9.g;
import ka.e;

/* loaded from: classes.dex */
public class HandleMessageWorker extends Worker {
    public HandleMessageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private c.a a() {
        return getRunAttemptCount() < 2 ? c.a.b() : c.a.c();
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        long jK = getInputData().k("data_push_bundle_id", -1L);
        if (jK == -1) {
            return a();
        }
        try {
            Bundle bundleX = e.e().x(jK);
            if (bundleX == null) {
                return a();
            }
            e.e().f(jK);
            g.e(bundleX);
            return c.a.c();
        } catch (Exception unused) {
            return a();
        }
    }
}
