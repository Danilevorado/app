package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class hn1 {

    /* renamed from: e, reason: collision with root package name */
    private final String f9234e;

    /* renamed from: f, reason: collision with root package name */
    private final dn1 f9235f;

    /* renamed from: b, reason: collision with root package name */
    private final List f9231b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f9232c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9233d = false;

    /* renamed from: a, reason: collision with root package name */
    private final m3.p1 f9230a = j3.t.q().h();

    public hn1(String str, dn1 dn1Var) {
        this.f9234e = str;
        this.f9235f = dn1Var;
    }

    private final Map g() {
        Map mapF = this.f9235f.f();
        mapF.put("tms", Long.toString(j3.t.b().b(), 10));
        mapF.put("tid", this.f9230a.S() ? "" : this.f9234e);
        return mapF;
    }

    public final synchronized void a(String str) {
        if (((Boolean) k3.w.c().b(ir.R1)).booleanValue()) {
            if (!((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "aaia");
                mapG.put("aair", "MalformedJson");
                this.f9231b.add(mapG);
            }
        }
    }

    public final synchronized void b(String str, String str2) {
        if (((Boolean) k3.w.c().b(ir.R1)).booleanValue()) {
            if (!((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_finished");
                mapG.put("ancn", str);
                mapG.put("rqe", str2);
                this.f9231b.add(mapG);
            }
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) k3.w.c().b(ir.R1)).booleanValue()) {
            if (!((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_started");
                mapG.put("ancn", str);
                this.f9231b.add(mapG);
            }
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) k3.w.c().b(ir.R1)).booleanValue()) {
            if (!((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_finished");
                mapG.put("ancn", str);
                this.f9231b.add(mapG);
            }
        }
    }

    public final synchronized void e() {
        if (((Boolean) k3.w.c().b(ir.R1)).booleanValue()) {
            if (!((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
                if (this.f9233d) {
                    return;
                }
                Map mapG = g();
                mapG.put("action", "init_finished");
                this.f9231b.add(mapG);
                Iterator it = this.f9231b.iterator();
                while (it.hasNext()) {
                    this.f9235f.e((Map) it.next());
                }
                this.f9233d = true;
            }
        }
    }

    public final synchronized void f() {
        if (((Boolean) k3.w.c().b(ir.R1)).booleanValue()) {
            if (!((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
                if (this.f9232c) {
                    return;
                }
                Map mapG = g();
                mapG.put("action", "init_started");
                this.f9231b.add(mapG);
                this.f9232c = true;
            }
        }
    }
}
