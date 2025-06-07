package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class qd3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f14247a = Logger.getLogger(qd3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f14248b = new AtomicReference(new pc3());

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f14249c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f14250d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap f14251e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap f14252f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f14253g = 0;

    static zb3 a(String str) throws GeneralSecurityException {
        String strValueOf;
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap concurrentMap = f14251e;
        Locale locale = Locale.US;
        zb3 zb3Var = (zb3) concurrentMap.get(str.toLowerCase(locale));
        if (zb3Var != null) {
            return zb3Var;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strConcat = String.valueOf(strConcat).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call DeterministicAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call StreamingAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call HybridConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call MacConfig.register().";
        } else {
            if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                if (str.toLowerCase(locale).startsWith("tink")) {
                    strValueOf = String.valueOf(strConcat);
                    str2 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(strConcat);
            }
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call SignatureConfig.register().";
        }
        strConcat = strValueOf.concat(str2);
        throw new GeneralSecurityException(strConcat);
    }

    public static hc3 b(String str) {
        return ((pc3) f14248b.get()).b(str);
    }

    public static synchronized ns3 c(ss3 ss3Var) {
        hc3 hc3VarB;
        hc3VarB = b(ss3Var.P());
        if (!((Boolean) f14250d.get(ss3Var.P())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(ss3Var.P())));
        }
        return hc3VarB.f(ss3Var.O());
    }

    public static synchronized jz3 d(ss3 ss3Var) {
        hc3 hc3VarB;
        hc3VarB = b(ss3Var.P());
        if (!((Boolean) f14250d.get(ss3Var.P())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(ss3Var.P())));
        }
        return hc3VarB.c(ss3Var.O());
    }

    public static Class e(Class cls) {
        try {
            return nk3.a().b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object f(String str, ww3 ww3Var, Class cls) {
        return ((pc3) f14248b.get()).a(str, cls).a(ww3Var);
    }

    public static Object g(String str, jz3 jz3Var, Class cls) {
        return ((pc3) f14248b.get()).a(str, cls).b(jz3Var);
    }

    static synchronized Map h() {
        return Collections.unmodifiableMap(f14252f);
    }

    public static synchronized void i(il3 il3Var, dk3 dk3Var, boolean z10) {
        AtomicReference atomicReference = f14248b;
        pc3 pc3Var = new pc3((pc3) atomicReference.get());
        pc3Var.c(il3Var, dk3Var);
        Map mapC = il3Var.a().c();
        String strD = il3Var.d();
        m(strD, mapC, true);
        String strD2 = dk3Var.d();
        m(strD2, Collections.emptyMap(), false);
        if (!((pc3) atomicReference.get()).f(strD)) {
            f14249c.put(strD, new pd3(il3Var));
            n(il3Var.d(), il3Var.a().c());
        }
        ConcurrentMap concurrentMap = f14250d;
        concurrentMap.put(strD, Boolean.TRUE);
        concurrentMap.put(strD2, Boolean.FALSE);
        atomicReference.set(pc3Var);
    }

    public static synchronized void j(hc3 hc3Var, boolean z10) {
        try {
            if (hc3Var == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = f14248b;
            pc3 pc3Var = new pc3((pc3) atomicReference.get());
            pc3Var.d(hc3Var);
            if (!yh3.a(1)) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            String strE = hc3Var.e();
            m(strE, Collections.emptyMap(), z10);
            f14250d.put(strE, Boolean.valueOf(z10));
            atomicReference.set(pc3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void k(dk3 dk3Var, boolean z10) {
        AtomicReference atomicReference = f14248b;
        pc3 pc3Var = new pc3((pc3) atomicReference.get());
        pc3Var.e(dk3Var);
        Map mapC = dk3Var.a().c();
        String strD = dk3Var.d();
        m(strD, mapC, true);
        if (!((pc3) atomicReference.get()).f(strD)) {
            f14249c.put(strD, new pd3(dk3Var));
            n(strD, dk3Var.a().c());
        }
        f14250d.put(strD, Boolean.TRUE);
        atomicReference.set(pc3Var);
    }

    public static synchronized void l(nd3 nd3Var) {
        nk3.a().f(nd3Var);
    }

    private static synchronized void m(String str, Map map, boolean z10) {
        if (z10) {
            ConcurrentMap concurrentMap = f14250d;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((pc3) f14248b.get()).f(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f14252f.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f14252f.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.jz3, java.lang.Object] */
    private static void n(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f14252f.put((String) entry.getKey(), rc3.e(str, ((bk3) entry.getValue()).f6525a.x(), ((bk3) entry.getValue()).f6526b));
        }
    }
}
