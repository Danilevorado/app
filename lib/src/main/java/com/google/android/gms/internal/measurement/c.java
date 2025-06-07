package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private b f18864a;

    /* renamed from: b, reason: collision with root package name */
    private b f18865b;

    /* renamed from: c, reason: collision with root package name */
    private final List f18866c;

    public c() {
        this.f18864a = new b("", 0L, null);
        this.f18865b = new b("", 0L, null);
        this.f18866c = new ArrayList();
    }

    public c(b bVar) {
        this.f18864a = bVar;
        this.f18865b = bVar.clone();
        this.f18866c = new ArrayList();
    }

    public final b a() {
        return this.f18864a;
    }

    public final b b() {
        return this.f18865b;
    }

    public final List c() {
        return this.f18866c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        c cVar = new c(this.f18864a.clone());
        Iterator it = this.f18866c.iterator();
        while (it.hasNext()) {
            cVar.f18866c.add(((b) it.next()).clone());
        }
        return cVar;
    }

    public final void d(b bVar) {
        this.f18864a = bVar;
        this.f18865b = bVar.clone();
        this.f18866c.clear();
    }

    public final void e(String str, long j10, Map map) {
        this.f18866c.add(new b(str, j10, map));
    }

    public final void f(b bVar) {
        this.f18865b = bVar;
    }
}
