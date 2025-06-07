package o4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements x3.b {

    /* renamed from: e, reason: collision with root package name */
    private static x3.b f25740e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f25741a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25742b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f25743c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f25744d;

    l(Context context) {
        this.f25742b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f25743c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f25744d = Executors.newSingleThreadExecutor();
        this.f25741a = context;
        if (this.f25742b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f25742b = true;
    }

    static synchronized x3.b d(Context context) {
        e4.p.m(context, "Context must not be null");
        if (f25740e == null) {
            f25740e = new l(context.getApplicationContext());
        }
        return f25740e;
    }

    protected static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(Context context) throws k {
        if (g(context).edit().putLong("app_set_id_last_used_time", i4.h.d().a()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    @Override // x3.b
    public final b5.i a() {
        final b5.j jVar = new b5.j();
        this.f25744d.execute(new Runnable() { // from class: o4.h
            @Override // java.lang.Runnable
            public final void run() throws k {
                this.f25737m.e(jVar);
            }
        });
        return jVar.a();
    }

    protected final long b() {
        long j10 = g(this.f25741a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void e(b5.j jVar) throws k {
        String string = g(this.f25741a).getString("app_set_id", null);
        long jB = b();
        if (string == null || i4.h.d().a() > jB) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f25741a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f25741a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", i4.h.d().a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e5) {
                jVar.b(e5);
                return;
            }
        } else {
            try {
                h(this.f25741a);
            } catch (k e10) {
                jVar.b(e10);
                return;
            }
        }
        jVar.c(new x3.c(string, 1));
    }
}
