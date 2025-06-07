package androidx.work.impl;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class b implements r0.a {
    @Override // r0.a
    public void a(u0.g gVar) {
        rb.h.e(gVar, "db");
        gVar.p("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.K("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
