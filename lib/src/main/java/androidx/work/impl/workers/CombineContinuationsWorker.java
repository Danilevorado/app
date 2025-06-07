package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import rb.h;

/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.e(context, "context");
        h.e(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        c.a aVarD = c.a.d(getInputData());
        h.d(aVarD, "success(inputData)");
        return aVarD;
    }
}
