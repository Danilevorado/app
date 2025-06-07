package b1;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4386a = j.i("WorkerFactory");

    class a extends w {
        a() {
        }

        @Override // b1.w
        public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static w c() {
        return new a();
    }

    public abstract androidx.work.c a(Context context, String str, WorkerParameters workerParameters);

    public final androidx.work.c b(Context context, String str, WorkerParameters workerParameters) {
        androidx.work.c cVarA = a(context, str, workerParameters);
        if (cVarA == null) {
            Class clsAsSubclass = null;
            try {
                clsAsSubclass = Class.forName(str).asSubclass(androidx.work.c.class);
            } catch (Throwable th) {
                j.e().d(f4386a, "Invalid class: " + str, th);
            }
            if (clsAsSubclass != null) {
                try {
                    cVarA = (androidx.work.c) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    j.e().d(f4386a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (cVarA == null || !cVarA.isUsed()) {
            return cVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
