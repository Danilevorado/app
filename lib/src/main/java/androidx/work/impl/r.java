package androidx.work.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class r extends r0.b {

    /* renamed from: c, reason: collision with root package name */
    private final Context f4240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10, int i11) {
        super(i10, i11);
        rb.h.e(context, "mContext");
        this.f4240c = context;
    }

    @Override // r0.b
    public void a(u0.g gVar) {
        rb.h.e(gVar, "database");
        if (this.f26428b >= 10) {
            gVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f4240c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
