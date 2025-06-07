package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class w1 extends y1 {

    /* renamed from: b, reason: collision with root package name */
    private long f16931b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f16932c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f16933d;

    public w1() {
        super(new j());
        this.f16931b = -9223372036854775807L;
        this.f16932c = new long[0];
        this.f16933d = new long[0];
    }

    private static Double g(jm2 jm2Var) {
        return Double.valueOf(Double.longBitsToDouble(jm2Var.z()));
    }

    private static Object h(jm2 jm2Var, int i10) {
        if (i10 == 0) {
            return g(jm2Var);
        }
        if (i10 == 1) {
            return Boolean.valueOf(jm2Var.s() == 1);
        }
        if (i10 == 2) {
            return i(jm2Var);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return j(jm2Var);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) g(jm2Var).doubleValue());
                jm2Var.g(2);
                return date;
            }
            int iV = jm2Var.v();
            ArrayList arrayList = new ArrayList(iV);
            for (int i11 = 0; i11 < iV; i11++) {
                Object objH = h(jm2Var, jm2Var.s());
                if (objH != null) {
                    arrayList.add(objH);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strI = i(jm2Var);
            int iS = jm2Var.s();
            if (iS == 9) {
                return map;
            }
            Object objH2 = h(jm2Var, iS);
            if (objH2 != null) {
                map.put(strI, objH2);
            }
        }
    }

    private static String i(jm2 jm2Var) {
        int iW = jm2Var.w();
        int iK = jm2Var.k();
        jm2Var.g(iW);
        return new String(jm2Var.h(), iK, iW);
    }

    private static HashMap j(jm2 jm2Var) {
        int iV = jm2Var.v();
        HashMap map = new HashMap(iV);
        for (int i10 = 0; i10 < iV; i10++) {
            String strI = i(jm2Var);
            Object objH = h(jm2Var, jm2Var.s());
            if (objH != null) {
                map.put(strI, objH);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.y1
    protected final boolean a(jm2 jm2Var) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y1
    protected final boolean b(jm2 jm2Var, long j10) {
        if (jm2Var.s() != 2 || !"onMetaData".equals(i(jm2Var)) || jm2Var.i() == 0 || jm2Var.s() != 8) {
            return false;
        }
        HashMap mapJ = j(jm2Var);
        Object obj = mapJ.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f16931b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapJ.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f16932c = new long[size];
                this.f16933d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f16932c = new long[0];
                        this.f16933d = new long[0];
                        break;
                    }
                    this.f16932c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f16933d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.f16931b;
    }

    public final long[] e() {
        return this.f16933d;
    }

    public final long[] f() {
        return this.f16932c;
    }
}
