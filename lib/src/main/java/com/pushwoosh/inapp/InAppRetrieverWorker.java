package com.pushwoosh.inapp;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import m9.h;
import y7.b;

/* loaded from: classes2.dex */
public class InAppRetrieverWorker extends Worker {
    public InAppRetrieverWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static void a() {
        h hVarC = b.c();
        if (hVarC == null) {
            return;
        }
        hVarC.r();
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        a();
        return c.a.c();
    }
}
