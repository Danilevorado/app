package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import c4.i;
import com.google.android.gms.common.api.GoogleApiClient;
import e4.c;
import e4.j;
import e4.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0091a f5604a;

    /* renamed from: b, reason: collision with root package name */
    private final g f5605b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5606c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0091a extends e {
        public f c(Context context, Looper looper, e4.e eVar, Object obj, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
            return d(context, looper, eVar, obj, bVar, cVar);
        }

        public f d(Context context, Looper looper, e4.e eVar, Object obj, d4.d dVar, d4.g gVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final C0092a f5607a = new C0092a(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public static final class C0092a implements d {
            /* synthetic */ C0092a(i iVar) {
            }
        }
    }

    public static abstract class e {
        public List a(Object obj) {
            return Collections.emptyList();
        }

        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        boolean a();

        void b(c.e eVar);

        boolean c();

        Set d();

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        void f(String str);

        boolean g();

        int h();

        boolean i();

        void j(c.InterfaceC0124c interfaceC0124c);

        b4.d[] k();

        String l();

        String o();

        void p(j jVar, Set set);

        void q();

        Intent r();

        boolean s();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0091a abstractC0091a, g gVar) {
        p.m(abstractC0091a, "Cannot construct an Api with a null ClientBuilder");
        p.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f5606c = str;
        this.f5604a = abstractC0091a;
        this.f5605b = gVar;
    }

    public final AbstractC0091a a() {
        return this.f5604a;
    }

    public final c b() {
        return this.f5605b;
    }

    public final e c() {
        return this.f5604a;
    }

    public final String d() {
        return this.f5606c;
    }
}
