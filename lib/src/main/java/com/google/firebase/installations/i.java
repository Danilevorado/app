package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final long f21384b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f21385c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static i f21386d;

    /* renamed from: a, reason: collision with root package name */
    private final m6.a f21387a;

    private i(m6.a aVar) {
        this.f21387a = aVar;
    }

    public static i c() {
        return d(m6.b.b());
    }

    public static i d(m6.a aVar) {
        if (f21386d == null) {
            f21386d = new i(aVar);
        }
        return f21386d;
    }

    static boolean g(String str) {
        return f21385c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f21387a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(k6.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f21384b;
    }
}
