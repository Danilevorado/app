package h1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f24009a;

    public m(WorkDatabase workDatabase) {
        this.f24009a = workDatabase;
    }

    public static void c(Context context, u0.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.j();
            try {
                gVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                gVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                gVar.H();
            } finally {
                gVar.i();
            }
        }
    }

    public long a() {
        Long lA = this.f24009a.F().a("last_force_stop_ms");
        if (lA != null) {
            return lA.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lA = this.f24009a.F().a("reschedule_needed");
        return lA != null && lA.longValue() == 1;
    }

    public void d(long j10) {
        this.f24009a.F().b(new g1.d("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f24009a.F().b(new g1.d("reschedule_needed", z10));
    }
}
