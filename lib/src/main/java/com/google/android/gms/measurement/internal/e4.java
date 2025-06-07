package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    final String f19875a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19876b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19877c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19878d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g4 f19879e;

    /* synthetic */ e4(g4 g4Var, String str, long j10, x4.i iVar) {
        this.f19879e = g4Var;
        e4.p.f("health_monitor");
        e4.p.a(j10 > 0);
        this.f19875a = "health_monitor:start";
        this.f19876b = "health_monitor:count";
        this.f19877c = "health_monitor:value";
        this.f19878d = j10;
    }

    private final long c() {
        return this.f19879e.m().getLong(this.f19875a, 0L);
    }

    private final void d() {
        this.f19879e.f();
        long jA = this.f19879e.f20269a.d().a();
        SharedPreferences.Editor editorEdit = this.f19879e.m().edit();
        editorEdit.remove(this.f19876b);
        editorEdit.remove(this.f19877c);
        editorEdit.putLong(this.f19875a, jA);
        editorEdit.apply();
    }

    public final Pair a() {
        long jAbs;
        this.f19879e.f();
        this.f19879e.f();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - this.f19879e.f20269a.d().a());
        }
        long j10 = this.f19878d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            d();
            return null;
        }
        String string = this.f19879e.m().getString(this.f19877c, null);
        long j11 = this.f19879e.m().getLong(this.f19876b, 0L);
        d();
        return (string == null || j11 <= 0) ? g4.f19919x : new Pair(string, Long.valueOf(j11));
    }

    public final void b(String str, long j10) {
        this.f19879e.f();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f19879e.m().getLong(this.f19876b, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = this.f19879e.m().edit();
            editorEdit.putString(this.f19877c, str);
            editorEdit.putLong(this.f19876b, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.f19879e.f20269a.N().s().nextLong();
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = this.f19879e.m().edit();
        if ((Long.MAX_VALUE & jNextLong) < j13) {
            editorEdit2.putString(this.f19877c, str);
        }
        editorEdit2.putLong(this.f19876b, j12);
        editorEdit2.apply();
    }
}
