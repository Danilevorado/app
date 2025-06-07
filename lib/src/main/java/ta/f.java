package ta;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: classes2.dex */
class f implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f27399a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f27400b;

    f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, WeakReference weakReference) {
        this.f27399a = uncaughtExceptionHandler;
        this.f27400b = weakReference;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b1 -> B:40:0x00b4). Please report as a decompilation issue!!! */
    public void a(Throwable th) throws Throwable {
        WeakReference weakReference = this.f27400b;
        BufferedWriter bufferedWriter = null;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context == null) {
            k9.h.k("Failed to save exception: context in CrashManager is null");
            return;
        }
        String string = UUID.randomUUID().toString();
        try {
        } catch (IOException e5) {
            k9.h.n("Error saving crash report!", e5);
        }
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(new File(g.a(context), string + g.b())));
                try {
                    bufferedWriter2.write(e.d(th, a.a(), a.c(), a.b(), a.d(), a.e()).toString());
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                } catch (IOException e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    k9.h.k("Failed to save exception:\n" + e.getMessage());
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } catch (JSONException e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    k9.h.k("Failed to save exception:\n" + e.getMessage());
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e12) {
                            k9.h.n("Error saving crash report!", e12);
                        }
                    }
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (JSONException e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    boolean b(Context context, Throwable th) {
        String packageName = context.getPackageName();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            String className = stackTraceElement.getClassName();
            Iterator it = a.f27393a.iterator();
            while (it.hasNext()) {
                if (className.contains((String) it.next())) {
                    return true;
                }
            }
            if (className.contains(packageName)) {
                return false;
            }
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws Throwable {
        WeakReference weakReference = this.f27400b;
        Context context = weakReference != null ? (Context) weakReference.get() : null;
        if (context != null && g.a(context) != null) {
            StringBuilder sb2 = new StringBuilder();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb2.append(stackTraceElement.getClassName());
            }
            String string = sb2.toString();
            if (b(context, th)) {
                Iterator it = a.f27393a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (string.contains((String) it.next())) {
                            a(th);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f27399a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
