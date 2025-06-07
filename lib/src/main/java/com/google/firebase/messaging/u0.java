package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class u0 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21576a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21577b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21578c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f21580e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque f21579d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f21581f = false;

    private u0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f21576a = sharedPreferences;
        this.f21577b = str;
        this.f21578c = str2;
        this.f21580e = executor;
    }

    private boolean b(boolean z10) {
        if (z10 && !this.f21581f) {
            i();
        }
        return z10;
    }

    static u0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        u0 u0Var = new u0(sharedPreferences, str, str2, executor);
        u0Var.d();
        return u0Var;
    }

    private void d() {
        synchronized (this.f21579d) {
            this.f21579d.clear();
            String string = this.f21576a.getString(this.f21577b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f21578c)) {
                String[] strArrSplit = string.split(this.f21578c, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f21579d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f21579d) {
            this.f21576a.edit().putString(this.f21577b, g()).commit();
        }
    }

    private void i() {
        this.f21580e.execute(new Runnable() { // from class: com.google.firebase.messaging.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21574m.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.f21579d) {
            str = (String) this.f21579d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f21579d) {
            zB = b(this.f21579d.remove(obj));
        }
        return zB;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f21579d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f21578c);
        }
        return sb2.toString();
    }
}
