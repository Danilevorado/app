package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class hb {

    /* renamed from: a, reason: collision with root package name */
    long f9081a;

    /* renamed from: b, reason: collision with root package name */
    final String f9082b;

    /* renamed from: c, reason: collision with root package name */
    final String f9083c;

    /* renamed from: d, reason: collision with root package name */
    final long f9084d;

    /* renamed from: e, reason: collision with root package name */
    final long f9085e;

    /* renamed from: f, reason: collision with root package name */
    final long f9086f;

    /* renamed from: g, reason: collision with root package name */
    final long f9087g;

    /* renamed from: h, reason: collision with root package name */
    final List f9088h;

    /* JADX WARN: Illegal instructions before constructor call */
    hb(String str, w9 w9Var) {
        String str2 = w9Var.f17023b;
        long j10 = w9Var.f17024c;
        long j11 = w9Var.f17025d;
        long j12 = w9Var.f17026e;
        long j13 = w9Var.f17027f;
        List arrayList = w9Var.f17029h;
        if (arrayList == null) {
            Map map = w9Var.f17028g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new fa((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }

    private hb(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f9082b = str;
        this.f9083c = true == "".equals(str2) ? null : str2;
        this.f9084d = j10;
        this.f9085e = j11;
        this.f9086f = j12;
        this.f9087g = j13;
        this.f9088h = list;
    }

    static hb a(ib ibVar) throws IOException {
        if (kb.a(ibVar) != 538247942) {
            throw new IOException();
        }
        String strE = kb.e(ibVar);
        String strE2 = kb.e(ibVar);
        long jC = kb.c(ibVar);
        long jC2 = kb.c(ibVar);
        long jC3 = kb.c(ibVar);
        long jC4 = kb.c(ibVar);
        int iA = kb.a(ibVar);
        if (iA < 0) {
            throw new IOException("readHeaderList size=" + iA);
        }
        List listEmptyList = iA == 0 ? Collections.emptyList() : new ArrayList();
        for (int i10 = 0; i10 < iA; i10++) {
            listEmptyList.add(new fa(kb.e(ibVar).intern(), kb.e(ibVar).intern()));
        }
        return new hb(strE, strE2, jC, jC2, jC3, jC4, listEmptyList);
    }
}
