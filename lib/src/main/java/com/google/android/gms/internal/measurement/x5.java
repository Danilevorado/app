package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x5 implements c6 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f19388h = new q.a();

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f19389i = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f19390a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f19391b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f19392c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentObserver f19393d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f19394e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Map f19395f;

    /* renamed from: g, reason: collision with root package name */
    private final List f19396g;

    private x5(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        w5 w5Var = new w5(this, null);
        this.f19393d = w5Var;
        this.f19394e = new Object();
        this.f19396g = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f19390a = contentResolver;
        this.f19391b = uri;
        this.f19392c = runnable;
        contentResolver.registerContentObserver(uri, false, w5Var);
    }

    public static x5 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        x5 x5Var;
        synchronized (x5.class) {
            Map map = f19388h;
            x5Var = (x5) map.get(uri);
            if (x5Var == null) {
                try {
                    x5 x5Var2 = new x5(contentResolver, uri, runnable);
                    try {
                        map.put(uri, x5Var2);
                    } catch (SecurityException unused) {
                    }
                    x5Var = x5Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return x5Var;
    }

    static synchronized void d() {
        for (x5 x5Var : f19388h.values()) {
            x5Var.f19390a.unregisterContentObserver(x5Var.f19393d);
        }
        f19388h.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map b() {
        Map map;
        Map map2;
        Map map3 = this.f19395f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f19394e) {
                Map map5 = this.f19395f;
                map = map5;
                if (map5 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (Map) a6.a(new b6() { // from class: com.google.android.gms.internal.measurement.v5
                                @Override // com.google.android.gms.internal.measurement.b6
                                public final Object a() {
                                    return this.f19369a.c();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map2 = null;
                        }
                        this.f19395f = map2;
                        threadPolicyAllowThreadDiskReads = map2;
                        map = threadPolicyAllowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
            map4 = map;
        }
        return map4 != null ? map4 : Collections.emptyMap();
    }

    final /* synthetic */ Map c() {
        Cursor cursorQuery = this.f19390a.query(this.f19391b, f19389i, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new q.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }

    public final void e() {
        synchronized (this.f19394e) {
            this.f19395f = null;
            this.f19392c.run();
        }
        synchronized (this) {
            Iterator it = this.f19396g.iterator();
            while (it.hasNext()) {
                ((y5) it.next()).a();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final /* bridge */ /* synthetic */ Object x(String str) {
        return (String) b().get(str);
    }
}
